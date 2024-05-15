import java.util.Scanner;

public class exercicio6 {

    //Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int quantidadePessoas = 3;
        
        double somaAlturas = 0.0;
        
        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = teclado.nextDouble();
            somaAlturas += altura;
        }
        
        double mediaAlturas = somaAlturas / quantidadePessoas;
        
        System.out.println("A média das alturas das " + quantidadePessoas + " pessoas é: " + mediaAlturas + " metros.");
        
        teclado.close();

    }

}
