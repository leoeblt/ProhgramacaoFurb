public class ExemploMetodo {

    private ExemploMetodo() {
        mostraMenu("Principal");
        System.out.println(soma (2, 6));
        System.out.println(soma (10, 30));
        int a = 100;
        int r = soma (soma (a, 20), 5);
        System.out.println(r);
        double loucura = soma(10.0, 90);
    }

    private int soma(int n1, int n2) {
        return n1 + n2; 
    }

    private double soma(double n1, double n2) {
        return n1 + n2;
    }
    
    private static void mostraMenu(String titulo) {
        System.out.println("***** MENU " + titulo + " *****");
        
        System.out.println("opção 1 - A");
        System.out.println("opção 2 - B");
        System.out.println("opção 3 - C");
        System.out.println("Outra opção aleatória");
        System.out.println("Informe a opção: ");
    }

    public static void main(String[] args) {
        new ExemploMetodo();
    }
 
}
