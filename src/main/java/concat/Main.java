package concat;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String name = "John";//var name, string type, John
        String midName = " Campbell";//var midName, string type, Campbell
        String fullName = name+midName;//final var completeName, string type, John Campbell

        System.out.println("\n Client name: "+name);
        System.out.println(" Full name client: "+fullName);

        String string = " MyString";//var named string, string type
        System.out.println(string);

        System.out.println("\n A B C D E F G".toCharArray());
        System.out.println(Arrays.toString(" Java Learning".split("")));
        System.out.println("\n Study".concat(" of Java"));
        System.out.println("\n 1234 test qw".replaceAll("[0-9]","#"));
    }
}
