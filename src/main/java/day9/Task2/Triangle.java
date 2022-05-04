package day9.Task2;

public class Triangle extends Figure{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double widthA, double widthB, double widthC, String color) {
        super(color);
        this.sideA = widthA;
        this.sideB = widthB;
        this.sideC = widthC;
    }

    @Override
    public double area() {
        double p = (sideA + sideB + sideC)/2;
        double s = Math.sqrt((p)*(p - sideA)*(p - sideB)*(p - sideC));
        return s;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
