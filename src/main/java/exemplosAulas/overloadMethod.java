package exemplosAulas;

public class overloadMethod {
    static int plusMethodInt(int x, int y){
        return x+y;
    }
    static double plusMethodDouble(double x, double y){
        return x+y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("Int :"+myNum1);
        System.out.println("Double :"+myNum2);
    }
}
