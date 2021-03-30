package exemplosAulas;
import java.lang.String;
import java.lang.reflect.Array;
import java.util.Arrays;
public class exemploArray {
    public static void main(String[] args) {
        String[] paises1 = new String[4];
        paises1[0] = "Ukrania";
        paises1[1] = "Estonia";
        paises1[2] = "Lituania";
        paises1[3] = "Finlandia";
        System.out.println("\nTamanho do array de nomes de países 1: "+Array.getLength(paises1));
        System.out.println("Lista de países do exemplo 1: "+Arrays.toString(paises1));

        String[] paises2 = {"Ukrania","Estonia","Lituania","Finlandia"};
        System.out.println("\nTamanho do array de nomes de países 2: "+Array.getLength(paises2));
        System.out.println("Lista de países do exemplo 2: "+Arrays.toString(paises2));

        double[] numeros1 = {12.2, 25.1, 3.34, 5.43, 76.4, 98.1, 4.67};
        System.out.println("\nTamanho do array de numeros 1: "+Array.getLength(numeros1));
        System.out.println("Valor atribuido a quarta posição no array: "+numeros1[3]);

        int[] numeros2 = {0,10,23,31,45,53,69,75,87,98};
        System.out.println("\nTamanho do array de numeros 2: "+Array.getLength(numeros2));
        System.out.println("Valor atribuído à terceira posição no array: "+numeros2[2]);

        String[] nomes = {"Ivan", "Dmitri", "Natasha", "Vladmir"};
        for (int i=0; i<nomes.length; i++) {
            System.out.println("Elemento " +i+ " = " +nomes[i]);
        }
        System.out.println("Tamanho do array de nomes: "+Array.getLength(nomes));
        System.out.println("Terceiro nome do array de nomes: "+nomes[2]);
    }
}
