import java.util.Scanner;

public class exercicio7 {

    //Descreva um algoritmo que leia um número inteiro n e, dados n números reais informe o maior e o menor número.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de números: ");
        int quantidadeNumero = teclado.nextInt();

        double valorMaior = Double.MIN_VALUE;
        double valorMenor = Double.MAX_VALUE;

        for (int i = 1; i <= quantidadeNumero; i++) {
            System.out.printf("\nDigite o número %d: ", i);
            double numero = teclado.nextDouble();

            if (numero > valorMaior) {
                valorMaior = numero;
            }

            if (numero < valorMenor) {
                valorMenor = numero;
            }
        }
        System.out.printf("\nMAIOR: %.1f%nMENOR: %.1f", valorMaior, valorMenor);
        }
    }
