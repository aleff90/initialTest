package exemplosAulas;

public class exemploWhile {
    public static void main(String[]args) {
        int idade = 11;
        while (idade<18) {
            System.out.println("Permissão de entrada negada");
            idade++;
        }
        System.out.println("Entrada permitida!");
    }
}
