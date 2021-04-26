package exemplosAulas;

public class constructorMultiParametersExample {
    int modelYear;
    String modelName;

    public constructorMultiParametersExample (int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        constructorMultiParametersExample myCar = new constructorMultiParametersExample(1969,"Mustang");
        System.out.println(myCar.modelYear+" - "+myCar.modelName);
    }
}
