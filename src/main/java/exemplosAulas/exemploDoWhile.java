package exemplosAulas;

public class exemploDoWhile {
    public static void main(String[]args) {
        int idade = 2;
        do { System.out.println("Permissão negada!");
            idade++;
        } while (idade<20);
        System.out.println("\nPermissão concedida");
    }
}
