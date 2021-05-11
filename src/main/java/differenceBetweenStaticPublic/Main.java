package differenceBetweenStaticPublic;

public class Main {
    //static method
    static void myStaticMethod(){
        System.out.println("\n Static methods can be called without creating objects");
    }
    //public method
    public void myPublicMethod(){
        System.out.println("\n Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
        myStaticMethod(); //call the static method
        //myPublicMethod(); //this would compile a error
        Main myObj = new Main(); //creates a objects of main class
        myObj.myPublicMethod(); //call the public method on object
    }
}
