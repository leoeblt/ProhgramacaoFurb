import java.util.Scanner;

public class ProvaExercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Infome qual é o animal: ");
        String animal = teclado.nextLine();
        System.out.println("Informe a espécie do animal: ");
        String especie = teclado.nextLine();

        if (animal == "") {
            System.out.println("Não é possível informar os dados");
        } if (especie == "") {
            System.out.println("Não é possível informar os dados");
        } else if (animal == "animal: " + animal) {
            System.out.println("Não é possível informar os dados");
        } else if (especie == "especie" + especie) {
            System.out.println("Espécie vazio");
        } System.out.println("FIM");


    }
    
}
