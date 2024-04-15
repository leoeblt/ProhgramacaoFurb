package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio5 {   
    public static void main(String[] args) {
        //Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner dig = new Scanner (System.in);
        System.out.print("Informe quatro números: ");

        int A = dig.nextInt();
        int B = dig.nextInt();
        int C = dig.nextInt();
        int D = dig.nextInt();
        int diff = ((A*B) - (C*D));

        System.out.println("O valor da diferença do produto de A e B pelo produto de C e D será: " + diff);
    }
}

