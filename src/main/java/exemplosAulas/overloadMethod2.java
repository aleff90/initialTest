package exemplosAulas;

public class overloadMethod2 {
    static int plusMethod(int a, int b){
        return a+b;
    }
    static double plusMethod(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(10, 20);
        double myNum2 = plusMethod(20.6, 30.9);
        System.out.println("Int :"+myNum1);
        System.out.println("Double :"+myNum2);
    }
}
