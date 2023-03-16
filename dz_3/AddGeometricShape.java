package HomeWork.dz_3;
import static HomeWork.dz_3.AddTriangle.addTriangle;
import static HomeWork.dz_3.AddSquare.addSquare;
import static HomeWork.dz_3.AddRectangle.addRectangle;
import static HomeWork.dz_3.AddCircle.addCircle;

import java.util.Scanner;

public class AddGeometricShape {
    private static final int TRIANGLE = 1;
    private static final int SQUARE = 2;
    private static final int RECTANGLE = 3;
    private static final int CIRCLE = 4;
    private static final int EXIT = 5;

    public static void addGeometricShape(int choice) {
        System.out.println("Какую геометрическую фигуру вы хотите добавить:");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Квадрат");
        System.out.println("3 - Прямоугольник");
        System.out.println("4 - Круг");
        System.out.println("5 - Выход");

        Scanner in = new Scanner(System.in);
        int choice1 = in.nextInt();

        switch (choice1) {
            case TRIANGLE:
                addTriangle();
                break;
            case SQUARE:
                addSquare();
                break;
            case RECTANGLE:
                addRectangle();
                break;
            case CIRCLE:
                addCircle();
                break;
            case EXIT:
                System.exit(0);
                break;
            default:
                System.out.println("Неверный выбор, попробуйте еще раз");
                break;
        }
    }
}