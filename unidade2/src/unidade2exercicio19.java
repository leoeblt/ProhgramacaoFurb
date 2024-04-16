import java.util.Scanner;

public class unidade2exercicio19 {

    
    public static void main(String[] args) {

        //Num sistema de equações o valor de A equivale ao valor de B e o valor de C equivale ao valor de D. 
        //Leia os valores de B, C e D e calcule o valor de A.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor de B: ");
        int valorB = teclado.nextInt();
        System.out.println("Informe o valor de C: ");
        int valorC = teclado.nextInt();
        System.out.println("Informe o valor de D: ");
        int valorD = teclado.nextInt();
        int valorA = valorB;
        int resultadoC = valorD;
        System.out.printf("valor de A é igual a %d", valorA);
    
        teclado.close();

}
        
    }

