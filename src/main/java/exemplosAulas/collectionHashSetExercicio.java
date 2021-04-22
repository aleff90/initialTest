package exemplosAulas;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.lang.String;

public class collectionHashSetExercicio {
    public static void main(String[] args) {

        Scanner questionSet = new Scanner(System.in);
        String question;

        Set<Integer> numeros = new HashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        //numeros.add(3);
        System.out.println("1 - Lista de numeros: "+numeros);

        numeros.remove(3);
        System.out.println("2 - Lista de numeros excluindo o primeiro: "+numeros);

        numeros.add(23);
        System.out.println("3 - Adicionando o numero 23 a lista de numeros: "+numeros);

        System.out.println("4 - Total de elementos no Set: "+numeros.size());

        System.out.println("5 - O Set está vazio? "+numeros.isEmpty());

        System.out.println("6 - Você quer apagar a lista de elementos no Set? y/n");
        question = questionSet.nextLine();
        if (question.equals("y")) {
            numeros.clear();
            System.out.println("6 - O Set foi apagado com sucesso!");
        } else if (question.equals("n")) {
            System.out.println("6 - Exibindo lista de elementos do Set: " + numeros);
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