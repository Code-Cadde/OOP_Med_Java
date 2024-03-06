package The_color_and_the_shape;

// Basic exercise to try overriding, extends and superclass.

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Area: " + circle.getArea());

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
