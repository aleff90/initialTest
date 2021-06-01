package streamExample;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Ivan");
        estudantes.add("Tatiana");
        estudantes.add("Dmitri");
        estudantes.add("Svetlana");
        estudantes.add("Vladmir");
        estudantes.add("Natalia");
        estudantes.add("Yuri");
        estudantes.add("Olga");
        estudantes.add("Nikolai");

        System.out.println("\n 1 - Exibindo lista de nomes -> "+estudantes);

        //retorna a contagem de elementos no stream
        //System.out.println("\n 2 - Total de elementos -> "+estudantes.stream().count());
        System.out.println("\n 2 - Total de elementos -> "+(long)estudantes.size());

        //retorna o elemento com maior numero de letras
        System.out.println("\n 3 - Elemento com maior quantidade de letras -> "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        //retorna o elemento com menor numero de letras
        System.out.println("\n 4 - Elemento com menor quantidade de letras -> "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna elementos que contem a letras r
        System.out.println("\n 5 - Elementos com letra r -> "+estudantes.stream()
                .filter((estudantesMin)->estudantesMin
                .toLowerCase()
                .contains("r"))
                .collect(Collectors.toList()));

        //retorna uma nova coleção, com os nomes concatenados e quantidade de letras
        System.out.println("\n 6 - Total de caracteres de cada elemento -> "+estudantes.stream()
        .map(estudantesLetras->estudantesLetras.concat(" - ")
        .concat(String.valueOf(estudantesLetras.length())))
        .collect(Collectors.toList()));

        //retorna somente os tres primeiros elementos
        System.out.println("\n 7 - Exibindo somente os tres primeiros elementos -> "+estudantes.stream()
        .limit(3)
        .collect(Collectors.toList()));

        //exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println(" 8 - Retornando os elementos -> "+estudantes.stream()
        .peek(System.out::println)
        .collect(Collectors.toList()));

        //exibe cada elemento no console sem retornar outra coleção
        System.out.println("\n 9 - Retorna os elementos novamente");
        //estudantes.stream().forEach(System.out::println);
        estudantes.forEach(System.out::println);

        //retorna true se todos os elementos contem caracter w
        System.out.println("\n 10 - Algum elemento contem w? "+estudantes.stream()
        .allMatch((elemento)->elemento.contains("w")));

        //retorna true se algum elemento possui letra 'a' minuscula
        System.out.println("\n 11 - Algum elemento possui a letra 'a' minuscula? "+estudantes.stream()
        .anyMatch((elemento)->elemento.contains("a")));

        //retorna true se algum elemento possui letra 'a' maiuscula
        System.out.println("\n 12 - Algum elemento possui a letra 'a' maiuscula? "+estudantes.stream()
        .anyMatch((elemento)->elemento.contains("A")));

        //retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("\n 13 - Retornando o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //exemplo de operação encadeada
        System.out.println("\n 14 - Operação encadeada: ");
        System.out.println(" "+estudantes.stream()
        .peek(System.out::println)
        .map(estudantesTamanho->estudantesTamanho.concat(" - ").concat(String.valueOf(estudantesTamanho.length())))
        .peek(System.out::println)
        .filter((estudantesMin)->estudantesMin.toLowerCase().contains("r"))
        .collect(Collectors.toList()));

        System.out.println("\n 15 - Ordenados atravez de String/Substring: "+estudantes.stream()
        .collect(Collectors.groupingBy(estudante->estudante.substring(0,1))));
    }
}

// outros métodos que podem ser adicionados à operação encadeada
//.collect(Collectors.joining(", "))
//.collect(Collectors.toSet())
//.collect(Collectors.groupingBy(estudantesSub->estudantesSub.substring(estudantesSub.indexOf("-")+1)))