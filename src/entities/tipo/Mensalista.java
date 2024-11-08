package entities.tipo;

import entities.Funcionarios;

public class Mensalista extends Funcionarios {

    private Double salarioBase;
    private Double bonusSalario;

    public Mensalista(Integer id, String nome, Integer idade, Double salarioBase, Double bonusSalario) {
        super(id, nome, idade);
        this.salarioBase = salarioBase;
        this.bonusSalario = bonusSalario;
        this.setSalario(pagamentoTotal());
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Double getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(Double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    @Override
    public Double pagamentoTotal() {
        return salarioBase + bonusSalario;
    }

    @Override
    public String toString() {
        return super.toString() + "\n| Salario base = R$" + String.format("%.2f", salarioBase)
                + ", Bonus Salarial = R$" + String.format("%.2f", bonusSalario) + " |";

    }
}