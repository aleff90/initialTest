package exemplosAulas;

public class operacoesSimples {
    public static void main(String[]args) {
        var a = 12;
        var b = 4;

        final var total = a + b;
        final var total2 = a - b;
        final var total3 = a * b;
        final var total4 = a / b;

        System.out.println("total da soma: " + total
                         + "\ntotal da subtração: " + total2
                         + "\ntotal da multiplicação: " + total3
                         + "\ntotal da divisão: " + total4);

    }
}
