package exemplosAulas;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exemploCollectionHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        //Adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);
        System.out.println("1 - "+notasAlunos);

        //Remove a nota do set
        notasAlunos.remove(3.8);
        System.out.println("2 - "+notasAlunos);

        //Retorna a quantidade de itens do set
        System.out.println("3 - "+notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()) {
            System.out.println("4 - "+iterator.next());
        }

        for (Double nota: notasAlunos) {
            System.out.println("5 - "+nota);
        }

        notasAlunos.clear();
        //Retorna se o set esta vazio ou não
        System.out.println("6 - "+notasAlunos.isEmpty());
    }
}










