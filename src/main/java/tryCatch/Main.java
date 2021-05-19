package tryCatch;

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println("\n " + myNumbers[10]);
        } catch(Exception e){
            System.out.println("\n Something went wrong.");
        } finally {
            System.out.println("\n The 'try catch' is finished.");
        }
    }
}
