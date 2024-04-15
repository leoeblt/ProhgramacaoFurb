package SRC;

import java.util.Scanner;

public class SomaComLeitura {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int x = A + B;

        //Exemplo 1
           //System.out.println("A soma é:" + x);
        
        //Exemplo 2 concatenação
           //String.format("Asoma de %d com %d é: %d", A, B, x);  

        //Exemplo 3 concatenação
           //System.out.printf("Asoma de %d com %d é: %d%n", A, B, x);
           //System.out.println("TERMINEI!!!");
           

    }
}
