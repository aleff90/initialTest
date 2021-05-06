package getSet;

public class Main {
    public static void main(String[] args) {
        Variaveis variaveis = new Variaveis();
        //Seta os atributos da classe instanciada
        variaveis.setIdade(45);
        variaveis.setNome("Natasha");
        variaveis.setSequencia(1);
        //Imprime os atributos da classe instanciada
        System.out.println("\n Idade: "+variaveis.getIdade());
        System.out.println(" Nome: "+variaveis.getNome());
        System.out.println(" Sequencia: "+variaveis.getSequencia());
    }
}

class Variaveis {
    /*Declaração das variaveis
    * Neste caso foram declaradas como private
    * Encapsulamento que permite o acesso
    * aos atributos por meio dos modos da classe*/
    private int sequencia;
    private String nome;
    private double idade;

    /*Construtor da classe
    * Normalmente são os construtores que inicializam
    * as variaveis da classe*/
    public Variaveis(){
        this.sequencia = 0;
        this.nome = "";
        this.idade = 0;
    }
    /*A partir daqui ficam os getters e setters
    * os quais são os metodos que fazem os acessos
    * (gravação e leitura) dos atributos da classe*/

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }
}
