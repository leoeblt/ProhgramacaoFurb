import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {
        
        //Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
        //Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. 
        //O peso do prato é de 750 gramas.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o peso do prato do cliente em Kg: ");
        double pesoPrato = teclado.nextDouble();
        double precoPrato = 25.00;
        double resultado = (precoPrato * pesoPrato) /1000;
        System.out.printf("O preço do prato do cliente é de: R$ %.2f", resultado);

    }
    
}
