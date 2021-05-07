package doWhile;

public class Main {
    public static void main(String[] args) {
        int idade = 2;
        do {
            System.out.println("\n Permissão negada!");
            idade++;
        } while (idade<5);
        System.out.println("\n Permissão concedida!");
    }
}
