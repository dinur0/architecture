public class Rectangle implements IShape {
    private double side_a;
    private double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    @Override
    public double getArea() {
        return side_a*side_b;
    }

    @Override
    public double getPerimeter() {
        return (side_a*2)+(side_b*2);
    }

    public double getSide_a() {
        return side_a;
    }

    public void setSide_a(double side_a) {
        this.side_a = side_a;
    }

    public double getSide_b() {
        return side_b;
    }

    public void setSide_b(double side_b) {
        this.side_b = side_b;
    }
    
}
