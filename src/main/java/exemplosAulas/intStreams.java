package exemplosAulas;

import java.util.stream.IntStream;

public class intStreams {
    public static void main(String[] args) {
        IntStream.of(1,2,3,4,5).forEach(System.out::println);

        IntStream.rangeClosed(0,3).forEach(n-> System.out.println("Numero = "+n));
    }
}
