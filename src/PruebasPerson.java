public class PruebasPerson {
    static void main(String[] args) {
        var estudiante1 = new Students("Davi","david1234@gmil.com","22","5");
        var profesor1 = new Teacher("Posa","posa123@gmail.com","33","Matematicas");
        var administrador = new Admin("Jefe","jefe123@gmail.com","50","pasw123");


        estudiante1.labor();
        profesor1.labor();
        administrador.labor();
    }
}
