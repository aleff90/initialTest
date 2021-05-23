package collectionQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //criando uma queue list
        Queue<String> filaDeBanco = new LinkedList<>();

        //adicionando elementos na lista
        filaDeBanco.add("Diana");
        filaDeBanco.add("Dmitri");
        filaDeBanco.add("Tamiris");
        filaDeBanco.add("Ivan");
        filaDeBanco.add("Svetlana");

        //exibindo conteudo da lista
        System.out.println("\n 1 - Fila do banco: "+filaDeBanco);

        //retornando o primeiro item da lista e removendo-o
        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println("\n 2 - Cliente a ser atendido: "+clienteASerAtendido);
        System.out.println("\n 3 - Exibindo fila: "+filaDeBanco);

        //retorna o primeiro item da lista sem remove-lo
        String primeiroCliente = filaDeBanco.peek();
        System.out.println("\n 4 - Proximo cliente a ser atendido: "+primeiroCliente);
        System.out.println("\n 5 - Exibindo fila de banco: "+filaDeBanco);

        //String primeiroClienteOuErro = filaDeBanco.element();
        //System.out.println(primeiroClienteOuErro);
        //System.out.println(filaDeBanco);

        //iterando dentro da lista com for
        System.out.println("\n 6 - Exibindo lista com iterator for");
        for(String client: filaDeBanco){
            System.out.println("\n ---> "+client);
        }

        //iterando dentro da lista com while
        System.out.println("\n 7 - Exibindo lista com iterator while");
        Iterator<String> iteratorFilaDeBanco = filaDeBanco.iterator();
        while(iteratorFilaDeBanco.hasNext()){
            System.out.println("\n ---> "+iteratorFilaDeBanco.next());
        }

        //exibindo o tamanho da fila
        System.out.println("\n 8 - Total de elementos na fila: "+filaDeBanco.size());

        //verificando se fila esta vazia
        System.out.println("\n 9 - A fila esta vazia? "+filaDeBanco.isEmpty());

        //adicionando elemento na fila
        filaDeBanco.add("Igor");
        System.out.println("\n 10 - Exibindo fila: "+filaDeBanco);

    }
}
