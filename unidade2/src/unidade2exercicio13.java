package exercicioalgoritmosuni2;

import java.util.Scanner;

public class unidade2exercicio13 {

    public static void main(String[] args) {
        
        //Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h. 
        //Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos. 
        //Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a distância entre os carros em quilômetros: ");
        double distancia = teclado.nextDouble();

        double velocidadeCarroX = 60; // Km/h
        double velocidadeCarroY = 90; // Km/h

        // Calcula o tempo necessário para o carro Y alcançar a distância
        double tempoEmHoras = distancia / (velocidadeCarroY - velocidadeCarroX);

        // Convertendo horas para minutos
        int tempoEmMinutos = (int) (tempoEmHoras * 60);

        System.out.println("Tempo necessário para o carro Y alcançar a distância: " + tempoEmMinutos + " minutos");

        teclado.close();
    }
    
}
