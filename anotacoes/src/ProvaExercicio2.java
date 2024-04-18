import java.util.Scanner;

public class ProvaExercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\t1 - C\n\t2 - E\n\t3 - A\n\t4 - Outra letra");
        System.out.println("Informe o número que corresponde a letra da sua roupa: ");
        int numero = teclado.nextInt();

        if (numero == 1) {
            System.out.println("Roupa Casual");
        } else if (numero == 2) {
            System.out.println("Roupa Esportiva");
        } else if (numero == 3) {
            System.out.println("Roupa Alternativa");
        } else {
            System.out.println("Entrada Inválida");
        }
        }
    }
    

