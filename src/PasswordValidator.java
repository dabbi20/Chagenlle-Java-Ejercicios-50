public class PasswordValidator {
//METODO
public boolean validarContraseña(String contraseña) {

    String simbolos = "!@#$%^&*()-_=+[]{}|;:,.<>?/";

    boolean tieneMayuscula = false;
    boolean tieneMinuscula = false;
    boolean tieneNumero = false;
    boolean tieneSimbolo = false;

    // Fase 1: validaciones básicas
    if (contraseña.isEmpty() || contraseña.length() <= 10) {
        return false;
    }

    // Fase 2: recorrer la contraseña
    for (char caracter : contraseña.toCharArray()) {

        if (Character.isUpperCase(caracter)) {
            tieneMayuscula = true;
        }

        if (Character.isLowerCase(caracter)) {
            tieneMinuscula = true;
        }

        if (Character.isDigit(caracter)) {
            tieneNumero = true;
        }

        if (simbolos.contains(String.valueOf(caracter))) {
            tieneSimbolo = true;
        }
    }

    // Fase 3: decisión final
    return tieneMayuscula
            && tieneMinuscula
            && tieneNumero
            && tieneSimbolo;
}

}
