package constructor;

public class Main {
    int x; //create a class attribute
    //create a class constructor for the Main class
    public Main(){
        x=5; //set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        Main myObj = new Main(); //create an object of class Main (this will call the constructor)
        System.out.println("\n "+myObj.x); //print the value of x
    }
}

//will output 5