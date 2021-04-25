package exemplosAulas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class streamExemplo {
    public static void main(String[] args) {

        List<String> estudantes = new ArrayList<>();

        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //retorna a contagem de elementos do stream
        //System.out.println("\n 1 - Contagem: "+estudantes.stream().count());
        System.out.println("\n 1 - Contagem: "+ (long) estudantes.size());

        //retorna o elemento com maior numero de letras
        System.out.println("\n 2 - Maior numero de letra: "+estudantes.stream().max(Comparator.comparingInt(String::length)));

        //retorna o elemento com menor numero de letras
        System.out.println("\n 3 - Menor numero de letras: "+estudantes.stream().min(Comparator.comparingInt(String::length)));

        //retorna os elementos que tem a letra R no nome
        System.out.println("\n 4 - Com a letra R no nome: "+estudantes.stream()
                .filter((estudantesMin)->estudantesMin.toLowerCase().contains("r")).collect(Collectors.toList()));

        //retorna uma nova coleção, com os nomes concatenados a quantidade de letra de cada nome
        System.out.println("\n 5 - Retorna uma nova coleção com a quantidade de letras: "+estudantes.stream()
                .map(estudantesLetras->estudantesLetras.concat(" - ")
                .concat(String.valueOf(estudantesLetras.length())))
                .collect(Collectors.toList()));

        //retorna somente os 3 primeiros elementos da coleção
        System.out.println("\n 6 - Retorna os 3 primeiros elementos: "+estudantes.stream().limit(3).collect(Collectors.toList()));

        //exibe cada elemento no console e depois retorna a mesma coleção
        System.out.println("\n 7 - Retorna os elementos: "+estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //exibe cada elemento no console sem retornar outra coleção
        System.out.println("\n 8 - Retorna os elementos novamente: ");
        //estudantes.stream().forEach(System.out::println);
        estudantes.forEach(System.out::println);

        //retorna true se todos os elementos possuem a letra W no nome
        System.out.println("\n 9 - Tem algum elemento com W no nome? "+estudantes.stream().allMatch((elemento)->elemento.contains("W")));

        //retorna true se algum dos elementos possuem a letra A minuscula no nome
        System.out.println("\n 10 - Tem algum elemento com A minusculo no nome? "+estudantes.stream().anyMatch((elemento)->elemento.contains("a")));

        //retorna true se nenhum elemento possuem a letra A minuscula no nome
        System.out.println("\n 11 - Não tem nenhum elemento com A minusculo no nome? "+estudantes.stream().noneMatch((elemento)->elemento.contains("a")));

        //retorna o primeiro elemento da coleção, se existir exibe no console
        System.out.println("\n 12 - Retorna o primeiro elemento da coleção: ");
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //exemplo de operação encadeada
        System.out.println("\n 13 - Operação encadeada: ");
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(estudantesTamanho->estudantesTamanho.concat(" - ").concat(String.valueOf(estudantesTamanho.length())))
                .peek(System.out::println)
                .filter((estudantesMin)->estudantesMin.toLowerCase().contains("r"))
                .collect(Collectors.toList())
        );

        System.out.println("\n 14 - Ordenados atravez de String/SubString: "+estudantes.stream().collect(Collectors.groupingBy(estudante->estudante.substring(0, 1))));

    }
}

// outros métodos que podem ser adicionados à operação encadeada
//.collect(Collectors.joining(", "))
//.collect(Collectors.toSet())
//.collect(Collectors.groupingBy(estudantesSub->estudantesSub.substring(estudantesSub.indexOf("-")+1)))



