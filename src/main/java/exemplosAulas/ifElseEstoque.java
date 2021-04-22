package exemplosAulas;
public class ifElseEstoque {
    public static void main(String[]args) {
        int estoque = 32;
        if (estoque >= 100) {
            System.out.println("Produto com quantidade suficiente!");
        } else if (estoque >= 50 && estoque < 100) {
            System.out.println("Alerta: Avaliar possibilidade de novo pedido!");
        } else {
            System.out.println("Atenção! Faça um novo pedido!");
        }
    }
}
