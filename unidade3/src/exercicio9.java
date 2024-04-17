import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        
        //Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:
        //volume = PI * raio^2 * altura

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        double valorRaio = teclado.nextDouble();
        System.out.println("Informe o valor da altura: ");
        double valorAltura = teclado.nextDouble();
        double valorRaioAoQuadrado = Math.pow(valorRaio, 2);
        double volume = (Math.PI * valorRaioAoQuadrado * valorAltura);
        System.out.printf("O valor do volume da lata de óleo é de: %.2f", volume);


        

    }
    
}