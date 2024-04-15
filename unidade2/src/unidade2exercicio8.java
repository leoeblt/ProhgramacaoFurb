
import java.util.Scanner;

public class unidade2exercicio8 {
    public static void main(String [] args) {
        
        //Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
        //o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o código da peça 1");
        int cod1 = teclado.nextInt();
        System.out.println("Informe o número de peças da peça 1");
        int num1 = teclado.nextInt();
        System.out.println("Informe o valor da peça 1");
        int val1 = teclado.nextInt();
        
        System.out.println("Informe o código da peça 2");
        int cod2 = teclado.nextInt();
        System.out.println("Informe o número de peças da peça 2");
        int num2 = teclado.nextInt();
        System.out.println("Informe o valor da peça 2");
        int val2 = teclado.nextInt();

        double valor = (num1 * val1) + (num2 * val2);
        System.out.printf("O valor a ser pago será %.2f", valor);
        
        
        
    }
    
}
