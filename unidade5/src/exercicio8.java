import java.util.Scanner;

public class exercicio8 {

    // Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
    // escreva o menor valor negativo;
    // escreva a média dos números positivos.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe n números: ");
        int n = teclado.nextInt();

        double media = 0;
        int soma = 0;
        int num = 0;
        int menorNeg = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){

           System.out.printf("Informe o número %d: ", i);
           num = teclado.nextInt();

           if (num < 0 && num > menorNeg) { //AJUDADO
               menorNeg = num;
            
           } else if (num > 0) { //AJUDADO
                soma+=num;
            
           }

           if (soma > 0) { //AJUDADO
            media = soma / n;
            
           }
        }

        System.out.printf("MENOR VALOR NEGATIVO: %d%nMÉDIA DOS POSITIVOS: %d", menorNeg, media);
    }

}
