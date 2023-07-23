package Shape;

public class Circle extends Shape {

    public final double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.name = "Circle";
    }


    @Override
    public String getShapeName() {
        return "Circle";
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println(circle.getShapeName());
    }
}
