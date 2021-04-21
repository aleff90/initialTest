package exemplosAulas;
import java.util.Optional;
public class optionalExercicio {
    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.of(75);
        optionalInteger.ifPresent(System.out::println);

//        Optional<Integer> optionalInteger2 = Optional.empty();
//        if (Optional.empty().isEmpty()){
//            System.out.println("tes"+IllegalStateException);
//        } else {
//            System.out.println(optionalInteger2);
//        }


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