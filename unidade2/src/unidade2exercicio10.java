
import java.util.Scanner;

public class unidade2exercicio10 {

    public static void main(String[] args) {
        
        //Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
        //e informe-o expresso no formato horas:minutos:segundos.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe em segundos o tempo de duração de um evento numa fábrica");
        int ValSeg = teclado.nextInt();
        int Hora = ValSeg / 3600;
        int Minuto = (ValSeg % 3600) / 60;
        int Segundos = (ValSeg % 60);
        System.out.printf("O tempo de duração é: %02d: %02d: %02d", Hora, Minuto, Segundos);
        

        
    }
    
}
