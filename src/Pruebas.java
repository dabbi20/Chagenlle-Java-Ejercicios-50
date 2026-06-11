public class Pruebas {
    static void main(String[] args) {
        // Crear el sistema
        SystemStudent sistema = new SystemStudent();

        // Crear estudiantes
        Student estudiante1 = new Student("David", 17);
        estudiante1.agregarNota(4.5);
        estudiante1.agregarNota(3.8);

        Student estudiante2 = new Student("Juan", 18);
        estudiante2.agregarNota(2.0);
        estudiante2.agregarNota(2.5);

        Student estudiante3 = new Student("Maria", 19);
        estudiante3.agregarNota(5.0);
        estudiante3.agregarNota(4.8);

        // Agregar estudiantes al sistema
        sistema.agregarEstudiante(estudiante1);
        sistema.agregarEstudiante(estudiante2);
        sistema.agregarEstudiante(estudiante3);

        // Mostrar todos los estudiantes
        System.out.println("=== TODOS LOS ESTUDIANTES ===");
        sistema.mostrarEstudiantes();

        // Buscar estudiante
        System.out.println("\n=== BUSCAR ESTUDIANTE ===");

        Student encontrado = sistema.buscarEstudiante("Juan");

        if (encontrado != null) {
            encontrado.mostrarInformacion();
        } else {
            System.out.println("Estudiante no encontrado");
        }

        // Mostrar aprobados
        System.out.println("\n=== APROBADOS ===");
        sistema.listarAprobados();

        // Mostrar reprobados
        System.out.println("\n=== REPROBADOS ===");
        sistema.listarReprobados();

        // Promedio general
        System.out.println("\n=== PROMEDIO GENERAL ===");
        System.out.println(
                "Promedio del grupo: "
                        + sistema.calcularPromedioGeneralDelGrupo()
        );

        Product mesa = new Product("Mesa", 100, 350000, 1);
        Product tv = new Product("TV", 200, 500000, 2);

        SistemProduct stock = new SistemProduct();

        stock.agregarProduct(mesa);
        stock.agregarProduct(tv);

// Crear carrito
        CarritoCompras carrito = new CarritoCompras();

// Añadir productos
        carrito.añadirCarrito(mesa, 2);
        carrito.añadirCarrito(tv, 1);

// Mostrar factura
        carrito.mostrarFactura();


        UserManager userManager = new UserManager();

        Register register = new Register(userManager);

        Login login = new Login(userManager);

        // Registro exitoso
        register.registrar(
                "David",
                "david@gmail.com",
                "Password123!",
                "Password123!"
        );

        // Usuario repetido
        register.registrar(
                "David",
                "david@gmail.com",
                "Password123!",
                "Password123!"
        );

        // Login correcto
        boolean acceso1 = login.iniciarSession(
                "david@gmail.com",
                "Password123!"
        );

        System.out.println("Login correcto: " + acceso1);

        // Contraseña incorrecta
        boolean acceso2 = login.iniciarSession(
                "david@gmail.com",
                "123456"
        );

        System.out.println("Login correcto: " + acceso2);

        // Usuario inexistente
        boolean acceso3 = login.iniciarSession(
                "juan@gmail.com",
                "Password123!"
        );

        System.out.println("Login correcto: " + acceso3);

    }


}
