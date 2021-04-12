package exemplosAulas;

import java.util.Iterator;
import java.util.TreeSet;

public class exemploCollectionTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitals = new TreeSet<>();

        //Monta a arvore com as capitais
        treeCapitals.add("Porto Alegre");
        treeCapitals.add("Florianopolis");
        treeCapitals.add("Curitiba");
        treeCapitals.add("São Paulo");
        treeCapitals.add("Rio de Janeiro");
        treeCapitals.add("Belo Horizonte");
        System.out.println("1 - "+treeCapitals);

        //Retorna a primeira capital no topo da arvore
        System.out.println("2 - "+treeCapitals.pollFirst());

        //Retorna a ultima capital no final da arvore
        System.out.println("3 - "+treeCapitals.pollLast());

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println("4 - "+treeCapitals.lower("Florianopolis"));

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println("5 - "+treeCapitals.higher("Florianoplis"));

        //Exibe todas as capitais no console
        System.out.println("6 - "+treeCapitals);

        //Navega em todas os itens do iterator
        Iterator<String> iterator = treeCapitals.iterator();
        while (iterator.hasNext()) {
            System.out.println("7 - "+iterator.next());
        }

    }
}












