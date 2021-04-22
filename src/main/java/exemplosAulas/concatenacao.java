package exemplosAulas;
import java.util.Arrays;
public class concatenacao {
    public static void main(String[]args) {

        String name = "Andy";                 //var name = "Andy";
        String midName = " Smith";            //var name = "Smith";
        String completeName = name + midName; //final var completeName = name + midName;

        System.out.println(name);
        System.out.println("Client name: "+name);
        System.out.println("Complete client name: "+completeName);

        String string = "My String";          //var string = "My String";
        System.out.println(string);

        System.out.println("A B C D E F G".toCharArray());
        System.out.println(Arrays.toString("Java Learning".split("")));
        System.out.println("Study".concat(" of Java"));
        System.out.println("1234 test qw".replaceAll("[0-9]", "#"));
    }
}