package exemplosAulas;
//import java.lang.Exception;
import java.util.Scanner;
public class classeScanner {
    public static void main(String[]args) {
        Scanner text = new Scanner(System.in);
        //String str;

        //try {
            System.out.println("Enter your name: ");
            String name = text.nextLine();
            System.out.println("Wellcome " + name);
        //} catch (Exception one) { System.out.println("Type correctly!"); }

        //try {
            System.out.println("Imput a number: ");
            int numero = text.nextInt();
            System.out.println("The number entered was: " + numero);
        //} catch (Exception two) { System.out.println("Type correctly!"); }
        
        text.close();
    }
}
