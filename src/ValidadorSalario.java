import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidadorSalario {

    public static void validarNoNegativo(BigDecimal valor) throws SalarioNegativoException {

        if (valor == null || valor.compareTo(BigDecimal.ZERO) < 0) {
            throw new SalarioNegativoException("El valor del salario no puede ser negativo");
        }
    }


    public static BigDecimal calcularConAumento(BigDecimal salario, BigDecimal porcentaje) {
        BigDecimal cien = new BigDecimal("100");


        BigDecimal partePorcentaje = porcentaje.divide(cien, RoundingMode.HALF_UP);


        BigDecimal factor = BigDecimal.ONE.add(partePorcentaje);


        return salario.multiply(factor);
    }
}
