package Shape;

public class Rectangle extends Shape {
    public final double width;
    public final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        System.out.println(rectangle.getShapeName());
    }
}
