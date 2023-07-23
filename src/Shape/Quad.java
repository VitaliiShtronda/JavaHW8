package Shape;

public class Quad extends Shape{

    public static double sideLength;
    public Quad(double sideLength){
        this.sideLength = sideLength;
    }
    @Override
    public String getShapeName() {
        return "Quad";
    }
    public static void main(String[] args) {
        Quad quad = new Quad(8.0);
        System.out.println(quad.getShapeName());
    }

}

