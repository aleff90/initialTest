package exemplosAulas;

public class listaNumeroPar {
    public static void main(String[]args) {
        System.out.println("listagem de numero");
        for (int i=1; i<=10; i++)
            if (i%2==0) {
                System.out.println("numero par: " + i);
            }
    }
}
