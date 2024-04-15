
import java.util.Scanner;

public class unidade2exercicio12 {

    public static void main(String[] args) {
        
        //Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
        //p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1 (x1 y1):");
        double x1 = teclado.nextDouble();
        double y1 = teclado.nextDouble();

        System.out.println("Digite as coordenadas do ponto P2 (x2 y2):");
        double x2 = teclado.nextDouble();
        double y2 = teclado.nextDouble();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.printf("A distância entre os pontos P1 e P2 é: %.4f\n", distancia);

        teclado.close();
    }
    
}
