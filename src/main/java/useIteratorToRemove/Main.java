package useIteratorToRemove;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(4);
        numbers.add(59);
        numbers.add(1);
        System.out.println("\n Numbers list: "+numbers);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i<10){
                it.remove();
            }
        }
        System.out.println("\n Numbers list without less 10: "+numbers);
    }
}
