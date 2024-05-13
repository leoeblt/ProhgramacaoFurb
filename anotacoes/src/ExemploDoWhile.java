import java.util.Scanner;

public class ExemploDoWhile {

    public static void main(String[] args) {
        int contador = 1;
        do { 
            System.out.println(contador++); 
        } while (contador <= 5);
        System.out.println("FIM");
    }

}

