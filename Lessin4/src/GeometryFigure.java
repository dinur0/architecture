import java.util.ArrayList;

public class GeometryFigure {
    static private ArrayList<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<IShape>();
    }

    // Метод для добаления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }
    // Метод для удаления фигуры
    public void remove(IShape figure) {
        toolbox.remove(figure);
    }
    // Метод поиска необходимой фигуры
    public IShape searchFigure(IShape figure) {
        IShape res = null;
        for (IShape iShape : toolbox) {
            if (iShape==figure) {
                res = iShape;
                break;
            }
        }
        return res;
        
    }
    // Метод отображения подробной информации о фигурк
    public void getInfo(int num) {
        IShape figure = toolbox.get(num);
        System.out.println(figure.getArea()+" "+figure.getPerimeter());
    }

    // ...
}
