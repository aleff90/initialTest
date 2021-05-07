package finalVar;

public class Main {
    final int x = 10;
    final double pi = 3.14;
    public static void main(String[] args) {
        Main myObj = new Main();
        //myObj.x = 50;//will generate a error: cannot assign a value to a final variable
        //myObj.pi = 25;//will generate a error: cannot assign a value to a final variable
        System.out.println(myObj.x);
        System.out.println(myObj.pi);
    }
}
