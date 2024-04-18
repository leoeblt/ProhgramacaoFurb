import java.util.Scanner;

public class ProvaExercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o preço da primeira multa paga: ");
        double multa1 = teclado.nextDouble();
        System.out.println("Informe o preço da segunda multa paga: ");
        double multa2 = teclado.nextDouble();
        System.out.println("Informe o preço da terceira multa paga: ");  
        Double multa3 = teclado.nextDouble();
        System.out.println("\t1 - Primeira multa\n\t2 - Segunda multa\n\t3 - Terceira multa");
        System.out.println("Escolha alguma das três multas: ");
        int multa = teclado.nextInt();

        switch (multa) {
            case 1:
            if (multa1 >= 100) {
                System.out.println("multa mais ALTA");
            }
            break;
            case 2:
            if (multa1 >= 100) {
                System.out.println("Multa mais ALTA");
            }
            break;
            case 3:
            if (multa2 >= 100) {
                System.out.println("Multa mais ALTA");
            }
            break;
            case 4:
            if (multa2 < 100) {
                System.out.println("Multa mais BAIXA");
            }
            break;
            case 5:
            if (multa3 >= 100) {
                System.out.println("Multa mais ALTA");
            }
            break;
            case 6:
            if (multa3 < 100) {
                System.out.println("Multa mais BAIXA");
            }
            break;




            } 
            }

        }

    

