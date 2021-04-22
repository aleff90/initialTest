package exemplosAulas;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class collectionsTreeMap {
    public static void main(String[] args) {

        TreeMap<String, String> treeCapitals = new TreeMap<>();

        //Monta a arvore com as capitais
        treeCapitals.put("RS", "Porto Alegre");
        treeCapitals.put("SC", "Florianópolis");
        treeCapitals.put("PR", "Curitiba");
        treeCapitals.put("SP", "São Paulo");
        treeCapitals.put("RJ", "Rio de Janeiro");
        treeCapitals.put("MG", "Belo Horizonte");
        System.out.println(treeCapitals);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitals.firstKey());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitals.lastKey());

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitals.lowerKey("SC"));

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitals.higherKey("SC"));

        //Exibe todas as capitais no console
        System.out.println(treeCapitals);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitals.firstEntry().getKey()+" - "+treeCapitals.firstEntry().getValue());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitals.lastEntry().getKey()+" - "+treeCapitals.lastEntry().getValue());

        //Retorna a primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitals.lowerEntry("SC").getKey()+" - "+treeCapitals.lowerEntry("SC").getValue());

        //Retorna a primeira capital acima na arvore da capital parametrizada
        System.out.println(treeCapitals.higherEntry("SC").getKey()+" - "+treeCapitals.higherEntry("SC").getValue());

        //Exibe todas as capitais no console
        System.out.println(treeCapitals);

        Map.Entry<String, String> firstEntry = treeCapitals.pollFirstEntry();
        Map.Entry<String, String> lastEntry = treeCapitals.pollLastEntry();

        //Retorna a primeira capital no topo da arvore, removendo do map
        System.out.println(firstEntry.getKey()+" - "+firstEntry.getValue());

        //Retorna a primeira capital no final da arvore, removendo do map
        System.out.println(lastEntry.getKey()+" - "+lastEntry.getValue());

        //Exibe as capitais no console
        System.out.println(treeCapitals);

        //Navega em todas as chaves do iterator
        Iterator<String> iterator = treeCapitals.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key+" - "+treeCapitals.get(key));
        }

        for (String capital: treeCapitals.keySet()){
            System.out.println(capital+" -- "+treeCapitals.get(capital));
        }

        for (Map.Entry<String, String> capital: treeCapitals.entrySet()){
            System.out.println(capital.getKey()+" --- "+capital.getValue());
        }
        System.out.println(treeCapitals.higherKey("SP"));
    }
}

















