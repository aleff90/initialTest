package collectionQueueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Vlad");
        fila.add("Tamiris");
        fila.add("Ivan");
        fila.add("Natalia");
        fila.add("Dmitri");
        System.out.println("\n 1 - Exibindo lista de nomes -> "+fila);

        System.out.println("\n 2 - Exibindo o primeiro nome da fila sem removê-lo -> "+fila.peek());
        System.out.println("\n 3 - Nomes na fila -> "+fila);

        System.out.println("\n 4 - Exibindo o primeiro nome da fila removendo-o -> "+fila.poll());
        System.out.println("\n 5 - Nomes na fila -> "+fila);

        fila.add("Svetlana");
        System.out.println("\n 6 - Adicionando mais um elemento na fila -> "+fila);

        System.out.println("\n 7 - Quantidade de elementos na fila -> "+fila.size());

        if(fila.isEmpty()){
            System.out.println("\n 8 - A fila esta vazia!");
        }else{
            System.out.println("\n 8 - A fila não esta vazia, exibindo-a -> "+fila);
        }

        if(fila.contains("Carlos")){
            System.out.println("\n 9 - O elemento especificado esta na fila!");
        }else{
            System.out.println("\n 9 - O elemento especificado não esta na fila, exibindo-a -> "+fila);
        }
    }
}
