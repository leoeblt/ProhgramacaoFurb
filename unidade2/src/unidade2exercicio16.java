package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio16 {
    

    public static void main(String[] args) {

        //Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
        //Se um comerciante compra uma determinada quantidade de cada formato, informe quantos litros de refrigerante ele comprou.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de latas de 350ml que foi comprado: ");
        int lata = teclado.nextInt();
        double quantidadeLatas = (lata * 0.35);
        System.out.println("Informe a quantidade de garrafas de 600ml que foi comprado: ");
        int garrafa = teclado.nextInt();
        double quantidadeGarrafas = (garrafa * 0.6);
        System.out.println("Informe a quantidade de garrafas de 2L que foi comprado: ");
        int garrafa1 = teclado.nextInt();
        double quantidadeGarrafas1 = (garrafa1 * 2);
          
        double resultado = (quantidadeLatas + quantidadeGarrafas + quantidadeGarrafas1);

        System.out.printf("O resultado da soma dos litros é: %.2f", resultado);

        teclado.close();
        



    }
}
