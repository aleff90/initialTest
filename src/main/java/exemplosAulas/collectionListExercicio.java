package exemplosAulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionListExercicio {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");
        System.out.println("1 - Lista de nomes: "+nomes);

        nomes.set(2, "Roberto");
        System.out.println("2 - Substituindo Carlos por Roberto: "+nomes);

        System.out.println("3 - Exibindo o nome na posição '1': "+nomes.get(1));

        nomes.remove(4);
        System.out.println("5 - Removendo a posição '4': "+nomes);

        if (nomes.contains("João")) {
            nomes.remove("João");
            System.out.println("6 - Exibindo lista de nomes sem o João: "+nomes);
        } else {
            System.out.println("6 - João já foi removido!");
        }

        System.out.println("7 - Exibindo a quantidade de itens da lista de nomes: "+nomes.size());

        if (nomes.contains("Juliano")) {
            System.out.println("8 - Juliano esta na lista!");
        } else {
            System.out.println("8 - Juliano não esta na lista!");
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Ismael");
        nomes2.add("Rodrigo");
        System.out.println("9 - Segunda lista de nomes: "+nomes2);

        nomes.addAll(nomes2);
        System.out.println("10 - Nova lista de nomes: "+nomes);

        Collections.sort(nomes);
        System.out.println("11 - Ordem alfabética da lista de nomes: "+nomes);

        if (nomes.isEmpty()) {
            System.out.println("12 - A lista de nomes esta vazia!");
        } else {
            System.out.println("12 - A lista de nomes não esta vazia, exibindo a lista: "+nomes);
        }

        nomes2.clear();
        if (nomes2.isEmpty()) {
            System.out.println("13 - A segunda lista de nomes esta vazia!");
        } else {
            System.out.println("13 - Segunda lista de nomes não esta vazia, exibindo a lista: "+nomes2);
        }
    }
}

/*Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João.--
* Navegue na lista exibindo cada nome no console.--
* Substitua o nome Carlos por Roberto.--
* Retorne o nome da posição 1.--
* Remova o nome da posição 4.--
* Remova o nome João.--
* Retorne a quantidade de itens na lista.--
* Verifique se o nome Juliano existe na lista.--
* Crie uma nova lista com os nomes: Ismael e Rodrigo.--
* Adicione todos os itens da nova lista na primeira lista criada.--
* Ordene os itens da lista por ordem alfabética.--
* Verifique se a lista está vazia.--*/