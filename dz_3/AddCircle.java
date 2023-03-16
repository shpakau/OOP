package HomeWork.dz_3;
import java.util.Scanner;
public class AddCircle {

    public static void addCircle(){
        Scanner scanner = new Scanner(System.in);
        double radius;
        do {
            System.out.print("Введите радиус окружности:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Неверный ввод! Введите правильный радиус:");
                scanner.next();
            }
            radius = scanner.nextDouble();
        } while (radius <= 0);

        Circle circle = new Circle(radius);
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.addFigures(circle);
        System.out.println("Круг добавлен успешно!");
    }
}
