import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random generate = new Random();
        Scanner scanner = new Scanner(System.in);

//        int i = 0;
//        while(i < 6){
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            i++ ;

        String nome;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.println(nome);

        int numero;
        System.out.println("Olá " + nome + ", agora digite 6 números de  1 a 100 que você acha que vão aparecer na megasena: ");
        numero = scanner.nextInt();


        while (numero > 100 | numero < 1) {

                System.out.println("Algum desses números é inválido, escolha de 1 a 100 e tente novamente");
                numero = scanner.nextInt();
        }

        if (numero <100 | numero > 1) {
            System.out.println("esses numero são corretos");

            for (int i = 0; i < 6; i++) {
                int number = generate.nextInt(100);
                System.out.println(number);
            }
        }


    }

}
