package collectionsTreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();

        //monta a arvore de elementos
        treeCapitais.put("RS", "Porto Alegre");
        treeCapitais.put("SC", "Florianopolis");
        treeCapitais.put("PR", "Curitiba");
        treeCapitais.put("SP", "São Paulo");
        treeCapitais.put("RJ", "Rio de Janeiro");
        treeCapitais.put("MG", "Belo Horizonte");
        System.out.println("\n 1 - Capitais -> "+treeCapitais);

        //retorna o primeiro elemento no topo da arvore
        System.out.println("\n 2 - Primeira capital -> "+treeCapitais.firstKey());

        //retorna o ultimo elemento
        System.out.println("\n 3 - Ultima capital -> "+treeCapitais.lastKey());

        //retorna o elemento seguinte ao elemento referenciado
        System.out.println("\n 4 - Capital seguinte à SC -> "+treeCapitais.lowerKey("SC"));

        //retorna o elemento anterior ao elemento referenciado
        System.out.println("\n 5 - Capital anterior à SC -> "+treeCapitais.higherKey("SC"));

        //retorna o primeiro elemento no topo da arvore
        System.out.println("\n 6 - Primeiro elemento -> "+treeCapitais.firstEntry().getKey()+" - "+treeCapitais.firstEntry().getValue());

        //retorna o ultimo elemento na base da arvore
        System.out.println("\n 7 - Ultimo elemento -> "+treeCapitais.lastEntry().getKey()+" - "+treeCapitais.lastEntry().getValue());

        //retorna o elemento seguinte ao elemento referenciado
        System.out.println("\n 8 - Capital seguinte à RJ -> "+treeCapitais.lowerEntry("RJ").getKey()+" - "+treeCapitais.lowerEntry("RJ").getValue());

        //retorna o elemento anterior ao elemento referenciado
        System.out.println("\n 9 - Capital anterior à RJ -> "+treeCapitais.higherEntry("RJ").getKey()+" - "+treeCapitais.higherEntry("RJ").getValue());

        Map.Entry<String, String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitais.pollLastEntry();

        //retorna o primeiro elemento da arvore, removendo-o
        System.out.println("\n 10 - Exibindo primeira capital removendo-a -> "+treeCapitais.firstEntry().getKey()+" - "+firstEntry.getValue());

        //retorna o ultimo elemento da arvore, removendo-o
        System.out.println("\n 11 - Exibindo ultima capital e removendo-a -> "+treeCapitais.lastEntry().getKey()+" - "+lastEntry.getValue());

        //navega em todas as chaves do iterator
        System.out.println("\n 12 - Navegando em todas as chaves do iterator:");
        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            System.out.println(key+" - "+treeCapitais.get(key));
        }

        System.out.println("\n 13 - Navegando em todas as chaves com for:");
        for(String capital: treeCapitais.keySet()){
            System.out.println(capital+" - "+treeCapitais.get(capital));
        }

        System.out.println("\n 14 - Navegando em todas as chaves com for:");
        for(Map.Entry<String, String> capital: treeCapitais.entrySet()){
            System.out.println(capital.getKey()+" - "+capital.getValue());
        }
    }
}
