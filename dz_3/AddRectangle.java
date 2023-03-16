package HomeWork.dz_3;
import java.util.Scanner;
public class AddRectangle {
    private static final Scanner in = new Scanner(System.in);

    public static void addRectangle(){
        System.out.print("Введите стороны прямоугольника\nA: ");
        Double a = in.nextDouble();

        System.out.print("B: ");
        Double b = in.nextDouble();

        if(a.equals(b)){
            System.out.println("Вы не можете создать прямоугольник с одинаковыми сторонами");
            return;
        }

        Rectangle rectangle = new Rectangle(a, b);
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.addFigures(rectangle);
        System.out.println("Прямоугольник добавлен\n");
    }
}