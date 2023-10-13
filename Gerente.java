public class Gerente extends Funcionario{

    private Double SalarioContratual;
    private Double BonusVendas;
    private Double SalarioFamilia;
    private Double FatorMultiplicador;

    @Override
    public Double getSalario() {
        return ((SalarioContratual+SalarioFamilia+BonusVendas)*FatorMultiplicador) +(SalarioContratual+SalarioFamilia+BonusVendas) ;
    }

    public Double getSalarioContratual() {
        return SalarioContratual;
    }

    public void setSalarioContratual(Double salarioContratual) {
        SalarioContratual = salarioContratual;
    }

    public Double getBonusVendas() {
        return BonusVendas;
    }

    public void setBonusVendas(Double bonusVendas) {
        BonusVendas = bonusVendas;
    }

    public Double getSalarioFamilia() {
        return SalarioFamilia;
    }

    public void setSalarioFamilia(Double salarioFamilia) {
        SalarioFamilia = salarioFamilia;
    }

    public Double getFatorMultiplicador() {
        return FatorMultiplicador;
    }

    public void setFatorMultiplicador(Double fatorMultiplicador) {
        FatorMultiplicador = fatorMultiplicador;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "SalarioContratual=" + SalarioContratual +
                ", BonusVendas=" + BonusVendas +
                ", SalarioFamilia=" + SalarioFamilia +
                ", FatorMultiplicador=" + FatorMultiplicador +
                '}';
    }
}