public class ReportableTest {
    public static void main(String[] args) {
        System.out.println("=== INICIANDO PRUEBA DE ARQUITECTURA DE REPORTES ===\n");

        try {

            Student alumno = new Student("Mateo Ospina", 20);
            alumno.agregarNota(4.2);
            alumno.agregarNota(3.8);

            Producto articulo = new Producto("Teclado Mecánico RGB", 120.00, 2);

            Empleado colaborador = new Empleado("Camila Restrepo", new java.math.BigDecimal("3200.00"));
            colaborador.aplicarAumento();


            java.util.List<Reportable> bandejaDeEntrada = new java.util.ArrayList<>();
            bandejaDeEntrada.add(alumno);
            bandejaDeEntrada.add(articulo);
            bandejaDeEntrada.add(colaborador);


            for (Reportable documento : bandejaDeEntrada) {
                documento.compilarDatos();
                documento.exportar("PDF");
            }


            System.out.println("[Prueba de Seguridad]: Intentando registrar un empleado con sueldo negativo...");
            new Empleado("Intruso", new java.math.BigDecimal("-500.00"));

        } catch (SalarioNegativoException e) {
            System.out.println(" Captura Correcta del Error: " + e.getMessage());
        }

        System.out.println("\n=== FIN DE LA PRUEBA SIN ERRORES CRÍTICOS ===");
    } }

