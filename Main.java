import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Secretaria secretaria = new Secretaria();
        secretaria.setBonus(500.00);
        secretaria.setHorasExtras(150.00);
        secretaria.setSalarioFamilia(200.00);
        secretaria.setSalarioContratual(3000.00);

        System.out.println(secretaria.getSalario());


        Professor professor = new Professor();
        professor.setCargaHoraria(85.50);
        professor.setValorHora(39.90);

        System.out.println(professor.getSalario());

        Diretor diretor = new Diretor();
        diretor.setSalarioContratual(3000.00);
        diretor.setBonusFaturamento(500.);
        diretor.setSalarioFamilia(500.);
        diretor.setComissao(100.0);

        System.out.println(diretor.getSalario());


        Gerente gerente = new Gerente();
        gerente.setBonusVendas(500.00);
        gerente.setFatorMultiplicador(0.15);
        gerente.setSalarioFamilia(2000.00);
        gerente.setSalarioContratual(2000.00);

        System.out.println(gerente.getSalario());


    }
}
