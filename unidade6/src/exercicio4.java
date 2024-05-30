import java.util.Scanner;

public class exercicio4 {

    //- Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
    //Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. 
    //Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. 
    //Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, 
    //outro para somar e outro para escrever os vetores.

    private exercicio4() {
        Scanner teclado = new Scanner(System.in);
        int vetor1 [] = new int[10];
        int vetor2 [] = new int[10];
        int vetorSoma [] = new int [10];
        lerVetor(teclado, vetor1, "V1");
        lerVetor(teclado, vetor2, "V2");
        vetorSoma = somaVetor(vetor1, vetor2);
        imprimeVetor(vetor1, "V1");
        imprimeVetor(vetor2, "V2");
        imprimeVetor(vetorSoma, "soma");

    }

    private void lerVetor (Scanner tec, int vetor [], String nomeVetor) {
        System.out.printf("*** LENDO VETOR %s *** %n", nomeVetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: ", i + 1);
            vetor[i] = tec.nextInt();
        }
    }

    private int [] somaVetor(int v1 [], int v2 [] ) {
        int soma [] = new int[v1.length];
        for (int i = 0; i < v1.length; i++) {
            soma[i] = v1[i] + v2[i];
        }
        
        return soma;
    
    }

    private void imprimeVetor(int vetor [], String nomeVetor) {
        System.out.printf("*** IMPRIMINDO VETOR: %s ***", nomeVetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.println("");
    }
}
