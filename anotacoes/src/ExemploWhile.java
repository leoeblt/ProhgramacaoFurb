import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe nome (fim termina)..: ");
        String nome = "";
        int contador = 1;
        while (nome.equalsIgnoreCase("fim")) {
            System.out.println("boa noite " + nome);
            System.out.print("Informe nome " + contador + "(fim termina)...: ");
            nome = teclado.next();
        }
        System.out.println("FIM");
        
    
    
    
    
    
    
    
    //     int contador = 10;
    //     while(contador < 5) {
    //         System.out.println(contador);
    //         contador += 3;
    //     }
    //     System.out.println("FIM");
     }

}
