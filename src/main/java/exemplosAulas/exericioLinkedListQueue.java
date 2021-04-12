package exemplosAulas;

import java.util.LinkedList;
import java.util.Queue;

public class exericioLinkedListQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Juliana");
        fila.add("Pedro");
        fila.add("Carlos");
        fila.add("Larissa");
        fila.add("João");
        System.out.println("1 - Nomes na fila: "+fila);

        System.out.println("2 - Exibindo primeiro nome da fila sem remove-lo: "+fila.peek());
        System.out.println("3 - Nomes na fila: "+fila);

        System.out.println("4 - Exibindo primeiro nome na fila removendo-o: "+fila.poll());
        System.out.println("5 - Nomes na fila: "+fila);

        fila.add("Daniel");
        System.out.println("6 - Adicionando Daniel na fila: "+fila);

        System.out.println("7 - Quantidade de elementos na fila: "+fila.size());

        if (fila.isEmpty()) {
            System.out.println("8 - A fila esta vazia!");
        } else {
            System.out.println("8 - A fila não está vazia, exibindo a fila: "+fila);
        }

        if (fila.contains("Carlos")) {
            System.out.println("9 - Carlos está na lista!");
        } else {
            System.out.println("9 - Carlos não está na lista!");
        }
    }
}

/*Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.--
* Navegue na fila exibindo cada nome no console.--
* Retorne o primeiro item da fila, sem remove-lo.--
* Retorne o primeiro item da fila, removendo o mesmo.--
* Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.--
* Retorne o tamanho da lista.--
* Verifique se a lista está vazia.--
* Verifique se o nome Carlos está na lista.--*/
