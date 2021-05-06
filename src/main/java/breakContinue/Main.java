package breakContinue;

public class Main {
    public static void main(String[] args) {
        int i;
        System.out.println(" ");
        for (i=1;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(" i = "+i);
        }
        int j;
        System.out.println(" ");
        for (j=1;j<=10;j++){
            if (j==6){
                continue;
            }
            System.out.println(" j = "+j);
        }
        int m=1;
        System.out.println(" ");
        while (m<=10){
            System.out.println(" m = "+m);
            m++;
            if (m==6){
                break;
            }
        }
        int n=1;
        System.out.println(" ");
        while (n<=10){
            if (n==6){
                n++;
                continue;
            }
            System.out.println(" n = "+n);
            n++;
        }
    }
}
