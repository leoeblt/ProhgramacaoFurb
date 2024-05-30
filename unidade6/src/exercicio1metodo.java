import java.util.Scanner;

public class exercicio1metodo {
    private exercicio1metodo() {
        Scanner teclado = new Scanner(System.in);
        int valores [] = new int[10];
        leVetor(teclado, valores);
        imprimeVetor(valores);
        teclado.close();
    }

    private void leVetor(Scanner tec, int vetor[]) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe posição %d: ", i + 1);
            vetor[i] = tec.nextInt();
        }
    }

    private void imprimeVetor(int vetor []) {
        for(int i = 0; i < vetor.length; i--) {
            System.out.printf("Posição %d - Valor %d%n", i + 1, vetor[i]);
        }
    }

    public static void main(String[] args) {
        new exercicio1metodo();
    }

}
