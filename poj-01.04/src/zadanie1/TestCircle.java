package zadanie1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(3.0, "blue");
        Circle circle4 = new Circle();

        circle4.setRadius(4.0);
        circle4.setColor("green");

        System.out.println(circle1.toString() + ", area=" + circle1.getArea());
        System.out.println(circle2.toString() + ", area=" + circle2.getArea());
        System.out.println(circle3.toString() + ", area=" + circle3.getArea());
        System.out.println(circle4.toString() + ", area=" + circle4.getArea());
    }
}
