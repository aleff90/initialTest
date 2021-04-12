package exemplosAulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exemploCollectionList {
    public static void main(String[] args) {
        //Instanciando um arrayList
        List<String> nomes = new ArrayList<>();

        //Adicionando varios elementos na lista
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        //Mostrando os elementos no console
        System.out.println(nomes);

        //Alterando o elemento 2
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //Reordenando em ordem alfabética
        Collections.sort(nomes);

        //Alterando o elemento 2 depois da ordenação
        nomes.set(2, "Wesley");
        System.out.println(nomes);

        //Removendo o index 4
        nomes.remove(4);
        System.out.println(nomes);

        //Removendo o indice "Wesley"
        nomes.remove("Wesley");
        System.out.println(nomes);

        //Retornando o nome da posição 3
        String nome = nomes.get(3);
        System.out.println(nome);

        //Retornando a posição do elemento "Wesley"
        int posicao = nomes.indexOf("Wesley");
        System.out.println(posicao);

        //Retornando o tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);

        //Removendo o elemento "Larissa"
        nomes.remove("Larissa");

        //Retornando novamente o tamanho da lista
        tamanho = nomes.size();
        System.out.println(tamanho);

        //Checando se há algum elemento "Anderson"
        nomes.contains("Anderson");
        boolean temAndersom = nomes.contains("Anderson");
        System.out.println(temAndersom);

        //Checando se há algum elemento "Fernando"
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);

        //Verificamos se a lista esta vazia
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        //Iterando dentro de uma lista com for
        for (String nomeDoItem: nomes) {
            System.out.println("-->"+nomeDoItem);
        }

        //Iterando dentro de uma lista com while
        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            System.out.println("----->"+iterator.next());
        }

        //Limpando a lista e verificando novamente se esta vazia
        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);
    }
}





