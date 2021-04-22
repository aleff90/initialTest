package exemplosAulas;

import java.util.HashMap;
import java.util.Map;

public class collectionsHashMap {
    public static void main(String[] args) {

        Map<String, Integer> campeoesMundialFifa = new HashMap<>();

        //Adicionando os campeões mundiais fifa no mapa
        campeoesMundialFifa.put("Brasil", 5);
        campeoesMundialFifa.put("Alemanha", 4);
        campeoesMundialFifa.put("Itália", 4);
        campeoesMundialFifa.put("Uruguai", 2);
        campeoesMundialFifa.put("Argentina", 2);
        campeoesMundialFifa.put("França", 2);
        campeoesMundialFifa.put("Inglaterra", 1);
        campeoesMundialFifa.put("Espanha", 1);
        System.out.println(campeoesMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeoesMundialFifa.put("Brasil", 6);
        System.out.println(campeoesMundialFifa);

        //Retorna a Argentina
        System.out.println(campeoesMundialFifa.get("Argentina"));

        //Retorna se existe ou nao um campeao França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Remove o campeao França
        campeoesMundialFifa.remove("França");

        //Retornando se existe ou nao um campeao França
        System.out.println(campeoesMundialFifa.containsKey("França"));

        //Retornando se existe ou nao alguma seleção hexa campea
        System.out.println(campeoesMundialFifa.containsValue(6));

        //Retornando o tamanho do mapa
        System.out.println(campeoesMundialFifa.size());

        System.out.println(campeoesMundialFifa);

        //Navega nos registros do mapa
        for (Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()) {
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }

        //Navega nos registros do mapa
        for (String key:campeoesMundialFifa.keySet()) {
            System.out.println(key+" ---- "+campeoesMundialFifa.get(key));
        }

        System.out.println(campeoesMundialFifa);

        //Verifica se o mapa contem a chave Estados Unidos
        System.out.println(campeoesMundialFifa.containsKey("Estados Unidos"));

        //Retorna se o mapa contem o valor 5
        System.out.println(campeoesMundialFifa.containsValue(5));

        //Verifica o tamanho antes e depois de limpar o mapa
        System.out.println(campeoesMundialFifa.size());
        campeoesMundialFifa.clear();
        System.out.println(campeoesMundialFifa.size());

    }
}








