package whileExample;

public class Main {
    public static void main(String[] args) {
        int idade = 11;
        while (idade<18){
            System.out.println("\n Permissão negada!");
            idade++;
        }
        System.out.println("\n Permissão concedida!");
    }
}
