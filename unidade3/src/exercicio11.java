import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        //Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:
        //°F = (9/5) °C + 32

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        double cel = teclado.nextDouble();
        
        double far = (cel * 9/5) + 32;

        System.out.printf("%.1f°C é equivalente a %.1f°F", cel, far);
        teclado.close();
    }
        
    }
    

