package exemplosAulas;

public class multipleAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 25;

    public static void main(String[] args) {
         multipleAttributes myObj = new multipleAttributes();
         System.out.println("Name: "+myObj.fname+" "+myObj.lname);
         System.out.println("Age: "+myObj.age);
    }
}
