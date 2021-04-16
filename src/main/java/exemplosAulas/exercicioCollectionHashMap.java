package exemplosAulas;

import java.util.Map;
import java.util.TreeMap;

public class exercicioCollectionHashMap {
    public static void main(String[] args) {

        TreeMap<String, String> estadosBrasileiros = new TreeMap<>();

        estadosBrasileiros.put("AC", "Acre");
        estadosBrasileiros.put("AL", "Alagoas");
        estadosBrasileiros.put("AP", "Amapa");
        estadosBrasileiros.put("AM", "Amazonas");
        estadosBrasileiros.put("BA", "Bahia");
        estadosBrasileiros.put("CE", "Ceara");
        estadosBrasileiros.put("ES", "Espirito Santo");
        estadosBrasileiros.put("GO", "Goias");
        estadosBrasileiros.put("MA", "Maranhão");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("PA", "Para");
        estadosBrasileiros.put("PB", "Paraiba");
        estadosBrasileiros.put("PR", "Parana");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piauí");
        estadosBrasileiros.put("RJ", "Rio de Janeiro");
        estadosBrasileiros.put("RN", "Rio Grande do Norte");
        estadosBrasileiros.put("RS", "Rio Grande do Sul");
        estadosBrasileiros.put("RO", "Rondonia");
        estadosBrasileiros.put("RR", "Roraima");
        estadosBrasileiros.put("SC", "Santa Catarina");
        estadosBrasileiros.put("SP", "São Paulo");
        estadosBrasileiros.put("SE", "Sergipe");
        estadosBrasileiros.put("TO", "Tocantins");
        System.out.println("\n 1 - Lista de estados brasileiros: "+estadosBrasileiros);

        estadosBrasileiros.remove("MG");
        System.out.println("\n 2 - Lista de estados brasileiros excluindo minas gerais: "+estadosBrasileiros);

        estadosBrasileiros.put("DF", "Distrito Federal");
        System.out.println("\n 3 - Adicionando distrito federal: "+estadosBrasileiros);

        System.out.println("\n 4 - Tamanho do mapa: "+estadosBrasileiros.size());

        if (estadosBrasileiros.containsValue("Mato Grosso do Sul")) {
            estadosBrasileiros.remove("MS");
            System.out.println("\n 5 - Lista de estados brasileiros excluindo mato grosso do sul: " + estadosBrasileiros);
        } else {
            System.out.println("\n 5 - O elemento Mato Grosso do Sul não esta presente!" + estadosBrasileiros);
        }

        for (Map.Entry<String, String> estados:estadosBrasileiros.entrySet()){
            System.out.println(estados.getValue()+" ("+estados.getKey()+")");
        }

        System.out.println("\n 6 - O estado de Santa Catarina existe no mapa: " + estadosBrasileiros.containsKey("SC"));

        System.out.println("\n 7 - O estado do Maranhao existe no mapa: " + estadosBrasileiros.containsValue("Maranhão"));

        System.out.println("\n " + estadosBrasileiros.get("MG"));
    }
}

/*Adicione os 26 estados Brasileiros no mapa, onde a sigla sera a chave e o nome do estado o valor.--
* Remova o estado de Minas Gerais.--
* Adicione o Distrito Federal.--
* Verifique o tamanho do mapa.--
* Remova o estado do Mato Grosso do Sul usando o nome.--
* Navegue em todos os registros do mapa, mostrando no console no seguinte formato: NOME (SIGLA).--
* Verifique se o estado de Santa Catarina existe no map buscando por sua sigla (SC).--
* Verifique se o estado de Maranhão existe no map buscando por seu nome.--*/