package SRC;

import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero1 = teclado.nextInt();
        float valorReal = teclado .nextFloat();
        System.out.println("o valoe inteiro é: " + numero1);
        System.out.println("O valor rela é: " + valorReal);
    }
    
}
