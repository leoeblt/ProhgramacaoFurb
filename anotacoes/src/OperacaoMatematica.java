package SRC;

public class OperacaoMatematica {
    public static void main(String [] args) {

    //Potência

    int numero = 10;
    int quadrado = numero * numero;
    int cubo = numero * numero * numero;
    System.out.println(quadrado);
    System.out.println(cubo);
    int resposta = (int)Math.pow(numero, 7);           //ou pode ser tamém "double resposta = math.pow(numero,7)" pois isso é um "double", mas pode ser colocado dentro do "int"
    System.out.println(resposta);

    //Raiz Quadrada

    double raiz = Math.sqrt(9);
    System.out.println(raiz);
    System.out.println(Math.PI);
    
    
    


    }
    
}
