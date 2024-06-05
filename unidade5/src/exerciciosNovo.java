import java.util.Scanner;

public class exerciciosNovo {

    // 1- Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);

    //     int[] numeros = new int[20];

    //     for (int i = 0; i < 20; i++) {
    //         System.out.println("Informe um número inteiro: ");
    //         numeros[i] = teclado.nextInt();
    //     }

    //     for (int i = 0; i < 20; i++) {
    //         if (numeros[i] %2 == 0) {
    //             System.out.println(numeros[i] + " é PAR");
    //         } else {
    //             System.out.println(numeros[i] + " é ÍMPAR");
    //         }
    //     }
        
        
    //     teclado.close();
    
    //}

    
//========================================================================================================================================//

    // 2- Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

        // public static void main(String[] args) {

        //     int numerosPares = 0;
        //     int numerosImpares = 0;
            
        //     for (int i = 1; i <= 100; i++) {
        //         int numInteiro = i;
        //         if (numInteiro %2 == 0) {
        //             numerosPares += numInteiro;
        //         } else {
        //             numerosImpares += numInteiro;
        //         }

        //     }

        //     System.out.println(numerosPares);
        //     System.out.println(numerosImpares);

        // }

    

//=======================================================================================================================================//

    // 3- Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos: 
    // 1/1 + 1/2 + 1/3 ... 1/100
    
    // public static void main(String[] args) {
    //     Scanner teclado = new Scanner(System.in);    
        
    //     double soma = 0.0;

    //     for (int i = 1; i <= 100; i++) {
    //         soma += 1.0/i;
    //     }

    //     System.out.printf("A soma da série é: %f", soma);
    
    // }

//======================================================================================================================================//

    // 6- Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double somaAlturas = 0.0;

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a altura das pessoas");
            double altura = teclado.nextDouble();
            somaAlturas += altura;
        }

        double mediaAlturas = somaAlturas / 4;

        System.out.printf("A média das alturas das pessoas é: %f", mediaAlturas);

        teclado.close();

    }

}