package HomeWork.dz_3;
import java.util.Scanner;

public class AddSquare {
    public static void addSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер квадрата: ");
        double size = scanner.nextDouble();
        scanner.nextLine();

        Quadrate quadrate = new Quadrate(size);
        CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
        collectionOfFigures.addFigures(quadrate);
        System.out.println("Квадрат добавлен успешно.");
        System.out.println();
    }
}