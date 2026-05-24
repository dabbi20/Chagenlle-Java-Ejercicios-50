/*2.	Crea una calculadora con switch que haga suma, resta, multiplicación, división y módulo. Controla división entre cero.*/
import java.util.Scanner;
public class Calculadora {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
double num1,num2,resultado = 0;
char operador;
boolean operacionValida = false;


System.out.println("--- Calculadora en Java ---");


System.out.print("Ingresa el primero numero");
    while (!sc.hasNextDouble()){
        System.out.println("No es un valor de tipo double por favor ingresa uno tipo double");
        sc.next();
        System.out.println("Intenta nuevamente con un dato valido");
    }
num1 = sc.nextDouble();
System.out.print("Ingrese el operador (+, -, *, /, %):");
operador = sc.next().charAt(0);

System.out.print("Ingresa el segundo numero");

    while (!sc.hasNextDouble()){
        System.out.println("No es un valor de tipo double por favor ingresa uno tipo double");
        sc.next();
        System.out.println("Intenta nuevamente con un dato valido");
    }
num2 = sc.nextDouble();
while (num2 == 0 && operador ==  '/' ){

    System.out.println("Ingresa otro numero que sea diferente a 0");
    while (!sc.hasNextDouble()){
        System.out.println("No es un valor de tipo double por favor ingresa uno tipo double");
        sc.next();
        System.out.println("Intenta nuevamente con un dato valido");
    }
    num2 = sc.nextDouble();

}
    while (num2 == 0 && operador ==  '%' ){

        System.out.println("Ingresa otro numero que sea diferente a 0");
        while (!sc.hasNextDouble()){
            System.out.println("No es un valor de tipo double por favor ingresa uno tipo double");
            sc.next();
            System.out.println("Intenta nuevamente con un dato valido");
        }
        num2 = sc.nextDouble();

    }

    switch (operador){
        case '+': resultado = num1 + num2;
            operacionValida = true;
        break;
        case '-': resultado = num1 - num2;
            operacionValida = true;
        break;
        case '*': resultado = num1 * num2;
            operacionValida = true;
        break;
        case '/':resultado = num1 / num2;
        operacionValida = true;
        break;
        case '%': resultado = num1 % num2;
            operacionValida = true;
        break;
        default:System.out.println("Operacion no valida");


 }
if (operacionValida == true){
    System.out.println("El resultado es = " + resultado);
}

sc.close();
}

}


