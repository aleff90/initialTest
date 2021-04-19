package comparatorsExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class listaComparador {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Wellington", 1975));
        clientes.add(new Cliente("Jonas", 1980));
        clientes.add(new Cliente("Natasha", 1990));
        clientes.add(new Cliente("Ivan", 1964));
        clientes.add(new Cliente("Diana", 1987));

        System.out.println("\n 1 - Ordem de inserção: ");
        System.out.println(" "+clientes);

        clientes.sort((primeiro, segundo) -> primeiro.getAnoNascimento() - segundo.getAnoNascimento());

        System.out.println("\n 2 - Ordenado com a implementação da interface java.util.Comparator: ");
        System.out.println(" "+clientes);

        clientes.add(new Cliente("Dmitri", 1986));

        System.out.println("\n 3 - Novo cliente inserido: ");
        System.out.println(" "+clientes);

        clientes.sort((primeiro, segundo) -> primeiro.getAnoNascimento() - segundo.getAnoNascimento());

        System.out.println("\n 4 - Novo cliente ordenado na lista: ");
        System.out.println(" "+clientes);

        clientes.add(new Cliente("Tamiris", 1960));

        System.out.println("\n 5 - Novo cliente adicionado: ");
        System.out.println(" "+clientes);

        clientes.sort(Comparator.comparingInt(Cliente::getAnoNascimento));

        System.out.println("\n 6 - Ordenação de novo cliente na lista via expressão lambda: ");
        System.out.println(" "+clientes);

        clientes.sort(Comparator.comparingInt(Cliente::getAnoNascimento).reversed());

        System.out.println("\n 7 - Ordenados em forma reversa: ");
        System.out.println(" "+clientes);

        Collections.sort(clientes, new clienteOrdemAnoNascimentoReversa());

        System.out.println("\n 8 - Ordenados utilizando uma classe com um metodo: ");
        System.out.println(" "+clientes);

    }

}

/*Crie uma lista de um objeto complexo e execute as seguintes operações.--
 * Adicione elementos nesta lista.--
 * Ordene implementando a interface java.util.Comparator no seu objeto complexo.--
 * Ordene implementando um novo objeto com a interface java.util.Comparator.--
 * Ordene usando uma expressão lambda na chamada de suaLista.sort().--
 * Ordene usando referencias de metodos e os metodos estaticos de Comparator.--
 * Ordene coleções TreeSet e TreeMap.--*/