package Desafio3.entities;

public class Faturamento {

    private Integer dia;
    private Double valor;

    public Faturamento(Integer dia, Double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Faturamento{");
        sb.append("dia=").append(dia);
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
