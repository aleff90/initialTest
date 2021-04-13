package exemplosAulas;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class exercicioCollectionLinkedHashSet {
    public static void main(String[] args) {

        Scanner questionHashSet = new Scanner(System.in);
        String question;

        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        //numeros.add(3);
        System.out.println("1 - Lista de numeros: "+numeros);

        numeros.remove(3);
        System.out.println("2 - Primeiro numero da lista removido: "+numeros);

        numeros.add(23);
        System.out.println("3 - Adicionando o numero 23 à lista: "+numeros);

        System.out.println("4 - Quantidade de elementos da lista: "+numeros.size());

        System.out.println("5 - A lista esta vazia? "+numeros.isEmpty());

        System.out.println("6 - Deseja apagar a lista? y/n");
        question = questionHashSet.nextLine();
        if (question.equals("y")) {
            numeros.clear();
            System.out.println("Alista foi apagada com sucesso!");
        } else if (question.equals("n")) {
            System.out.println("Exibindo elementos da lista: "+numeros);
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