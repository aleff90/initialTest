package exemplosAulas;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class exemploCollectionLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequenciaNumerica = new LinkedHashSet<>();

        //Adicionando os numeros no set
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(1);
        System.out.println("1 - "+sequenciaNumerica);

        //Remove o numero do set
        sequenciaNumerica.remove(4);
        System.out.println("2 - "+sequenciaNumerica);

        //Retorna a quantidade de elementos no set
        System.out.println("3 - "+sequenciaNumerica.size());

        //Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();
        while (iterator.hasNext()) {
            System.out.println("4 - "+iterator.next());
        }

        for (Integer numero: sequenciaNumerica) {
            System.out.println("5 - "+numero);
        }

        sequenciaNumerica.clear();

        //Retorna se o set está vazio ou não
        System.out.println(sequenciaNumerica.isEmpty());
    }
}









