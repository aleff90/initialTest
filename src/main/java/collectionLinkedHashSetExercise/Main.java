package collectionLinkedHashSetExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner questionHashSet = new Scanner(System.in);
        String question;

        LinkedHashSet<Long> numeros = new LinkedHashSet<>();

        numeros.add(874512698L);
        numeros.add(5448795126L);
        numeros.add(62315047L);
        numeros.add(9568741201548L);
        numeros.add(6529874512L);
        //numeros.add(62315047L);
        System.out.println("\n 1 - Lista de valores: "+numeros);

        numeros.remove(9568741201548L);
        System.out.println("\n 2 - Lista de valores excluindo o valor 9568741201548: "+numeros);

        numeros.add(745812958436L);
        System.out.println("\n 3 - Adicionando o valor 745812958436: "+numeros);

        System.out.println("\n 4 - Total de elementos na lista: "+numeros.size());

        System.out.println("\n 5 - A lista esta vazia? "+numeros.isEmpty());

        System.out.println("\n 6 - Deseja apagar a lista? y/n");
        question = questionHashSet.nextLine();
        if(question.equals("y")){
            numeros.clear();
            System.out.println("\n Elementos excluidos com sucesso!");
        }else if(question.equals("n")){
            System.out.println("\n Exibindo os valores: "+numeros);
        }
        questionHashSet.close();
    }
}

/*Adicione 5 numeros inteiros: 3, 88, 20, 44, 3.--
 * Navegue no Set exibindo cada numero no console.--
 * Remova o primeiro item do Set.--
 * Adicione um novo numero no Set: 23.--
 * Verifique o tamanho do Set.--
 * Verifique se o Set está vazio.--*/