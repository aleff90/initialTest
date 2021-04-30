package differentTypesOfScannerClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("\n Enter name, age and salary!");

        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("\n The "+name+" have "+age+" years old and gain "+salary+"!");
    }
}
