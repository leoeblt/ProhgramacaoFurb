
import java.util.Scanner;
import java.text.DecimalFormat;

public class unidade2exercicio7 {

    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);

    DecimalFormat padrao = new DecimalFormat("00.00");

    System.out.print("informe o nome do vendedor: ");
    String nomeFunc = teclado.nextLine();

    System.out.print("informe o salário fixo: ");
    double salFixo = teclado.nextDouble();

    System.out.println("inofrme o total de vendas efetuadas por ele no mês");
    double totalVendas = teclado.nextDouble();

    double salFinal = salFixo + (totalVendas * 0.15);
    System.out.println("o salário final do vendedor é: " + salFinal);
    
   }
   
    
}
