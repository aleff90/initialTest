package inheritanceExample;

public class Car extends Vehicle{
    final private String modelName = "Mustang"; //car attribute

    public static void main(String[] args) {

        //create a myCar object
        Car myCar = new Car();

        //call the weight() method (from vehicle class) on the myCar object
        myCar.weight();

        //display the value of the brand attribute (from the vehicle class) and the value of the modelName
        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}
