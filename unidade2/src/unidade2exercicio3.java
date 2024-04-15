
import java.util.Scanner;

public class unidade2exercicio3 {
    public static void main(String [] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println ("informe dois numeros");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double x = A * B;

        System.out.printf("a multiplicação entre %d e %d^2 é igual a %d", A, B, x);

    }
}
