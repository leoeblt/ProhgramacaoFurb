package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio17 {
    
    public static void main(String[] args) {

        //Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas mensais e o número de dependentes. 
        //A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente (valor para cálculo do salário família) 
        //e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário trabalho para o imposto de renda. 
        //Ao final informe o nome, o salário bruto e o salário líquido do funcionário.

        Scanner teclado = new Scanner(System.in);
        
          // Entrada de dados
          System.out.print("Nome do funcionário: ");
          String nome = teclado.nextLine();
  
          System.out.print("Horas trabalhadas mensais: ");
          int horasTrabalhadas = teclado.nextInt();
  
          System.out.print("Número de dependentes: ");
          int numDependentes = teclado.nextInt();
  
          // Constantes de valores
          double valorHora = 10.00;
          double valorPorDependente = 60.00;
          double descontoINSS = 0.085;
          double descontoIR = 0.05;
  
          // Cálculos
          double salarioBruto = (horasTrabalhadas * valorHora) + (numDependentes * valorPorDependente);
          double descontoINSSValor = salarioBruto * descontoINSS;
          double descontoIRValor = salarioBruto * descontoIR;
          double salarioLiquido = salarioBruto - descontoINSSValor - descontoIRValor;
  
          // Saída de resultados
          System.out.println("\nNome do funcionário: " + nome);
          System.out.println("Salário bruto: R$ " + salarioBruto);
          System.out.println("Salário líquido: R$ " + salarioLiquido);
  
          teclado.close();

    }
}
