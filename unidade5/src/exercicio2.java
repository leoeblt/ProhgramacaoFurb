import java.util.Scanner;

public class exercicio2 {

    //Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { 
                pares += i;
            } else {
                impares += i;
            }
            
        }
        System.out.printf("A soma dos pares é: %d%$n",pares);
        System.out.printf("A soma dos impares é: %d", impares);

        teclado.close();

    }

}
