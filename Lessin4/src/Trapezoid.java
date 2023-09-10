public class Trapezoid implements IShape{
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Trapezoid(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    @Override
    public double getArea() {
        return ((side1+side2)/2)*(Math.sqrt(Math.pow(side3,2)-((Math.pow(side2-side1,2)+Math. pow(side3-side4,2))/(2*(side2-side1)))));
    }

    @Override
    public double getPerimeter() {
        return side1+side2+side3+side4;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }
}
