package collectionHashSetExercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        Scanner questionSet = new Scanner(System.in);
        String question;

        Set<Integer> numbers = new HashSet<>();

        numbers.add(845712698);
        numbers.add(451268790);
        numbers.add(154789654);
        numbers.add(345789541);
        numbers.add(954690574);
        //numbers.add(845712698);
        System.out.println("\n 1 - Lista de numeros: "+numbers);

        numbers.remove(451268790);
        System.out.println("\n 2 - Removendo o numero 451268790: "+numbers);

        numbers.add(658710235);
        System.out.println("\n 3 - Adicionando o numero 658710235: "+numbers);

        System.out.println("\n 4 - Total de elementos na lista de numeros: "+numbers.size());

        System.out.println("\n 5 - A lista esta vazia? "+numbers.isEmpty());

        System.out.println("\n 6 - Deseja apagar a lista de numeros? y/n");
        question = questionSet.nextLine();
        if(question.equals("y")){
            numbers.clear();
            System.out.println("\n 7 - A lista de numeros foi apagada com sucesso!");
        }else{
            System.out.println("\n 7 - Exibindo lista de numeros: "+numbers);
        }
        questionSet.close();
    }
}

/*Adicione 5 numeros inteiros: 3, 88, 20, 44, 3.--
 * Navegue no Set exibindo cada numero no console.--
 * Remova o primeiro item do Set.--
 * Adicione um novo numero no Set: 23.--
 * Verifique o tamanho do Set.--
 * Verifique se o Set está vazio.--*/