import java.util.Scanner;

public class exerciciosNovo {

    // Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

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

    //Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int numerosPares = 0;
            int numerosImpares = 0;
            
            for (int i = 1; i <= 100; i++) {
                int numInteiro = i;
                if (numInteiro %2 == 0) {
                    numerosPares += numInteiro;
                } else {
                    numerosImpares += numInteiro;
                }

            }

            System.out.println(numerosPares);
            System.out.println(numerosImpares);

            teclado.close();

        }

    }

//=======================================================================================================================================//
