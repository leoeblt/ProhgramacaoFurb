package exercicioalgoritmosuni4;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {
        
        //O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. 
        //O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, 
        //onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:
        //Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("informe peso....: ");
        float peso = teclado.nextFloat();
        System.out.println("informe altura....: ");
        float altura = teclado.nextFloat();
        double imc = peso / Math.pow(altura, 2);
        String classificacao = "";
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 25) {
            classificacao = "Saudável";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else if (imc < 35) {
            classificacao = "Obesidade grau I";
        } else if (imc < 40) {
            classificacao = "Obesidade grau II (severa)";
        } else{
            classificacao = "Obesidade grau III (mórbida)";
        }
        
        System.out.printf("IMC = %.2f - %s", imc, classificacao);



    }
    
}
