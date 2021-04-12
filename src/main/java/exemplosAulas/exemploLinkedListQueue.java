package exemplosAulas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exemploLinkedListQueue {
    public static void main(String[] args) {

        Queue<String> filaDeBanco = new LinkedList<>();

        filaDeBanco.add("Pamela");
        filaDeBanco.add("Patricia");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flavio");
        filaDeBanco.add("Anderson");
        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);

        //filaDeBanco.clear();

        String primeiroCliente = filaDeBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaDeBanco);

        //String primeiroClienteOuErro = filaDeBanco.element();

        //System.out.println(primeiroClienteOuErro);

       // System.out.println(filaDeBanco);

        for (String client: filaDeBanco) {
            System.out.println(client);
        }

        Iterator<String> iteratorFilaDeBanco = filaDeBanco.iterator();

        while (iteratorFilaDeBanco.hasNext()) {
            System.out.println("--->"+iteratorFilaDeBanco.next());
        }
        System.out.println(filaDeBanco.size());

        //filaDeBanco.clear();

        System.out.println(filaDeBanco.isEmpty());

        filaDeBanco.add("Wesley");

        System.out.println(filaDeBanco);
    }
}





