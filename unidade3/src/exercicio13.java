import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        //Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. 
        //Faça um programa para ler o comprimento e altura de uma parede (em metros), e 
        //depois escrever o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.

        Scanner teclado = new Scanner(System.in);

        double preçoAzulejo = 12.50;
        double m2 = 9 * preçoAzulejo;

        System.out.print("Considerando uma parede, informe seu comprimento em metros: ");
        int comprimento = teclado.nextInt();

        System.out.print("Agora informe a sua altura: ");
        int altura = teclado.nextInt();

        double areaParede = comprimento * altura;
        double quantidadeAzulejos = Math.ceil(areaParede*m2);
        double valor = quantidadeAzulejos * preçoAzulejo;

        System.out.printf("O valor gasto foi: R$%.2f", valor);

        teclado.close();
        
        
    }
    
}
