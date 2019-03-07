import java.util.Scanner;

public class Login {

    public int Senha = 123456;
    public static Scanner in = new Scanner(System.in);

    public boolean Entrou(){
        int Tentativa;

        System.out.println("Digite sua senha: ");

        Tentativa = in.nextInt();

        if(ChecaSenha(Tentativa)){
            return true;
        }else{
            System.out.println("Sua senha está incorreta, refaça a operação.\n");
            return false;
        }
    }

    public boolean ChecaSenha(int A){
        if(Senha == A){
            return true;
        }else{
            return false;
        }
    }
}