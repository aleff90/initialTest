package collectionTreeSetExercise;

import java.util.TreeSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner questionTreeset = new Scanner(System.in);
        long question;
        long question2;

        TreeSet<Long> numeros = new TreeSet<>();

        numeros.add(345784126L);
        numeros.add(854785628L);
        numeros.add(205784123L);
        numeros.add(958741244L);
        //numeros.add(345784126L);

        System.out.println("\n 1 - Lista de elementos -> "+numeros);

        numeros.pollFirst();
        System.out.println("\n 2 - Exibindo elementos excluindo o primeiro -> "+numeros);

        numeros.add(547821036L);
        System.out.println("\n 3 - Adicionando mais um elemento à lista -> "+numeros);

        System.out.println("\n 4 - Total de elementos -> "+numeros.size());

        //numeros.clear();
        System.out.println("\n 5 - Lista esta vazia? "+numeros.isEmpty());

        System.out.println("\n 6 - Qual destes elementos "+numeros+"você deseja apagar?");
        question = questionTreeset.nextInt();

        switch((int) question){
            case 854785628 -> {
                numeros.remove(854785628L);
                System.out.println("\n Elemento 854785628 excluído! "+numeros);
            }
            case 205784123 -> {
                numeros.remove(205784123L);
                System.out.println("\n Elemento 205784123 excluído! "+numeros);
            }
            case 958741244 -> {
                numeros.remove(958741244L);
                System.out.println("\n Elemento 958741244 excluído! "+numeros);
            }
            case 547821036 -> {
                numeros.remove(547821036L);
                System.out.println("\n Elemento 547821036 excluído! "+numeros);
            }
            default ->
                System.out.println("\n Elemento não encontrado!");
        }

        System.out.println("\n 7 - O que deseja fazer a seguir? "+"Digite 0 para sair, "+"1 para adicionar novo elemento: ");
        question2 = questionTreeset.nextInt();
        if(question2==0){
            System.exit(0);
        }else if(question2==1){
            System.out.println(" Digite o elemento que você quer adicionar: ");
            question2 = questionTreeset.nextInt();
            numeros.add(question2);
        }

        System.out.println("\n 8 - O elemento "+question2+" foi adicionado à lista: "+numeros);
    }
}

/* Adicione cinco numeros.--
 * Navegue no Set exibindo cada numero no console.--
 * Remova o primeiro item do Set.--
 * Adicione um novo numero no Set.--
 * Verifique o tamanho do Set.--
 * Verifique se o Set está vazio.--*/


      /*switch (question) {
      case 88:
        numeros.remove(88);
        System.out.println("Elemento 88 apagado! " + numeros);
        break;
      case 20:
        numeros.remove(20);
        System.out.println("Elemento 20 apagado!");
        break;
      case 44:
        numeros.remove(44);
        System.out.println("Elemento 44 apagado!");

      default:
        System.out.println("Elemento não encontrado!" + numeros);

        System.out.println(numeros);
    }*/

/*if (question == 20) {
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
        }*/