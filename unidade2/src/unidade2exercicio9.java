package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio9 {

    public static void main(String[] args) {
    
    //Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. 
    //Considerando que o atendente tem a cotação do dólar, calcule quantos reais o atendente deve devolver para a pessoa.
    
    Scanner teclado = new Scanner (System.in);
    System.out.println("Informe o valor recebido em dólar");
    double ValDol = teclado.nextDouble();
    double ValReal = (ValDol * 5.00);
    System.out.printf("O resultado da coverção de dólar para real é: %.2f", ValReal);


    }
    
}
