public class ProbarAbstrac {
    static void main(String[] args) {
        Book libro1 = new Book("01","Juego de tronos",200,250.000,"George R Martin","Por todo el mundo en tiiendas panamericana");
        Electronic ferrari = new Electronic("02","Ferrari",10,50.000,"Ferrari","z- 2026");
        Food tomahoh = new Food("03","Aqui se concina",200,30.000,"Cr4 -03 brr juan es", "Tomahok");

        Productos[] productos = {
                libro1,
                ferrari,
                tomahoh
        };
        for (Productos producto : productos){
            producto.products();
        }
    }


}

