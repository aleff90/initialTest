package exemplosAulas;

public class exemploGetSet {
    public static void main(String[]args){
        Variaveis var = new Variaveis();
        //Seta os atributos da classe instanciada
        var.setIdade(22);
        var.setNome("Natacha");
        var.setSequencia(1);
        //Imprime os atributos da classe instanciada
        System.out.println(var.getIdade());
        System.out.println(var.getNome());
        System.out.println(var.getSequencia());
    }
}

class Variaveis {
    //Declaração das variaveis
    //Neste caso foram declaradas como private
    //para fazer o chamado encapsulamento
    //que nada mais é do que permitir o acesso
    //aos atributos por meio dos moods da classe

    private int sequencia;
    private String nome;
    private double idade;

    //Construir da classe
    //Normalmente é o contrutor que inicializa
    //as variaveis da classe
    public Variaveis() {
        this.sequencia = 0;
        this.nome = "";
        this.idade = 0;
    }

    //Daqui em diante ficam as getter e setters
    //que são os metodos que fazer o acesso
    //(gravação ou leitura) dos atributos da classe
    public double getIdade(){
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











