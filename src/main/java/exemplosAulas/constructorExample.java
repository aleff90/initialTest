package exemplosAulas;

// create a constructorExample class
public class constructorExample {
    int x; //create a class attribute

    //create a class constructor for the constructorExample class
    public constructorExample() {
        x=5; //set the initial value for the class attribute x
    }

    public static void main(String[] args) {
        constructorExample myObj = new constructorExample(); //create an object of class constructorExample (this will call the constructor)
        System.out.println(myObj.x); //print the value of x
    }
}

// will output 5