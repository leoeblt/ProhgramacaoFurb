import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        //Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.Fórmula:
        //hipotenusa² = cateto1² * cateto²

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o comprimento do cateto 1: ");
        double cat1 = teclado.nextDouble();

        System.out.println("Informe o comprimento do cateto 2: ");
        double cat2 = teclado.nextDouble();

        double hip = Math.sqrt(cat1 * cat1 + cat2 * cat2);

        System.out.printf("O comprimento da hipotenusa Ã©: %.1f", hip);

        teclado.close();

        
    }
    
}
