package collectionLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        LinkedHashSet<Float> sequenciaNumerica = new LinkedHashSet<>();

        //adicionando os numeros no set
        sequenciaNumerica.add(548792305F);
        sequenciaNumerica.add(785102456F);
        sequenciaNumerica.add(958746213F);
        sequenciaNumerica.add(874512659F);
        sequenciaNumerica.add(120324568F);
        System.out.println("\n 1 - Exibindo a sequencia de valores: "+sequenciaNumerica);

        //removendo um elemento do set
        sequenciaNumerica.remove(958746213F);
        System.out.println("\n 2 - Exibindo sequencia numerica excluindo o valor 9.5874624E8: "+sequenciaNumerica);

        //retorna a quantidade de elementos no set
        System.out.println("\n 3 - Total de elementos: "+sequenciaNumerica.size());

        //navega em todos os itens do iterator
        System.out.println("\n ----------");
        Iterator<Float> iterator = sequenciaNumerica.iterator();
        while(iterator.hasNext()){
            System.out.println("\n 4 - Exibindo elementos via iterator: "+iterator.next());
        }
        System.out.println("\n ----------");

        for(Float numero: sequenciaNumerica){
            System.out.println("\n 5 - Exibindo elementos via for: "+numero);
        }
        System.out.println("\n ----------");

        sequenciaNumerica.clear();
        //retorna se o set esta vazio ou nao
        System.out.println("\n 6 - O set esta vazio? "+sequenciaNumerica.isEmpty());
    }
}
