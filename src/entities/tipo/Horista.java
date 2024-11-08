package entities.tipoFuncionario;

import entities.Funcionarios;

public class Horista extends Funcionarios {
    private Integer horasTrabalhadas;
    private Double taxaHora;

    public Horista(Integer id, String nome, Integer idade, Integer horasTrabalhadas, Double taxaHora) {
        super(id, nome, idade);
        this.horasTrabalhadas = horasTrabalhadas;
        this.taxaHora = taxaHora;
        this.setSalario(this.pagamentoTotal());
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getTaxaHora() {
        return taxaHora;
    }

    public void setTaxaHora(Double taxaHora) {
        this.taxaHora = taxaHora;
    }

    @Override
    public Double pagamentoTotal() {
        Double total = this.horasTrabalhadas * this.taxaHora;
        this.setSalario(total);
        return total;
    }

    @Override
    public String toString() {
        return super.toString() +"\n| Tipo: Horista" +
                ", horas trabalhadas = " + horasTrabalhadas +
                ", valor por Hora = R$" + String.format("%.2f",taxaHora) + " |";
    }
}