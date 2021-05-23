package lambdaStoreVariable;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ArrayList<Float> numbers = new ArrayList<>();
        numbers.add(548621304F);
        numbers.add(785412698F);
        numbers.add(469875134F);
        numbers.add(124578951F);
        Consumer<Float> method = System.out::println;
        numbers.forEach(method);
    }
}
