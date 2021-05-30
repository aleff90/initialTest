package collectionsHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //adicionando os campeoes mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);
        System.out.println("\n 1 - Campeões mundiais fifa -> "+campeoesMundialFifa);

        //altera o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println("\n 2 - Novo valor para Brasil -> "+campeoesMundialFifa);

        //retorna a Argentina
        System.out.println("\n 3 - Retornando o valor de Argentina -> "+campeoesMundialFifa.get("Argentina"));

        //retorna se existe ou nao França
        System.out.println("\n 4 - França esta presente? "+campeoesMundialFifa.containsKey("França"));

        //remove França
        campeoesMundialFifa.remove("França");
        System.out.println("\n 5 - Campeoes mundiais fifa excluindo França -> "+campeoesMundialFifa);

        //retornando se existe ou nao alguma selecao hexacampea
        System.out.println("\n 6 - Seleção hexacampea -> "+campeoesMundialFifa.containsValue(6));

        //retornando o tamanho do mapa
        System.out.println("\n 7 - Total de seleções -> "+campeoesMundialFifa.size());

        //navega nos registros do mapa
        System.out.println("\n ----------");
        for(Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()){
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }
        System.out.println("\n ----------");

        //navega nos registros do mapa
        for(String key: campeoesMundialFifa.keySet()){
            System.out.println(key+" --- "+campeoesMundialFifa.get(key));
        }
        System.out.println("\n ----------");

        //verifica se o mapa contem a chave Estados Unidos
        System.out.println("\n 8 - Estados Unidos esta presente? "+campeoesMundialFifa.containsKey("Estados Unidos"));

        //retorna se o mapa contem o valor 5
        System.out.println("\n 9 - Algum pentacampeão existente? "+campeoesMundialFifa.containsValue(5));

        //verifica o tamanho antes e depois de limpar o mapa
        System.out.println("\n 10 - Total de elementos -> "+campeoesMundialFifa.size());
        campeoesMundialFifa.clear();
        System.out.println("\n 11 - Total de elementos após exclusão -> "+campeoesMundialFifa.size());
    }
}
