package exemplosAulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exemploCollectionQueue {
    public static void main(String[] args) {
        //Criando uma queue list
        Queue<String> filaDeBanco = new LinkedList<>();

        //Adicionando elementos a lista
        filaDeBanco.add("Pamela");
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flavio");
        filaDeBanco.add("Anderson");

        //Exibindo o conteudo da lista
        System.out.println("1 - "+filaDeBanco);

        //Retornando o primeiro item da lista removendo o mesmo
        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println("2 - "+clienteASerAtendido);
        System.out.println("3 - "+filaDeBanco);

        //Retornando o primeiro elemento da lista sem remove-lo
        String primeiroCliente = filaDeBanco.peek();
        System.out.println("4 - "+primeiroCliente);
        System.out.println("5 - "+filaDeBanco);

        //String primeiroClienteOuErro = filaDeBanco.element();
        //System.out.println(primeiroClienteOuErro);
        // System.out.println(filaDeBanco);

        //Iterando dentro da lista com for
        for (String client: filaDeBanco) {
            System.out.println("6 - "+client);
        }

        Iterator<String> iteratorFilaDeBanco = filaDeBanco.iterator();
        //Iterando dentro da lista com while
        while (iteratorFilaDeBanco.hasNext()) {
            System.out.println("--->"+iteratorFilaDeBanco.next());
        }

        //Exibindo o tamanho da fila
        System.out.println("7 - "+filaDeBanco.size());

        //Exibindo o tamanho da fila
        //filaDeBanco.clear();
        System.out.println("8 - "+filaDeBanco.isEmpty());

        //Adicionando elemento a lista
        filaDeBanco.add("Wesley");
        System.out.println("9 - "+filaDeBanco);
    }
}





