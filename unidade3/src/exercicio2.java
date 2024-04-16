import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        
        //Uma loja de calçados está concedendo 12% de desconto nos produtos. 
        //Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve custar o produto com o desconto. 
        //O preço do par de sapatos deve ser informado pelo usuário. 
        //Como resultado, o programa deverá exibir as seguintes mensagens:

        //O valor do desconto é de R$ xxx
        //O preço do par de sapatos com desconto é R$ xxx

        Scanner teclado = new Scanner(System.in);

            System.out.println("Informe o valor do par de sapato: ");
            double valorSapato = teclado.nextDouble();
            double valorDesconto = (valorSapato * 0.12);
            double valorDescontado = (valorSapato - valorDesconto);
            System.out.printf("O valor do desconto é de: R$ %.2f\n", valorDescontado);
            System.out.printf("O preço do par de sapatos com desconto é: R$ %.2f", valorDesconto);

            teclado.close();
             
        }
    
}
