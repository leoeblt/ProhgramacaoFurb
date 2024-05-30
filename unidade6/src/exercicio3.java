import java.util.Scanner;

public class exercicio3 {

    //Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
    //Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e 
    //os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. 
    //Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.

    private exercicio3() {
        Scanner teclado = new Scanner(System.in);
        double vetor [] = new double[12];
        lerVetor(teclado, vetor);
        ajustarVetor(vetor);
        imprimirVetor(vetor);
    
    }

    private void lerVetor(Scanner teclado, double [] vetor) {
        System.out.println("*** LEITURA DO VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor %d: ", i + 1);
        }
    }

    private void ajustarVetor(double vetor [] ) {
        for (int i = 0; i < vetor.length; i++) {
            if ((i + 1) % 2 == 0) {
                vetor[i] += vetor[1] * 0.02;
            } else {
                vetor[i] += vetor[i] * 0.05;
            }

        }
    }

    private void imprimirVetor(double vetor [] ) {
        System.out.println("*** IMPRIMIR VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d - valor %.2f%n", i + 1, vetor[i]);
        }
    }
    
    public static void main(String[] args) {
        new exercicio3();
    }
}    


