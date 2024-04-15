
import java.util.Scanner;

public class unidade2exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("informe dois numeros");
        
        //Entrada
        int valor1 = teclado.nextInt();
        int valor2 = teclado.nextInt();

        //Solução
        int x = valor1 * valor2;

        //Saída
        System.out.println("PROD = " + x);
        


    }

}
