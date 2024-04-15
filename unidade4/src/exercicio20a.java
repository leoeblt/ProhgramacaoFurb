package exercicioalgoritmosuni4;

import java.util.Scanner;

public class exercicio20a {

    public static void main(String[] args) {
    
    //Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
    //descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
    //O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso 
    //o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.
    
    Scanner teclado = new Scanner (System.in);
    
    System.out.print("Nota prova 1.....: ");
    float NotaProva1 = teclado.nextFloat();
    System.out.print("Nota prova 2.....: ");
    float NotaProva2 = teclado.nextFloat();
    System.out.print("Nota prova 3.....: ");
    float NotaProva3 = teclado.nextFloat();
    System.out.print("Nota exercícios.: ");
    float NotaExercícios = teclado.nextFloat();

    float media = (NotaProva1 + (NotaProva2 * 2) + (NotaProva3 * 3) + NotaExercícios) /7;
    
    char conceito = ' ';
    if (media >= 9) {
        conceito = 'A';
    } else if (media >= 7.5) {
        conceito = 'B';
    } else if (media >= 6.6) {
        conceito = 'C';
    } else if (media >= 4.0) {
        conceito = 'D';
    } else {
        conceito = 'E';
    }
    String situacao = "";
    if (media >= 6) {
        situacao = "Aprovado";
    } else {
        situacao = "Reprovado";
    }
    System.out.printf("A média é %.2f com conceito %c e situação %s.", media, conceito, situacao);

    teclado.close();
    }
    }
    
