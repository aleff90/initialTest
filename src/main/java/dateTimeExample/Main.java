package dateTimeExample;
import java.time.LocalDateTime; //import the LocalDateTime class
import java.time.format.DateTimeFormatter; //import the DateTimeFormatter class
public class Main {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("\n Before formatting: "+myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("\n After formatting: "+formattedDate);
    }
}
