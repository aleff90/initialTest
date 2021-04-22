package exemplosAulas;

import java.util.Optional;

public class optionalExemplo1 {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("\n valor presente");
        System.out.println(" valor opcional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println(" não está presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);
        System.out.println("\n valor opcional que não esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println(" null = não esta presente"));

        Optional<String> emptyOptional = Optional.empty();
        System.out.println("\n valor opcional que não esta presente");
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println(" empty = não esta presente"));

        Optional<String> optionalNullErro = Optional.of(" null");
        System.out.println("\n valor opcional que lança erro NullPointerException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println(" erro = não esta presente"));

    }
}
