package optionalExercise;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalLong;
public class Main {
    public static void main(String[] args) {
        Optional<Integer> optionalInteger = Optional.of(74589);
        optionalInteger.ifPresentOrElse(System.out::println, ()-> System.out.println("\n Não esta presente!"));

        OptionalDouble optionalDouble = OptionalDouble.of(95.48471);
        optionalDouble.ifPresentOrElse(System.out::println,()-> System.out.println("\n Não esta presente!"));

        OptionalLong optionalLong = OptionalLong.of(987484512);
        optionalLong.ifPresentOrElse(System.out::println,()-> System.out.println("\n Não esta presente!"));

        Optional<String> optionalString = Optional.empty();
        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("\n Não esta vazio!"));
    }
}

/*Crie um optional de um determinado tipo de dado.--
 * Crie com estado vazio, estado presente, e com null.--
 * Se vazio, lançe uma exceção IlegalStateException.
 * Se presente, exiba o valor no console.
 * Se vazio, exiba "Optional vazio" no console.
 * Se presente, transforme o valor e exiba no console.
 * Se presente, pegue o valor do optional e atribua em uma variavel.
 * Se presente, filtre o optional com uma determinada regra de negocio.*/

//Optional<Double> optionalDouble = Optional.ofNullable(null);
//optionalDouble.ifPresentOrElse(System.out::println, () -> System.out.println("\n null esta presente"));
