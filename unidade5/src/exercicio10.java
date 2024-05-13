import java.util.Scanner;

public class exercicio10 {

    //O número 3025 possui a seguinte característica:
    //30 + 25 = 55 --> 55^2 = 3025
    //Escreva um programa que pesquise e imprima os 10 primeiros números naturais que apresentam tal propriedade. Outros exemplos:
    //20 + 25 = 45 --> 45^2 = 2025

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int potencia = 0;
        int contador = 0;
        String termo1S, termo2S;
        
        for (int termo1 = 0; termo1 <= 10000; termo1++) {
            for (int termo2 = 0; termo2 <= 10000; termo2++) {
                
                soma = termo1 + termo2;
                potencia = soma * soma;   //potencia (int)Math.pow(soma, 2);
                termo1S = potencia + "";
                termo2S = termo1 + "" + termo2;
                
                if (termo1S.equalsIgnoreCase(termo2S)) {
                    contador++;
                    System.out.printf("[%d] %d + %d = %d --> %d%n", contador, termo1, termo2, soma, potencia);
                    
                }
                if (contador >= 10) {
                    break;
                }
            }
            if (contador >= 10) {
                break;
            }
        }   
    }
}
