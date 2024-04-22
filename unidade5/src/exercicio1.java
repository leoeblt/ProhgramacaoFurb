import java.util.Scanner;

public class exercicio1 {

    //Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, 
    //se o mesmo é par ou ímpar.
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for(int i = 1; i <= 20; i++) {
            System.out.println("Informe um número: ");
            int numero = teclado.nextInt();
            if (numero % 2 == 0) {
                System.out.println("O número é par");
            } else {
                System.out.println("O número é impar");
            }
        }

        teclado.close();

    }
    
}
