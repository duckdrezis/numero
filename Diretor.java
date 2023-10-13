public class Diretor extends Funcionario{

    private Double salarioContratual;
    private Double bonusFaturamento;
    private double salarioFamilia;
    private double comissao;

    @Override
    public Double getSalario() {
        return (salarioContratual + bonusFaturamento + salarioFamilia + comissao);
    }

    public Double getSalarioContratual() {
        return salarioContratual;
    }

    public Double getBonusFaturamento() {
        return bonusFaturamento;
    }

    public void setSalarioContratual(Double salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public void setBonusFaturamento(Double bonusFaturamento) {
        this.bonusFaturamento = bonusFaturamento;
    }

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public double getComissao() {
        return comissao;
    }

    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
