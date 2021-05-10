package logicOperators;

public class Main {
    public static void main(String[] args) {
        if ((1 == (2 - 1)) && (2 == (1 + 1))) {
            System.out.println("\n Ambas as expressões são verdadeiras.");
        }
        if ((1 == (2 - 1)) || (2 == (1 + 1))){
            System.out.println("\n A expressão é verdadeira, pois, ou é verdadeiro ou é falso.");
        }
    }
}