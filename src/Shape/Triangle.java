package Shape;

public class Triangle extends Shape {
    public static double base;
    public static double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6.0, 4.0);
        System.out.println(triangle.getShapeName());
    }
}
