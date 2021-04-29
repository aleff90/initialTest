package interfaceExample;
//interface
interface Animal {
    void animalColor(); //interface method (does not have a body)
    void sleep(); //interface method (does not have a body)
}
//Horse "implements" the Animal interface
class Horse implements Animal {
    public void animalColor() {
        //the body of animalColor() is provided here
        String animalColor = "black";
        System.out.println("The horse color is "+animalColor+". ");
    }
    public void sleep() {
        //the body of sleep() is provided here
        System.out.println("zzz");
    }
}
public class Main {
    public static void main(String[] args) {
        Horse myHorse = new Horse(); //create a horse object
        myHorse.animalColor();
        myHorse.sleep();
    }
}
