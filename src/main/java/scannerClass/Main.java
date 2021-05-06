package scannerClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);

        System.out.println("\n Enter you name ");
        String name = text.nextLine();
        System.out.println(" Your name is "+name);

        System.out.println("\n Enter your birth year ");
        int year = text.nextInt();
        System.out.println(" Your birth year is "+year);

        text.close();
    }
}
