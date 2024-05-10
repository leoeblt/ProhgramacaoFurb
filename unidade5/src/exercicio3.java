import java.util.Scanner;

public class exercicio3 {

    //Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
    //
    //1/1 + 1/2 + 1/3... + 1/100.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        double numero; 

        for (double i = 1; i <= 100; i++) {
            numero = 1/i;
            soma += numero;
        }
        System.out.printf("A soma é: %f", soma);

        teclado.close();

    }

}
