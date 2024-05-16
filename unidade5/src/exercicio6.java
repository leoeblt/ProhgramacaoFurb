import java.util.Scanner;

public class exercicio6 {

    //Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double soma = 0;
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = teclado.nextDouble();
            soma += altura;
        }
        
        double media = soma / 3;
        
        System.out.printf("A média das altura é: %.2f", media);
        
        teclado.close();

    }

}
