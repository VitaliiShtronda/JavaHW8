package Shape;

public class Parallelogram extends Shape {
    public static double base;
    public static double height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Parallelogram";
    }
    public static void main(String[] args) {
        Parallelogram parallelogram = new Parallelogram(10.0, 6.0);
        System.out.println(parallelogram.getShapeName());
    }
}
