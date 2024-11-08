package entities;

public abstract class Funcionarios {

    private Integer id;
    private String nome;
    private Integer idade;
    private Double salario;

    public Funcionarios(){

    }

    public Funcionarios(Integer id, String nome, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract Double pagamentoTotal();

    @Override
    public String toString() {
        return    "\n| Funcionário:"
                + " Id = " + id
                + ", Nome = " + nome
                + ", Idade = " + idade
                + ", Salario = R$" + String.format("%.2f", salario) + "|";
    }
}