package Shape;

public class NamePrinter {
    public static void printShapeName(Shape shape) {
        String shapeName = shape.getShapeName();
        System.out.println("Shape name: " + shapeName);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        Triangle triangle = new Triangle(6.0, 4.0);
        Quad quad = new Quad(8.0);
        Parallelogram parallelogram = new Parallelogram(10.0, 6.0);

        System.out.println("Circle");
        System.out.println("Rectangle");
        System.out.println("Triangle");
        System.out.println("Quad");
        System.out.println("Parallelogram");
    }
}

