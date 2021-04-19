package comparatorsExercicio;

import java.util.Comparator;

public class clienteOrdemAnoNascimentoReversa implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) { return o2.getAnoNascimento() - o1.getAnoNascimento(); }

}

/*Crie uma lista de um objeto complexo e execute as seguintes operações.--
 * Adicione elementos nesta lista.--
 * Ordene implementando a interface java.util.Comparator no seu objeto complexo.--
 * Ordene implementando um novo objeto com a interface java.util.Comparable.--
 * Ordene usando uma expressão lambda na chamada de suaLista.sort().--
 * Ordene usando referencias de metodos e os metodos estaticos de Comparator.--
 * Ordene coleções TreeSet e TreeMap.--*/