package collectionHashMapExercise;
import java.util.Map;
import java.util.TreeMap;
public class Main {
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
        estadosBrasileiros.put("MA", "Maranhao");
        estadosBrasileiros.put("MT", "Mato Grosso");
        estadosBrasileiros.put("MS", "Mato Grosso do Sul");
        estadosBrasileiros.put("MG", "Minas Gerais");
        estadosBrasileiros.put("PA", "Para");
        estadosBrasileiros.put("PB", "Paraiba");
        estadosBrasileiros.put("PR", "Parana");
        estadosBrasileiros.put("PE", "Pernambuco");
        estadosBrasileiros.put("PI", "Piaui");
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
        System.out.println("\n 3 - Adicionando distrito federal à lista de estados brasileiros: "+estadosBrasileiros);

        System.out.println("\n 4 - Total de elementos na lista: "+estadosBrasileiros.size());

        if (estadosBrasileiros.containsValue("Mato Grosso do Sul")){
            estadosBrasileiros.remove("MS");
            System.out.println("\n 5 - Excluindo mato grosso do sul da lista: "+estadosBrasileiros);
        }else{
            System.out.println("\n 5 - Valor não encontrado na lista!");
        }

        System.out.println("\n 6 - Abaixo lista de estados utilizando laço de repetição for:");
        for(Map.Entry<String, String> estados:estadosBrasileiros.entrySet()){
            System.out.println(estados.getValue()+" ("+estados.getKey()+")");
        }

        System.out.println("\n 7 - O estado de Santa Catarina esta na lista? "+estadosBrasileiros.containsKey("SC"));

        System.out.println("\n 8 - O estado do Maranhao esta na lista? "+estadosBrasileiros.containsValue("Maranhao"));

        System.out.println("\n Retorne value associado à key MG: "+estadosBrasileiros.get("MG"));
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