
import java.util.Scanner;

public class unidade2exercicio18 {
    
    public static void main(String[] args) {
        
        //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
        //Leia o comprimento e altura de uma parede (em metros) e escreva o valor gasto com a compra de azulejos. 
        //Considere que um metro quadrado é formado por 9 azulejos.

        Scanner teclado = new Scanner(System.in);

        double azulejo = 12.50;
        double metroQuadrado = (9 * azulejo);
        
        System.out.println("Informe o comprimento da parede: ");
        double comprimentoParede = teclado.nextDouble();
        System.out.println("Informe a altura da parede.....: ");
        double alturaParede = teclado.nextDouble();
        double valorTotal = (comprimentoParede * alturaParede * 9 * 12.50);
        
        System.out.printf(" ");
    }
}
