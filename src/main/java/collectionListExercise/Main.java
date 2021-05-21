package collectionListExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Wandy");
        nomes.add("John");
        nomes.add("Ruty");
        nomes.add("Mathews");
        nomes.add("Andrew");
        nomes.add("Bruce");
        System.out.println("\n 1 - Lista de nomes -> "+nomes);

        nomes.set(2, "James");
        System.out.println("\n 2 - Posição 2, substituindo Ruty por James -> "+nomes);

        System.out.println("\n 3 - Exibindo elemento na posição 3 -> "+nomes.get(3));

        nomes.remove(4);
        System.out.println("\n 4 - Exibindo lista de nomes excluindo o elemento Andrew na posição 4 -> "+nomes);

        if(nomes.contains("João")){
            nomes.remove("João");
            System.out.println("\n 5 - Exibindo lista de nomes excluindo o elemento João -> "+nomes);
        }else{
            System.out.println("\n 5 - Elemento João não esta presente na lista ou já foi removido");
        }

        System.out.println("\n 6 - Exibindo total de elementos na lista -> "+nomes.size());

        if(nomes.contains("Bruce")){
            nomes.remove("Bruce");
            System.out.println("\n 7 - Exibindo lista de nomes excluindo o elemento Bruce -> "+nomes);
        }else{
            System.out.println("\n 7 - Elemento Bruce não esta presente na lista ou já foi removido");
        }

        List<String> nomes2 = new ArrayList<>();

        nomes2.add("Jack");
        nomes2.add("Taylor");
        System.out.println("\n 8 - Segunda lista de nomes -> "+nomes2);

        nomes.addAll(nomes2);
        System.out.println("\n 9 - Elementos da lista 2 incluídos na lista 1 -> "+nomes);

        Collections.sort(nomes);
        System.out.println("\n 10 - Lista em ordem alfabética -> "+nomes);

        if(nomes.isEmpty()){
            System.out.println("\n 11 - A lista esta vazia!");
        }else{
            System.out.println("\n 11 - A lista não esta vazia! Contém os seguintes elementos -> "+nomes);
        }

        nomes2.clear();
        if(nomes2.isEmpty()){
            System.out.println("\n 12 - A lista esta vazia!");
        }else{
            System.out.println("\n 12 - A lista não esta vazia! Contém os seguintes elementos -> "+nomes2);
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