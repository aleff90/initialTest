package array;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String[] paises1 = new String[4];
        paises1[0]="Ukrania";
        paises1[1]="Estonia";
        paises1[2]="Lituania";
        paises1[3]="Finlandia";
        System.out.println("\n Tamanho do array de nomes de paises: "+Array.getLength(paises1));
        System.out.println(" Lista de paises: "+Arrays.toString(paises1));

        String[] paises2 = {"Ukrania","Estonia","Lituania","Finlandia"};
        System.out.println("\n Tamanho do array de nomes de paises: "+Array.getLength(paises2));
        System.out.println(" Lista de paises: "+Arrays.toString(paises2));

        double[] numeros1 = {12.2,25.1,3.34,5.43,76.4,98.1,4.67};
        System.out.println("\n Exibindo elementos da lista: "+Arrays.toString(numeros1));
        System.out.println(" Quantidade de numeros na lista: "+Array.getLength(numeros1));
        System.out.println(" Elemento na quarta posicao: "+numeros1[3]);

        int[] numeros2 = {0,10,23,31,45,53,69,75,87,98};
        System.out.println("\n Exibindo elementos da lista: "+Arrays.toString(numeros2));
        System.out.println(" Quantidade de elementos na lista: "+Array.getLength(numeros2));
        System.out.println(" Elemento na terceira posicao: "+numeros2[2]);

        String[] nomes = {"Ivan","Dmitri","Natasha","Vladmir"};
        System.out.println(" ");
        for (int i=0; i<nomes.length; i++) {
            System.out.println(" Elemento " + i + " = " + nomes[i]);
        }
        System.out.println(" Total de nomes na lista: "+Array.getLength(nomes));
        System.out.println(" Terceiro nome da lista: "+nomes[2]);
    }
}
