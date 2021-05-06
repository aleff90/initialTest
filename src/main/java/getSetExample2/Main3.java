package getSetExample2;

public class Main3 {
    public static void main(String[] args) {
        Person myObj = new Person();
        myObj.name = "John"; //error while String name stay private
        System.out.println(myObj.name); //error while String name stay private
    }
}
