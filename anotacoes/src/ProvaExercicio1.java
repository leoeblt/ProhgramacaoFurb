import java.util.Scanner;

public class ProvaExercicio1 {
    private ProvaExercicio1() {
        Scanner teclado = new Scanner(System.in);
        String[] quantidadeMochila = new String[5];
        int[] pesos = new int[5];
        int capacidadeMochila = 15;
        int pesoAtual = 0;
        int posicaoFinal = 0;

        int opcoes;
        do {
            System.out.println(" ======= MENU ======= ");
            System.out.println("  1 - Incluir valor");
            System.out.println("  2 - Listar ordem inversa");
            System.out.println("  3 - Item mais pesado");
            System.out.println("  4 - Ordenar mochila");
            System.out.println("  5 - Excluir item");
            System.out.println("  6 - Sair do sistema");
            System.out.print("  Opção: ");
            
            opcoes = teclado.nextInt();
            
            switch (opcoes) {
                case 1:
                    posicaoFinal = incluir(teclado, quantidadeMochila, pesos, posicaoFinal, pesoAtual, capacidadeMochila);
                    break;
                case 2:
                    inverter(quantidadeMochila, posicaoFinal, pesos);
                    break;
                case 3:
                    itemPesado(quantidadeMochila, pesos, posicaoFinal);
                    break;
                case 4:
                    ordenar(quantidadeMochila, pesos, posicaoFinal);
                    break;
                case 5:
                    posicaoFinal = excluir(teclado, quantidadeMochila, pesos, posicaoFinal, pesoAtual);
                    break;
                case 6:
                    System.out.println(" *** FIM *** ");
                    break;
                default:
                    System.out.println(" *** OPÇÃO INVÁLIDA *** ");
                    break;
            }
        } while (opcoes != 6);
    }

    private int incluir(Scanner teclado, String[] quantidadeMochila, int[] pesos, int posicaoFinal, int pesoAtual, int capacidadeMochila) {
        if (posicaoFinal < quantidadeMochila.length) {
            
            System.out.print("Informe o item: ");
            String item = teclado.nextLine();
            System.out.print("Informe o peso do item: ");
            int peso = teclado.nextInt();
            teclado.nextLine();

            if (pesoAtual + peso <= capacidadeMochila) {
                quantidadeMochila[posicaoFinal] = item;
                pesos[posicaoFinal] = peso;
                pesoAtual += peso;
                System.out.println(" *** incluído em vet[" + posicaoFinal + "] *** ");
                posicaoFinal++;
            } else {
                System.out.println(" *** não incluído - peso é superior ao peso máximo da mochila *** ");
            }
        } else {
            System.out.println(" *** não incluído - vetor cheio *** ");
        }
        
        return posicaoFinal;
    }

    private void inverter(String[] quantidadeMochila, int posicaoFinal, int[] pesos) {
        for (int i = posicaoFinal - 1; i >= 0; i--) {
            System.out.println(quantidadeMochila[i] + " - " + pesos[i] + "kg");
        }
    }

    private void itemPesado(String[] quantidadeMochila, int[] pesos, int posicaoFinal) {
        int pesoMaximo = 0;
        String item = null;
        
        for (int i = 0; i < posicaoFinal; i++) {
            if (pesos[i] > pesoMaximo) {
                pesoMaximo = pesos[i];
                item = quantidadeMochila[i];
            }
        }
        
        System.out.println(" *** Item mais pesado: " + item + " - " + pesoMaximo + "kg *** ");
    }

    private void ordenar(String[] quantidadeMochila, int[] pesos, int posicaoFinal) {
        for (int i = 0; i < posicaoFinal - 1; i++) {
            for (int z = 0; z < posicaoFinal - i - 1; z++) {
                if (pesos[z] < pesos[z + 1]) {
                    int tempPeso = pesos[z];
                    pesos[z] = pesos[z + 1];
                    pesos[z + 1] = tempPeso;

                    String tempItem = quantidadeMochila[z];
                    quantidadeMochila[z] = quantidadeMochila[z + 1];
                    quantidadeMochila[z + 1] = tempItem;
                }
            }
        }
        
        System.out.println(" *** Mochila ordenada por peso *** ");
    }

    private int excluir(Scanner teclado, String[] quantidadeMochila, int[] pesos, int posicaoFinal, int pesoAtual) {
        System.out.print("Informe o item a ser excluído: ");
        String itemExcluido = teclado.nextLine();
        
        for (int i = 0; i < posicaoFinal; i++) {
            if (quantidadeMochila[i] != null && quantidadeMochila[i].equals(itemExcluido)) {
                pesoAtual -= pesos[i];
                quantidadeMochila[i] = null;
                pesos[i] = 0;
                
                for (int j = i; j < posicaoFinal - 1; j++) {
                    quantidadeMochila[j] = quantidadeMochila[j + 1];
                    pesos[j] = pesos[j + 1];
                }
                quantidadeMochila[posicaoFinal - 1] = null;
                pesos[posicaoFinal - 1] = 0;
                posicaoFinal--;
                System.out.println(" *** Item excluído *** ");
                return posicaoFinal;
            }
        }
        
        System.out.println(" *** Item não foi encontrado na mochila *** ");
        return posicaoFinal;
    }

    public static void main(String[] args) {
        new ProvaExercicio1();
    }
}