
import java.util.Scanner;
public class unidade2exercicio11 {

    public static void main(String[] args) {
        
        //Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
        //a) a área do triângulo retângulo que tem A por base e C por altura.
        //b) a área do círculo de raio C. (pi = 3.14159).
        //c) a área do trapézio que tem A e B por bases e C por altura.
        //d) a área do quadrado que tem lado B.
        //e) a área do retângulo que tem lados A e B.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double A = teclado.nextDouble();
        System.out.println("Digite o valor de B: ");
        double B = teclado.nextDouble();
        System.out.println("Digite o valor de C: ");
        double C = teclado.nextDouble();

        double areaTriangulo = (A * C) / 2;
        double areaCirculo = Math.PI * Math.pow(C, 2);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.println("Área do triângulo retângulo: " + areaTriangulo);
        System.out.println("Área do círculo: " + areaCirculo);
        System.out.println("Área do trapézio: " + areaTrapezio);
        System.out.println("Área do quadrado: " + areaQuadrado);
        System.out.println("Área do retângulo: " + areaRetangulo);

        teclado.close();
    }
}
