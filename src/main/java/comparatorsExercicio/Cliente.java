package comparatorsExercicio;

public class Cliente implements Comparable<Cliente>{

    private final String nome;
    private final Integer anoNascimento;

    public Cliente (String nome, Integer anoNascimento){
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() { return nome; }
    public Integer getAnoNascimento() { return anoNascimento; }

    @Override
    public String toString() { return nome + " - " + anoNascimento; }

    @Override
    public int compareTo(Cliente o) { return this.getAnoNascimento() - o.getAnoNascimento(); }

}


/*Crie uma lista de um objeto complexo e execute as seguintes operações.--
* Adicione elementos nesta lista.--
* Ordene implementando a interface java.util.Comparator no seu objeto complexo.--
* Ordene implementando um novo objeto com a interface java.util.Comparable.--
* Ordene usando uma expressão lambda na chamada de suaLista.sort().--
* Ordene usando referencias de metodos e os metodos estaticos de Comparator.--
* Ordene coleções TreeSet e TreeMap.--*/