import java.util.Scanner;

public class exercicio14 {

    // Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. 
    // Para cada mercadoria ele tem o nome, o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:

    // escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), 
    // onde o percentual de lucro é calculado da seguinte forma: % = (PV - PC) / PC * 100;
    // determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtdLucroMenor10 = 0;
        int qtdLucroEntre10e20 = 0;
        int qtdLucroMaior20 = 0;
        
        double totalCompra = 0;
        double totalVenda = 0;
        double lucroTotal = 0;
        
        System.out.println("Informe os detalhes das mercadorias:");
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("Mercadoria " + i + ":");
            System.out.print("Nome: ");
            String nome = teclado.next();
            System.out.print("Preço de compra: ");
            double precoCompra = teclado.nextDouble();
            System.out.print("Preço de venda: ");
            double precoVenda = teclado.nextDouble();
            
            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;
            
            if (lucroPercentual < 10) {
                qtdLucroMenor10++;
            } else if (lucroPercentual >= 10 && lucroPercentual <= 20) {
                qtdLucroEntre10e20++;
            } else {
                qtdLucroMaior20++;
            }
            
            totalCompra += precoCompra;
            totalVenda += precoVenda;
            lucroTotal += (precoVenda - precoCompra);
        }
        
        System.out.println("\nResultados:");
        System.out.println("Quantidade de mercadorias com lucro < 10%: " + qtdLucroMenor10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + qtdLucroEntre10e20);
        System.out.println("Quantidade de mercadorias com lucro > 20%: " + qtdLucroMaior20);
        System.out.println("Valor total de compra de todas as mercadorias: " + totalCompra);
        System.out.println("Valor total de venda de todas as mercadorias: " + totalVenda);
        System.out.println("Lucro total: " + lucroTotal);
        
        teclado.close();


    }

}
