package collectionHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Double> notasAlunos = new HashSet<>();

        //adiciona as notas no set
        notasAlunos.add(546.3);
        notasAlunos.add(74.7);
        notasAlunos.add(653.7);
        notasAlunos.add(2148.5);
        notasAlunos.add(65.9);
        notasAlunos.add(985.6);
        notasAlunos.add(81.4);
        notasAlunos.add(27.7);
        System.out.println("\n 1 - Notas dos alunos: "+notasAlunos);

        //remove a nota do set
        notasAlunos.remove(65.9);
        System.out.println("\n 2 - Removendo a nota 65.9: "+notasAlunos);

        //retorna a quantidade de itens do set
        System.out.println("\n 3 - Total de itens: "+notasAlunos.size());

        //navega em todos os itens do iterator
        Iterator<Double> iterator = notasAlunos.iterator();

        System.out.println("\n -------------");
        while(iterator.hasNext()){
            System.out.println("\n 4 - Lista usando while: "+iterator.next());
        }
        System.out.println("\n -------------");

        System.out.println("\n -------------");
        for (Double nota: notasAlunos){
            System.out.println("\n 5 - Lista usando for: "+nota);
        }
        System.out.println("\n -------------");

        notasAlunos.clear();
        //retorna se o set esta vazio ou não
        System.out.println("\n 6 - Esta vazio ou não: "+notasAlunos.isEmpty());
    }
}
