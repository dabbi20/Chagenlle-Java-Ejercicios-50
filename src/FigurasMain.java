public class FigurasMain {
    static void main(String[] args) {
        var Circle1 = new Circle(823.2);
        System.out.println(Circle1.calculateArea());
        var Rectangle1 = new Rectangle(500,200);
        System.out.println(Rectangle1.calculateArea());
        var Triangle1 = new Triangle(25.4,23.4);
        System.out.println(Triangle1.calculateArea());
    }
}
