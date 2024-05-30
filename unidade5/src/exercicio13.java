import java.util.Scanner;

public class exercicio13 {

    // Um motorista acaba de voltar de um feriado prolongado. 
    // Antes de sair de viagem e imediatamente após retornar, o motorista encheu o tanque do veículo e registrou as medidas do odômetro. 
    // Em cada parada feita durante a viagem, foi registrado o valor do odômetro e 
    // a quantidade de combustível comprado para reabastecer o veículo (suponha que o tanque foi enchido a cada parada). 
    // Descreva um algoritmo que leia o número total de reabastecimentos feitos e os dados registrados relativos à compra de combustível. 
    // Calcule e escreva:

    // a quilometragem obtida por litro de combustível em cada parada;
    // a quilometragem média obtida por litro de combustível em toda a viagem.

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as medidas iniciais do odômetro: ");
        int odometro = teclado.nextInt();
        System.out.println("Informe a quantidade de paradas: ");
        int paradas = teclado.nextInt();

        for (int i = 0; i <= paradas; i++) {
            System.out.println("Informe o valor do odômetro após a primeira parada: ");
            int km = teclado.nextInt();
            
        }

    }
}
