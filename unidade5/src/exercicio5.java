import java.util.Scanner;

public class exercicio5 {

    //Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:
    //8 ,10, 16, 18, 32, 34, 64...
    //O valor "n" deve ser lido e deve ser maior do que 2.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe n (n > 2): ");
        int quantidade = teclado.nextInt();
        
        int numero = 8;
        int soma = 0;

        for (int contador = 2; contador <= quantidade; contador++) {
            System.out.printf("%d, %d, ", numero, numero + 2);
            soma = soma + numero + (numero + 2);
            numero *= 2; 
        } 
    }
}
