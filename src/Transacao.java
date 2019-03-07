import java.util.Scanner;

public class Transacao {

    public static Scanner in;
    public static float Saldo = 0;
    public static int novaTransacao;
    public static Login lg = new Login();
    public String Creditos = "";
    public void Start(){

        MessageBox.Show("            ░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░");
        MessageBox.Show("            ░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░░");
        MessageBox.Show("            ░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░");
        MessageBox.Show("            ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░");
        MessageBox.Show("            ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░");
        MessageBox.Show("            ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░");
        MessageBox.Show("            ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░");
        MessageBox.Show("            ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░░");
        MessageBox.Show("            ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░░");
        MessageBox.Show("            ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░░");
        MessageBox.Show("            ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░░");
        MessageBox.Show("            ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌░");
        MessageBox.Show("            ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░");
        MessageBox.Show("            ░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░░");
        MessageBox.Show("            ░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░");
        MessageBox.Show("            ░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░░");
        MessageBox.Show("            ░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░░");
        MessageBox.Show("            ░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░░");
        MessageBox.Show("            ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░");
        MessageBox.Show("");
        MessageBox.Show(Creditos+"\n");
        MessageBox.Show("Seja bem vindo ao DogeBank\n");

    }



    public static void iniTransacao(){
        in = new Scanner(System.in);
        int Escolha;

        MessageBox.Show("Seleciona uma opção a baixo:");
        MessageBox.Show("1. Sacar");
        MessageBox.Show("2. Depositar");
        MessageBox.Show("3. Saldo");

        Escolha = in.nextInt();

        switch(Escolha){
            case 1:
                if(lg.Entrou()){
                    float Quantidade;
                    MessageBox.Show("Informe a quatidade a sacar: ");

                    Quantidade = in.nextFloat();
                    if(Quantidade > Saldo || Quantidade == 0){
                        MessageBox.Show("Saldo insifuciente\n");
                        novaTransacao();
                    } else{
                        Saldo = Saldo - Quantidade;
                        MessageBox.Show("Voce sacou " +Quantidade+" e seu saldo é " +Saldo+"\n");
                        novaTransacao();
                    }
                }else{
                    iniTransacao();
                }

                break;

            case 2:
                if(lg.Entrou()){
                    float Depositar;
                    MessageBox.Show("Digitar a quantidade que você quer depositar: ");
                    Depositar = in.nextFloat();
                    Saldo = Depositar + Saldo;
                    MessageBox.Show("Voçe depositou "+Depositar+" e seu saldo é "+Saldo+"\n");
                    novaTransacao();
                }else{
                    iniTransacao();
                }

                break;

            case 3:
                if(lg.Entrou()){
                    MessageBox.Show("Seu saldo é "+Saldo+"\n");
                    novaTransacao();
                }else{
                    iniTransacao();
                }
                break;

            default:
                MessageBox.Show("Opção invalida.\n");
                iniTransacao();
                break;

        }
    }

    public static void novaTransacao(){
        MessageBox.Show("Gostaria de uma nova transação?\n\nDigite 1 para outra transação\n2 para sair");
        novaTransacao = in.nextInt();
        if(novaTransacao == 1){
            iniTransacao();
        } else if(novaTransacao == 2){
            MessageBox.Show("Obrigado por nos escolher. Até a proxima!");

        } else{
            MessageBox.Show("Escolha inválida\n\n");
            novaTransacao();
        }
    }
}




