package exemplosAulas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exampleList {
    public static void main(String[] args) {
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");
        System.out.println(nomes);

        nomes.set(2, "Larissa");
        System.out.println(nomes);

        Collections.sort(nomes);

        nomes.set(2, "Wesley");
        System.out.println(nomes);

        nomes.remove(4);
        System.out.println(nomes);

        nomes.remove("Wesley");
        System.out.println(nomes);

        String nome = nomes.get(3);
        System.out.println(nome);
        int posicao = nomes.indexOf("Wesley");
        System.out.println(posicao);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");
        tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.contains("Anderson");
        boolean temAndersom = nomes.contains("Anderson");
        System.out.println(temAndersom);
        boolean temFernando = nomes.contains("Fernando");
        System.out.println(temFernando);
        boolean listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

        nomes.clear();
        listaEstaVazia = nomes.isEmpty();
        System.out.println(listaEstaVazia);

    }
}





