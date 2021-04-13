package exemplosAulas;
import java.util.Scanner;
public class classeScanner {
    public static void main(String[]args) {
        Scanner text = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = text.nextLine();
            System.out.println("Wellcome " + name);

            System.out.println("Imput a number: ");
            int numero = text.nextInt();
            System.out.println("The number entered was: " + numero);

        text.close();
    }
}
