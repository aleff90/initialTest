package exemplosAulas;

public class operadoresLogicos {
    public static void main(String[]args) {
        if ((1 == (2 - 1)) && (2 == (1 + 1))) {
            System.out.println("\nAmbas as expressões são verdadeiras");
        }
        if ((1 == (2-1)) || (2 == (2 + 1))) {
            System.out.println("\nA expressão é verdadeira, pois, é verdadeira ou falsa");
        }
    }
}
