package collectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //instanciando um arrayList
        List<String> nomes = new ArrayList<>();

        //adicionando varios elementos na lista
        nomes.add("Vanya");
        nomes.add("Dmitri");
        nomes.add("Svetlana");
        nomes.add("Ivan");
        nomes.add("Olga");
        nomes.add("Vladmir");

        //exibindo elementos no console
        System.out.println("\n 1 - Exibindo lista de nomes: "+nomes);

        //alterando o elemento 2
        nomes.set(2, "Tamires");
        System.out.println("\n 2 - Exibindo lista de nomes excluindo o elemento 2: "+nomes);

        //reordenando em ordem alfabetica
        Collections.sort(nomes);
        System.out.println("\n 3 - Ordenando alfabéticamente: "+nomes);

        //alternando o elemento 2 depois da ordenação
        nomes.set(2, "Diana");
        System.out.println("\n 4 - Substituindo o elemento 2: "+nomes);

        //removendo o index 4
        nomes.remove(4);
        System.out.println("\n 5 - Lista de nomes excluindo o index 4: "+nomes);

        //removendo o indice "Tamires"
        nomes.remove("Tamires");
        System.out.println("\n 6 - Lista de nomes excluindo o indice Tamires: "+nomes);

        //retornando o elemento na posição 3
        String nome = nomes.get(3);
        System.out.println("\n 7 - Retornando e exibindo o elemento na posição 3: "+nome);

        //retornando a posição do elemento "Ivan"
        int posicao = nome.indexOf("Ivan");
        System.out.println("\n 8 - Retornando e exibindo a posição do elemento Ivan: "+posicao);

        //retornando o tamanho da lista
        int tamanho = nomes.size();
        System.out.println("\n 9 - Total de elementos na lista: "+tamanho);

        //removendo o elemento Diana
        nomes.remove("Diana");
        System.out.println("\n 10 - Exibindo lista excluindo o elemento Diana: "+nomes);

        //retornando novamente o tamanho da lista
        int tamanhoSegundo = nomes.size();
        System.out.println("\n 11 - Total de elementos na lista: "+tamanhoSegundo);

        //checando se há algum elemento "Natasha"
        //nomes.contains("Natasha");
        boolean temNatasha = nomes.contains("Natasha");
        System.out.println("\n 12 - O elemento Natasha está presente na lista? "+temNatasha);

        //verificamos se a lista esta vazia
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println("\n 13 - A lista esta vazia? "+listaEstaVazia);

        //iterando dentro de uma lista com for
        System.out.println("\n ----------");
        System.out.println("\n 14 - Listando com for: ");
        for(String noDoItem: nomes){
            System.out.println("-->"+noDoItem);
        }
        System.out.println("\n ----------");

        //iterando dentro de uma lista com while
        System.out.println("\n 15 - Listando com while: ");
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("---->"+iterator.next());
        }

        System.out.println("\n ----------");

        //limpando a lista e verificando novamente se esta vazia
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println("\n 16 - A lista esta vazia? "+listaEstaVazia);
    }
}
