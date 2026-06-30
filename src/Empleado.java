import java.math.BigDecimal;


public class Empleado implements Reportable {

    private BigDecimal salario;
    private String nombre;

    public Empleado(String nombre, BigDecimal salarioInicial) throws SalarioNegativoException {
        ValidadorSalario.validarNoNegativo(salarioInicial);
        this.nombre = nombre;
        this.salario = salarioInicial;
    }



    @Override
    public void compilarDatos() {

        System.out.println("Compilando datos de nómina para: " + nombre);


        if (salario.compareTo(new BigDecimal("1200.00")) < 0) {
            System.out.println("[INFO]: " + nombre + " califica para subsidio de transporte.");
        }
    }

    @Override
    public void exportar(String formato) {

        System.out.println("=== REPORTE DE EMPLEADO (" + formato + ") ===");
        System.out.println("Colaborador: " + nombre);
        System.out.println("Salario Mensual: $" + salario);
        System.out.println("Retenciones Estimadas (10%): $" + salario.multiply(new BigDecimal("0.10")));
        System.out.println("=========================================\n");
    }



    public void setSalario(BigDecimal nuevoSalario) throws SalarioNegativoException {
        ValidadorSalario.validarNoNegativo(nuevoSalario);
        this.salario = nuevoSalario;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void aplicarAumento() throws SalarioNegativoException {
        BigDecimal porcentajeDiez = new BigDecimal("10.0");
        BigDecimal nuevoSalario = ValidadorSalario.calcularConAumento(this.salario, porcentajeDiez);
        setSalario(nuevoSalario);
    }
}
