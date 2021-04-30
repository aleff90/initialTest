package enumWithForExample;
enum Level {
    MAX,
    MID,
    MIN
}
public class Main {
    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
