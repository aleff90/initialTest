package overloadMethod;

public class Main {
    static int plusMethodInt (int a, int b){
        return a/b;
    }
    static double plusMethodDouble (double c, double d){
        return c-d;
    }
    static long plusMethodLong (long e, long f){
        return e+f;
    }
    static float plusMethodFloat (float g, float h){
        return g*h;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(85656777,64);
        double myNum2 = plusMethodDouble(457.9841,25.6547);
        long myNum3 = plusMethodLong(654159587,847512368);
        float myNum4 = plusMethodFloat(145762513,524789510);
        System.out.println("\n Int = "+myNum1);
        System.out.println("\n Double = "+myNum2);
        System.out.println("\n Long = "+myNum3);
        System.out.println("\n Float = "+myNum4);
    }
}
