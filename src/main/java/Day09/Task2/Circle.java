package Day09.Task2;

public class Circle extends Figure{

    private double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*r;
    }
}
