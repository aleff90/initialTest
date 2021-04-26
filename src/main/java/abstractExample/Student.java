package abstractExample;

//subclass (inherit from Main)
public class Student extends Main2 {
    public int graduationYear = 2018;
    public void study() { //the body of the abstract method is provided here
        System.out.println("\n Studying all day long");
    }
}
