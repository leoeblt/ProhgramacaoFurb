package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio4 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe dois numeros");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double x = A + B / 2;
        
        System.out.printf("A soma de %d + %d / 2 é igual a: %d");

    }
    
}
