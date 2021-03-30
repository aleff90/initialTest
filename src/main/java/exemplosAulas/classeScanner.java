package exemplosAulas;
import java.util.Scanner;
public class classeScanner {
    public static void main(String[]args) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Entre com seu nome: ");
        str = texto.nextLine();
        System.out.println("Bem-vindo "+str);

        System.out.println("Digite um numero.");
        int numero = texto.nextInt();
        System.out.println("O numero digitado foi: "+numero);

        texto.close();
    }
}
