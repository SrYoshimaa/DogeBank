import java.util.Scanner;

public class Transacao {

    public static Scanner in;
    public static float Saldo = 0;
    public static int novaTransacao;
    public static Login lg = new Login();
    public String Creditos = "";
    public void Start(){

        System.out.println("            ░░░░░░░░░▄░░░░░░░░░░░░░░▄░░░░");
        System.out.println("            ░░░░░░░░▌▒█░░░░░░░░░░░▄▀▒▌░░░░");
        System.out.println("            ░░░░░░░░▌▒▒█░░░░░░░░▄▀▒▒▒▐░░░");
        System.out.println("            ░░░░░░░▐▄▀▒▒▀▀▀▀▄▄▄▀▒▒▒▒▒▐░░░");
        System.out.println("            ░░░░░▄▄▀▒░▒▒▒▒▒▒▒▒▒█▒▒▄█▒▐░░░");
        System.out.println("            ░░░▄▀▒▒▒░░░▒▒▒░░░▒▒▒▀██▀▒▌░░░");
        System.out.println("            ░░▐▒▒▒▄▄▒▒▒▒░░░▒▒▒▒▒▒▒▀▄▒▒▌░░");
        System.out.println("            ░░▌░░▌█▀▒▒▒▒▒▄▀█▄▒▒▒▒▒▒▒█▒▐░░░");
        System.out.println("            ░▐░░░▒▒▒▒▒▒▒▒▌██▀▒▒░░░▒▒▒▀▄▌░░");
        System.out.println("            ░▌░▒▄██▄▒▒▒▒▒▒▒▒▒░░░░░░▒▒▒▒▌░░");
        System.out.println("            ▀▒▀▐▄█▄█▌▄░▀▒▒░░░░░░░░░░▒▒▒▐░░");
        System.out.println("            ▐▒▒▐▀▐▀▒░▄▄▒▄▒▒▒▒▒▒░▒░▒░▒▒▒▒▌░");
        System.out.println("            ▐▒▒▒▀▀▄▄▒▒▒▄▒▒▒▒▒▒▒▒░▒░▒░▒▒▐░");
        System.out.println("            ░▌▒▒▒▒▒▒▀▀▀▒▒▒▒▒▒░▒░▒░▒░▒▒▒▌░░");
        System.out.println("            ░▐▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▒▄▒▒▐░░");
        System.out.println("            ░░▀▄▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▒▄▒▒▒▒▌░░░");
        System.out.println("            ░░░░▀▄▒▒▒▒▒▒▒▒▒▒▄▄▄▀▒▒▒▒▄▀░░░░");
        System.out.println("            ░░░░░░▀▄▄▄▄▄▄▀▀▀▒▒▒▒▒▄▄▀░░░░░░");
        System.out.println("            ░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▀▀░░░░░░░░");
        System.out.println();
        System.out.println(Creditos+"\n");
        System.out.println("Seja bem vindo ao DogeBank\n");

    }



    public static void iniTransacao(){
        in = new Scanner(System.in);
        int Escolha;

        System.out.println("Seleciona uma opção a baixo:");
        System.out.println("1. Sacar");
        System.out.println("2. Depositar");
        System.out.println("3. Saldo");

        Escolha = in.nextInt();

        switch(Escolha){
            case 1:
                if(lg.Entrou()){
                    float Quantidade;
                    System.out.println("Informe a quatidade a sacar: ");

                    Quantidade = in.nextFloat();
                    if(Quantidade > Saldo || Quantidade == 0){
                        System.out.println("Saldo insifuciente\n");
                        novaTransacao();
                    } else{
                        Saldo = Saldo - Quantidade;
                        System.out.println("Voce sacou " +Quantidade+" e seu saldo é " +Saldo+"\n");
                        novaTransacao();
                    }
                }else{
                    iniTransacao();
                }

            break;

            case 2:
                if(lg.Entrou()){
                    float Depositar;
                    System.out.println("Digitar a quantidade que você quer depositar: ");
                    Depositar = in.nextFloat();
                    Saldo = Depositar + Saldo;
                    System.out.println("Voçe depositou "+Depositar+" e seu saldo é "+Saldo+"\n");
                    novaTransacao();
                }else{
                    iniTransacao();
                }

            break;

            case 3:
                if(lg.Entrou()){
                    System.out.println("Seu saldo é "+Saldo+"\n");
                    novaTransacao();
                }else{
                    iniTransacao();
                }
            break;
        }
    }

    public static void novaTransacao(){
        System.out.println("Gostaria de uma nova transação?\n\nDigite 1 para outra transação\n2 para sair");
        novaTransacao = in.nextInt();
        if(novaTransacao == 1){
            iniTransacao();
        } else if(novaTransacao == 2){
            System.out.println("Obrigado por nos escolher. Até a proxima!");

        } else{
            System.out.println("Escolha inválida\n\n");
            novaTransacao();
        }
    }
}




