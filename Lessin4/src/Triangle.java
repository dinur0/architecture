public class Triangle implements IShape {
    private double side_a;
    private double side_b;
    private double side_c;

    public Triangle(double side_a, double side_b, double side_c) throws Exception {
        if (side_a + side_b < side_c || side_b + side_c < side_a || side_a + side_c < side_b) {
            throw new Exception ("Сумма длин двух любых сторон треугольника должны быть больше длины оставшейся стороны");
        }
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    @Override
    public double getArea() {
        double p = 0.5 * (side_a + side_b + side_c);
		double s = Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
		return s;
    }

    @Override
    public double getPerimeter() {
        return side_a+side_b+side_c;
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

    public double getSide_c() {
        return side_c;
    }

    public void setSide_c(double side_c) {
        this.side_c = side_c;
    }
    
}
