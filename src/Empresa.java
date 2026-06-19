import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Empresa {


    private List<Empleado> empleados;


    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void removerEmpleado(Empleado e) {
        this.empleados.remove(e);
    }


    public BigDecimal totalNomina() {
        BigDecimal total = BigDecimal.ZERO;

        for (Empleado e : empleados) {
            if (e.getSalario() != null) {
                total = total.add(e.getSalario());
            }
        }
        return total;
    }


    public void aplicarAumentoATodos(BigDecimal porcentaje) throws SalarioNegativoException {
        for (Empleado e : empleados) {

            BigDecimal nuevoSalario = ValidadorSalario.calcularConAumento(e.getSalario(), porcentaje);


            e.setSalario(nuevoSalario);
        }
    }
}
