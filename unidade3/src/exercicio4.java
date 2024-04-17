import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        
        //Faça um programa para ler três notas de um aluno em uma disciplina e 
        //imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota do aluno: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Informe a segunda nota do aluno: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Informe a terceira nota do aluno: ");
        double nota3 = teclado.nextDouble();
        double resultado = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) /10;
        System.out.printf("A média ponderada do aluno é: %.1f", resultado);


    }
    
}
