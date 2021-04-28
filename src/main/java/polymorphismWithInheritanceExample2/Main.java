package polymorphismWithInheritanceExample2;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Moto moto = new Moto();
        Carro carro = new Carro();
        Caminhao caminhao = new Caminhao();

        veiculo.velocidadeMediaIdeal();
        moto.velocidadeMediaIdeal();
        carro.velocidadeMediaIdeal();
        caminhao.velocidadeMediaIdeal();
    }
}
