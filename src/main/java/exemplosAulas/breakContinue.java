package exemplosAulas;

public class breakContinue {
    public static void main(String[] args) {
        int i;
        for (i=1; i<=10; i++) {
            if (i==5) {break;}
            System.out.println("i = "+i);
        }
        int j;
        for (j=1; j<=10; j++) {
            if (j==6) {continue;}
            System.out.println("j = "+j);
        }
        int k=0;
        while (k<10) {
            System.out.println("k = "+k);
            k++;
            if (k==4) {break;}
        }
        int m=0;
        while (m<10) {
            if (m==6) {m++; continue;}
            System.out.println("m = "+m);
            m++;
        }
    }
}
