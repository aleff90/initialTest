package constructorMultiParametersExample;

public class Main {
    int modelYear;
    String modelName;

    public Main(int year, String name){
        modelYear=year;
        modelName=name;
    }

    public static void main(String[] args) {
        Main myCar = new Main(1979, "Mustang");
        System.out.println("\n "+myCar.modelYear+" "+myCar.modelName);
    }
}
