package HomeWork.dz_3;
import java.util.Comparator;
public class SortSquare implements Comparator<GeometricShapes>{
    @Override
    public int compare(GeometricShapes figure1, GeometricShapes figure2) {
        double square1 = figure1.getSortSquare();
        double square2 = figure2.getSortSquare();
        return Double.compare(square1, square2);
    }

}