import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class Main{
    static Scanner entrada = new Scanner(System.in).useLocale(Locale.US);


    public static void main(String[] args) throws CustomExepcion {






var horno = new TemperatureChecker(-49);
horno.checkTemperature();

var User1 = new Users("Pepe","Abc12@13dff","posa123@gmail.com",23);

var Registro1 = new RegistrarUsuarios(User1);
Registro1.registrarUsuario();

        BankAccount cuenta = new BankAccount(0);
        cuenta.deposito(110);
        System.out.println(cuenta.getBalance());
        cuenta.withdraw(60);
        System.out.println(cuenta.getBalance());

        ArrayList<Double> listaNotas = new ArrayList<>();

     var sistema = new SystemNotes(listaNotas);

        sistema.agregarNota();
        sistema.agregarNota();

        sistema.mostrarNotas();

        System.out.println("Promedio: " + sistema.calcularPromedio());

        int edad = solicitarEdad();
        boolean resultado = esMayordeEdad(edad);
        mostrarResultado(edad,resultado);

        Inventario miAlmacen = new Inventario();

        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE CONTROL DE STOCK (HASHMAP) ---");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Buscar producto por su ID (UUID)");
            System.out.println("3. Actualizar unidades (Venta / Reposición)");
            System.out.println("4. Ver inventario completo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            // Validar que la opción sea un número entero
            while (!entrada.hasNextInt()) {
                System.out.println("Error: Ingrese un número de opción válido.");
                System.out.print("Intente de nuevo: ");
                entrada.next();
            }
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Registrar Nuevo Producto ---");

                    // Validar Nombre
                    String name;
                    do {
                        System.out.print("Ingrese el nombre del producto: ");
                        name = entrada.nextLine();
                        if (name == null || name.trim().isEmpty()) {
                            System.out.println("Error: El nombre no puede estar vacío.");
                        }
                    } while (name == null || name.trim().isEmpty());

                    // Validar Precio
                    double precio;
                    do {
                        System.out.print("Ingresa el precio (ejm: 10.50): ");
                        while (!entrada.hasNextDouble()) {
                            System.out.println("Error: Debe ingresar un número decimal válido.");
                            System.out.print("Intente de nuevo: ");
                            entrada.next();
                        }
                        precio = entrada.nextDouble();
                        if (precio <= 0) {
                            System.out.println("Error: El precio debe ser mayor a cero.");
                        }
                    } while (precio <= 0);

                    // Validar Cantidad
                    int cantidad;
                    do {
                        System.out.print("Ingresa la cantidad inicial: ");
                        while (!entrada.hasNextInt()) {
                            System.out.println("Error: Debe ingresar un número entero válido.");
                            System.out.print("Intente de nuevo: ");
                            entrada.next();
                        }
                        cantidad = entrada.nextInt();
                        if (cantidad < 0) {
                            System.out.println("Error: La cantidad no puede ser negativa.");
                        }
                    } while (cantidad < 0);
                    entrada.nextLine(); // Limpiar buffer final

                    // Crear producto e insertarlo al HashMap del inventario
                    Producto nuevo = new Producto(name, precio, cantidad);
                    miAlmacen.agregarProducto(nuevo);
                    System.out.println("Código UUID generado: " + nuevo.getId());
                    break;

                case 2:
                    System.out.println("\n--- Buscar por ID ---");
                    System.out.print("Pegue o escriba el UUID del producto: ");
                    String idBuscado = entrada.nextLine().trim();

                    Producto encontrado = miAlmacen.buscarPorId(idBuscado);
                    if (encontrado != null) {
                        System.out.println("\n¡Producto Encontrado!");
                        System.out.println("Nombre: " + encontrado.getName());
                        System.out.println("Precio: $" + encontrado.getPrecio());
                        System.out.println("Stock actual: " + encontrado.getCantidad() + " unidades");
                    } else {
                        System.out.println("Error: No existe ningún producto con ese ID en el mapa.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Actualizar Unidades ---");
                    System.out.print("Pegue o escriba el UUID del producto a modificar: ");
                    String idStock = entrada.nextLine().trim();

                    Producto prodStock = miAlmacen.buscarPorId(idStock);
                    if (prodStock != null) {
                        System.out.print("Cantidad a cambiar (Ej: 5 para reponer, -3 para vender): ");
                        while (!entrada.hasNextInt()) {
                            System.out.println("Error: Ingrese un entero válido.");
                            System.out.print("Intente de nuevo: ");
                            entrada.next();
                        }
                        int cambio = entrada.nextInt();
                        entrada.nextLine(); // Limpiar buffer

                        // Validar que el stock no quede negativo
                        int nuevoStock = prodStock.getCantidad() + cambio;
                        if (nuevoStock < 0) {
                            System.out.println("Error: Operación cancelada. El stock no puede quedar en números negativos (Stock actual: " + prodStock.getCantidad() + ")");
                        } else {
                            prodStock.setCantidad(nuevoStock);
                            System.out.println("¡Stock modificado con éxito! Nuevo stock: " + prodStock.getCantidad());
                        }
                    } else {
                        System.out.println("Error: ID no registrado.");
                    }
                    break;

                case 4:
                    miAlmacen.mostrarInventario();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema de stock. ¡Buen día!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);




        entrada.close();
contadorCaracteres("holaMundo123");


    }

    public static void contadorCaracteres(String caracteres){
        int contadorVocales = 0;
        int contadorCaracteresEspeciales = 0;
        int contadorNumeros = 0;
        String vocales = "aeiouAEIOU";
        String caracteresEspeciales = "@#$%&_-+=[]{};:,.<>/?*~^|";
        String numbers = "0123456789";

        for (Character letra : caracteres.toCharArray()){

     if (vocales.contains(String.valueOf(letra))){
         contadorVocales ++;
     }
            if (caracteresEspeciales.contains(String.valueOf(letra))){
                contadorCaracteresEspeciales ++;
            }
            if (numbers.contains(String.valueOf(letra))){
                contadorNumeros ++;
            }


        }

System.out.println("La cantidad de vocales es: " + contadorVocales + " la cantidad de numeros es: " + contadorNumeros + " la cantidad de caracteres es: "+ contadorCaracteresEspeciales);

    }


    public static int solicitarEdad(){
        int edad;

        do {
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();
            if (edad <= 0 || edad > 150){
                System.out.println("Edad fuera de rango ingresa de nuevo tu edad ");
            }
        }while (edad <= 0 || edad > 150);

        return  edad;
    }

public static boolean esMayordeEdad(int edad){
    return edad >= 18;
}


public static void  mostrarResultado(int edad, boolean resultado){
        System.out.println("\n ***Resultado*** ");
    System.out.println("edad ingresada " + edad);

    if (resultado){
        System.out.println("La persona es Mayor de edad" );
    }else {
        System.out.println("Chaval sos menor de edad wacho ");
    }
}
}
