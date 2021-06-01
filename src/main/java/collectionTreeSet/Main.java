package collectionTreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        //monta a arvore com as capitais
        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianópolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println("\n 1 - Exibindo capitais -> "+treeCapitals);

        //retorna a primeira capital da arvore
        System.out.println("\n 2 - Exibindo primeira capital, removendo-a da lista -> "+treeCapitals.pollFirst());

        //retorna a ultima capital da arvore
        System.out.println("\n 3 - Exibindo ultima capital, removendo-a da lista -> "+treeCapitals.pollLast());

        //retorna o elemento seguinte ao elemento especificado
        System.out.println("\n 4 - Capital seguinte à Florianópolis -> "+treeCapitals.lower("Florianópolis"));

        //retorna o elemento anterior ao elemento especificado
        System.out.println("\n 5 - Capital anterior à Florianópolis -> "+treeCapitals.higher("Florianópolis"));

        //exibindo o elementos após os polls
        System.out.println("\n 6 - Lista de capitais -> "+treeCapitals);

        //navega em todos os itens do iterator
        System.out.println("\n 7 - Navegando em todos os itens via iterator:");
        Iterator<String> iterator = treeCapitals.iterator();
        while(iterator.hasNext()){
            System.out.println(" ---"+iterator.next());
        }
    }
}
