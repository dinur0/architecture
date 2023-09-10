public class Main {
    public static void main(String[] args) throws Exception {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Triangle triangle1 = new Triangle(3, 4, 6);
        figureBox.add(circle1);
        figureBox.add(triangle1);
        figureBox.getInfo(1);




    }
}