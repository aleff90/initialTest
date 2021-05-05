package callingMethods;
//create a Main class
public class Main {
    //create a fullThrottle method
    public void fullThrottle(){
        System.out.println("\n The car is going as fast as it can!");
    }
    //create a speed method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("\n The max speed is "+maxSpeed);
    }
    //inside Main call the methods on the myCar objects
    public static void main(String[] args) {
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
