package listaNumeroPar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Listagem de numeros pares entre 0 e 11:");
        for(int i=0;i<=11;i++){
            if(i%2==0){
                System.out.println(" "+i);
            }
        }
    }
}
