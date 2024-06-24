import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval {

// Construtor
    public BatalhaNaval() {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();      
        
        char[][] tabuleiro = new char[8][8];
        int[][] navios = new int[10][2]; // Coordenadas dos navios

        gerarTabuleiro(ran, tabuleiro, navios); // Gerar com os navios
        iniciarJogo(sc, tabuleiro, navios); // Iniciar o jogo em si

        int opcao = 0;

        do {
            opcao = menu(sc); // Exibir menu e ler opção

            switch (opcao) {
                case 1:
                    gerarTabuleiro(ran, tabuleiro, navios); // Gerar com os navios
                    iniciarJogo(sc, tabuleiro, navios); // Iniciar o jogo em si
                    break;

                case 2:
                    break;

                default:
                    System.out.println("!!! ERRO !!!");
                    break;
            }
        } while (opcao != 2);
        System.out.println(">>>SAINDO DO JOGO<<<");
    }

// Método que gera o tabuleiro com navios em posições random
    private void gerarTabuleiro(Random random, char[][] tabuleiro, int[][] navios) {

// Criação dos navios com random
        for (int i = 0; i < navios.length; i++) {
            navios[i] = new int[] { random.nextInt(8), random.nextInt(8) };
        }

// Verificando se há repetição nos navios
        boolean iguais = true;

        while (iguais) {

            for (int i = 0; i < navios.length; i++) {

                for (int j = i + 1; j < navios.length; j++) {
                    iguais = true;

                    for (int k = 0; k < 2; k++) {
                        if (navios[i][k] != navios[j][k]) {
                            iguais = false;
                        }
                    }

// Gerando nova coordenada se repetir algum navio
                    if (iguais) {
                        navios[i][0] = random.nextInt(8);
                        navios[i][1] = random.nextInt(8);
                        i = -1;
                        break;
                    }
                }
            }
        }

// Criar tabuleiro
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = '~'; // Preenchimento

                for (int n = 0; n < navios.length; n++) {
                    if (navios[n][0] == i && navios[n][1] == j) {
                        tabuleiro[i][j] = 'N'; // Coloca os navios
                        break;
                    }
                }
            }
        }
    }

// Método que exibe o tabuleiro
    private void mostrarTabuleiro(char[][] tabuleiro, boolean perdeu) {

        System.out.println("\n\n\t\t\t>>>>BATALHA NAVAL<<<<\n");

        System.out.print("\n\t0\t1\t2\t3\t4\t5\t6\t7\n");

        for (int i = 0; i < 8; i++) {
            System.out.print(i + "\t");

            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == 'N') {
                    // Oculta os navios, menos se o jogador perdeu
                    if (perdeu) {
                        System.out.print('N' + "\t");
                    } else {
                        System.out.print('~' + "\t");
                    }
                } else {
                    System.out.print(tabuleiro[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }

// Método jogar
    private void iniciarJogo(Scanner sc, char[][] tabuleiro, int[][] navios) {

        int maxJogadas = 30; // Número máximo de jogadas
        int qtdNavios = navios.length; // Navios restantes
        int contadorErro = 0;
        int contadorAcerto = 0;

        while (qtdNavios > 0 && maxJogadas > 0) {
            int coluna = 0;
            int linha = 0;

            do {
                System.out.printf("\n\nJogadas restantes: %d", maxJogadas);
                mostrarTabuleiro(tabuleiro, false); // Exibe o tabuleiro sem mostrar os navios

                System.out.print("\nINFORME AS COORDENADAS(linha e coluna, separadas por espaço): ");
                linha = sc.nextInt();
                coluna = sc.nextInt();

                if (linha > 7 || linha < 0 || coluna > 7 || coluna < 0) {
                    System.out.println("\n!!! Valor(es) inválido(s) !!!");
                }

            } while (linha > 7 || linha < 0 || coluna > 7 || coluna < 0);

            switch (tabuleiro[linha][coluna]) {
                case '~':
                    System.out.println("\n!!! VOCÊ ERROU !!!\n");
                    tabuleiro[linha][coluna] = 'O'; // Marca a posição "erro"
                    maxJogadas--;
                    contadorErro++;
                    break;

                case 'N':
                    System.out.println("\n!!! NAVIO ACERTADO!!!");
                    tabuleiro[linha][coluna] = 'X'; // Marca a posição "acerto"
                    maxJogadas--;
                    qtdNavios--;
                    contadorAcerto++;
                    break;

                case 'O':
                    System.out.println("\n!!! VOCÊ JÁ ATACOU ESSA COORDENADA !!!");
                    break;

                case 'X':
                    System.out.println("\n!!! VOCÊ JÁ ATACOU ESSA COORDENADA !!!");
                    break;

                default:
                    System.out.println("ERRO");
                    break;
            }
        }

// Exibir o resultado final
        if (qtdNavios > 0) {
            
            System.out.println("\nResultado: \n");
            System.out.println("\t\t -----------");
            System.out.println("\t\t|  DERROTA  |");
            System.out.println("\t\t -----------");

            mostrarTabuleiro(tabuleiro, true); // Vai exibir o tabuleiro completo

            System.out.println("\n|-----------------------------------------------------|");
            System.out.println("  TABULEIRO FINAL:                                  ");
            System.out.printf("\n  %d Acerto(s) || %d Erro(s) || %d Navio(s) restante(s)\n", contadorAcerto, contadorErro, qtdNavios);
            System.out.println("|-----------------------------------------------------|");

        } else {
            System.out.println("\nResultado: \n");
            System.out.println("\t\t -----------");
            System.out.printf("\t\t|  VITÓRIA  |\n");
            System.out.println("\t\t -----------");
            System.out.printf("\nVocê destruiu todos os navios %d em jogadas!\n", maxJogadas);
        
            System.out.println("\n\n|-----------------------------|");
            System.out.println("  TABULEIRO FINAL:          ");
            System.out.printf("\n  %d Acerto(s) || %d Erro(s)\n", contadorAcerto, contadorErro);
            System.out.println("|-----------------------------|");
           
        }
    }

    // Método que exibe o menu e obtém a opção
    private int menu(Scanner scan) {

        int opcao = 0;
        do {
            System.out.println("\n\n\n\t>>>BATALHA NAVAL<<<");
            System.out.println("\n\t -----------------");
            System.out.println("\t|  [1] Reiniciar  |");
            System.out.println("\t|  [2] Sair       |");
            System.out.println("\t -----------------\n\n");

            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            if(opcao < 1 || opcao > 2) {
                System.out.println("\nOpção inválida!");
            }

        } while (opcao < 1 || opcao > 2);

        return opcao;
    }

// Método main
    public static void main(String[] args) {
        new BatalhaNaval();
    }
}