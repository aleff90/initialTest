package exemplosAulas;

import java.util.Scanner;
import java.util.TreeSet;

public class exercicioCollectionTreeSet {
    public static void main(String[] args) {

        Scanner questionTreeSet = new Scanner(System.in);
        int question;
        int question2;

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        //numeros.add(3);
        System.out.println("\n1 - Lista de numeros: " + numeros);

        numeros.remove(3);
        System.out.println("\n2 - Primeiro item da lista foi removido: " + numeros);

        numeros.add(23);
        System.out.println("\n3 - Adicionando o numero 23 à lista: " + numeros);

        System.out.println("\n4 - Total de elementos da lista: " + numeros.size());

        System.out.println("\n5 - Qual destes elementos " + numeros + " você quer apagar?");
        question = questionTreeSet.nextInt();
        if (question == 20) {
            numeros.remove(20);
            System.out.println("Elemento 20 foi removido!" + numeros);
        } else if (question == 23) {
            numeros.remove(23);
            System.out.println("Elemento 23 foi removido!" + numeros);
        } else if (question == 88) {
            numeros.remove(88);
            System.out.println("Elemento 88 foi removido!" + numeros);
        } else if (question == 44) {
            numeros.remove(44);
            System.out.println("Elemento 44 foi removido!" + numeros);
        } else {
            System.out.println("Elemento não encontrado!"+numeros);
        }
        System.out.println("\n6 - O que deseja fazer a seguir?" +
                " Digite 0 para sair, " +
                "1 para adicionar novo elemento");
        question2 = questionTreeSet.nextInt();
        if (question2 == 0){
            System.exit(0);
        } else if (question2 == 1){
            System.out.println("\n7 - Digite o elemento que voce quer adicionar: ");
            question2 = questionTreeSet.nextInt();
            numeros.add(question2);
        }
        System.out.println("\n8 - O elemento "+question2+" foi adicionado na lista: "+numeros);
    }
}

/*Adicione 5 numeros inteiros: 3, 88, 20, 44, 3.--
 * Navegue no Set exibindo cada numero no console.--
 * Remova o primeiro item do Set.--
 * Adicione um novo numero no Set: 23.--
 * Verifique o tamanho do Set.--
 * Verifique se o Set está vazio.--*/


      /*switch (question) {
            case 1:
                System.out.println("Elemento 20 apagado! "+numeros);
                question = numeros.remove(20);
                break;
            case 2:
                numeros.remove(23);
                System.out.println("Elemento 23 apagado!");
                break;
           // case 3:
             //   numeros.remove()
        }*/