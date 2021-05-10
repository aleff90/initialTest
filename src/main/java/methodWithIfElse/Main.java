package methodWithIfElse;

public class Main {
    public static void main(String[] args) {
        checkAge(45); //call the checkAge method and pass along an age of 20
    }
    //create a checkAge() method with an integer variable called age
    static void checkAge(int age){
        //if age is less than 18, print "access denied"
        if(age<18){
            System.out.println("\n Entrada não permitida!");
        }else{
            //if age is grater than, or equal to, 18, print "access granted"
            System.out.println("\n Entrada permitida!");
        }
    }
}
