import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {
        
        //Uma granja possui um controle automatizado de cada frango da sua produção. 
        //No pé direito do frango há um anel com um chip de identificação; 
        //no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir. 
        //Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, 
        //faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantidade de frango que possui a granja: ");
        int quantFrango = teclado.nextInt();
        double chipIdentificacao = 4;
        double chipAlimento = (2 * 3.5);
        double resultado = (quantFrango * (chipIdentificacao + chipAlimento));
        System.out.printf("O gasto total pela ganja é de: R$ %.2f", resultado);


        

    }
    
}
