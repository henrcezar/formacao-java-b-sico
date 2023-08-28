import java.util.Scanner;

public class Controle {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);


        contar(n1, n2);




    }

    static void contar(int n1, int n2){
        System.out.println("Digite o primeiro número: ");
        int n1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = terminal.nextInt();
        int contagem = n2 - n1;

        if(n2 > n1){
            for(i = 0, i < contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        } else
            System.out.println("N2 deve ser maior que N1");


    }
}
