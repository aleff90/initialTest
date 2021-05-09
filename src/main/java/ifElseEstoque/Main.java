package ifElseEstoque;

public class Main {
    public static void main(String[] args) {
        int estoque = 32;
        if (estoque>=100){
            System.out.println("\n Estoque cheio!");
        }else if (estoque>=50&&estoque<100){
            System.out.println("\n Recomendado abastecer estoque!");
        }else{
            System.out.println("\n Abasteça o estoque!");
        }
    }
}
