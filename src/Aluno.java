public class Aluno {
    String nome;
    String CPF;
    Integer idade;
    Integer id;

    public Aluno(String nome, String CPF,Integer idade, Integer id) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.id = id;
    }


    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public Integer getIdade() {
        return idade;
    }

}
