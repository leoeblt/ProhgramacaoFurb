import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {

        //Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:
        //X centena(s)  Y dezena(s) K unidade(s)
        //Exemplo, se for submetido o número 384, o programa deverá exibir:
        //3 centena(s)  8 dezena(s) 4 unidade(s)

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número qualquer: ");
        int num = teclado.nextInt();

        int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;

        System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)", centena, dezena, unidade);

        teclado.close();
        
    }
    
}
