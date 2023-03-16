package HomeWork.dz_3;
import static HomeWork.dz_3.CollectionOfFigures.getAllFigure;
import java.util.Scanner;
public class DeleteGeometricShape {
    public static void deleteGeometricShape(){
        Scanner scanner = new Scanner(System.in);
        getAllFigure();
        System.out.print("Введите индекс геометрической фигуры, которую вы хотите удалить:  ");
        int index = scanner.nextInt();
        CollectionOfFigures collection = new CollectionOfFigures();
        collection.removeFigures(index - 1);
    }
}