package enumWithSwitchCaseExample;
enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar) {
            case LOW -> System.out.println("Low level");
            case MEDIUM -> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
        }
    }
}
