import java.math.BigDecimal;

public class EmpleadosPrueba {
    public static void main(String[] args) {
        try {

            Empresa miEmpresa = new Empresa();


            Empleado emp1 = new Empleado(new BigDecimal("1000.00"));
            Empleado emp2 = new Empleado(new BigDecimal("2500.50"));
            Empleado emp3 = new Empleado(new BigDecimal("1800.00"));


            miEmpresa.agregarEmpleado(emp1);
            miEmpresa.agregarEmpleado(emp2);
            miEmpresa.agregarEmpleado(emp3);


            System.out.println("Nómina inicial total: $" + miEmpresa.totalNomina());


            BigDecimal porcentajeAumento = new BigDecimal("10.0");
            miEmpresa.aplicarAumentoATodos(porcentajeAumento);

            System.out.println("--- ¡Aumento del 10% aplicado con éxito! ---");


            System.out.println("Nuevo salario Empleado 1: $" + emp1.getSalario());
            System.out.println("Nómina final total con aumento: $" + miEmpresa.totalNomina());


            System.out.println("\n--- Probando la Invariante (Salario Negativo) ---");
            Empleado empInvalido = new Empleado(new BigDecimal("-500.00"));

        } catch (SalarioNegativoException e) {

            System.out.println("ERROR CAPTURADO CORRECTAMENTE: " + e.getMessage());
        }
    }
}
