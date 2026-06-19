import java.math.BigDecimal;

public class Empleado {

    private BigDecimal salario;


    public Empleado(BigDecimal salarioInicial) throws SalarioNegativoException {

        ValidadorSalario.validarNoNegativo(salarioInicial);
        this.salario = salarioInicial;
    }


    public void setSalario(BigDecimal nuevoSalario) throws SalarioNegativoException {

        ValidadorSalario.validarNoNegativo(nuevoSalario);
        this.salario = nuevoSalario;
    }


    public BigDecimal getSalario() {
        return this.salario;
    }


    public void aplicarAumento() throws SalarioNegativoException {

        BigDecimal porcentajeDiez = new BigDecimal("10.0");


        BigDecimal nuevoSalario = ValidadorSalario.calcularConAumento(this.salario, porcentajeDiez);


        setSalario(nuevoSalario);
    }
}
