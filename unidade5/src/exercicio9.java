import java.util.Scanner;

public class exercicio9 {

    //Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
    //escreva os nomes dos alunos que tem 18 anos;
    //escreva a quantidade de alunos que tem idade acima de 20 anos.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o total de alunos: ");
        int qtdAlunos = teclado.nextInt();
        String nomes18anos = "";
        int contadorAlunosAcima20anos = 0;
        for (int numAluno = 0; numAluno < qtdAlunos; numAluno++) {
            System.out.print("Informe o nome do aluno: ");
            String nome = teclado.next();
            System.out.print("Informe a idade do aluno: ");
            int idade = teclado.nextInt();

            if (idade == 18) {
                nomes18anos += nome + " ";
            } else if (idade > 20) {
                contadorAlunosAcima20anos++;
            }
        }
        System.out.println("Alunos com 18 anos: " + nomes18anos);
        System.out.println("Total de alunos com + 20 anos: " + contadorAlunosAcima20anos);

    }

}
