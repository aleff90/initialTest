package exemplosAulas;

import java.util.function.UnaryOperator;

public class paradigmaFuncionalExemplo {
    public static void main(String[] args) {

        UnaryOperator<Integer> multiplicarValorVezesTres = valor -> valor*3;
        //int valor = 10;
        System.out.println("\n Variavel valor multiplicada por tres: "+multiplicarValorVezesTres.apply(10));

    }
}
