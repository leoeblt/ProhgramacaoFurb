import java.util.Scanner;

public class ExemploDoWhileTabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um número de 1 até 10: ");
        int numero = teclado.nextInt();
        System.out.println("***** USANDO FOR *****");
        for (int i = 0; i <= 10; i ++) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }
        
        System.out.println("***** USANDO WHILE *****");
        int contador = 0;
        while (contador <= 10) {
            System.out.printf("%d x %d = %d%n", numero, contador, (numero * contador++));
        }
        
        System.out.println("***** USANDO DO WHILE *****");
        contador = 0;
        do {
            System.out.printf("%d x %d = %d%n", numero, contador, (numero * contador++));
        } while (contador <= 10);
    }
}