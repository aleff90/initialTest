package listaNumeroParImpar;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Lista de numeros pares entre 0 e 11:");
        for(int r=0;r<=11;r++){
            if(r%2==0){
                System.out.println(" "+r);
            }
        }
        System.out.println("\n Lista de numeros impares entre 0 a 14:");
        for(int s=0;s<=14;s++){
            if(s%2!=0){
                System.out.println(" "+s);
            }
        }
    }
}
