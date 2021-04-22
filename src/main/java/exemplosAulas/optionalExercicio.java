package exemplosAulas;

import java.util.Optional;
import java.util.OptionalDouble;

public class optionalExercicio {

    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.of(75);
        optionalInteger.ifPresentOrElse(System.out::println, ()-> System.out.println("\n não esta presente"));

        Optional<String> optionalString = Optional.empty();
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("\n não esta vazio"));

        Optional<Integer> optionalInteger2 = Optional.of(987987);
        System.out.println("\n exibindo optional integer2: "+optionalInteger2);

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

