package HomeWork.dz_3;
import java.util.Scanner;

public class AddTriangle {
    private static Scanner in = new Scanner(System.in);

    public static void addTriangle() {
        System.out.print("Введите длину сторон треугольника\nA: ");
        double a = in.nextDouble();
        System.out.print("B: ");
        double b = in.nextDouble();
        System.out.print("C: ");
        double c = in.nextDouble();

        if(isTrianglePossible(a, b, c)){
            Triangle triangle = new Triangle(a, b, c);
            CollectionOfFigures collectionOfFigures = new CollectionOfFigures();
            collectionOfFigures.addFigures(triangle);
            System.out.println("Треугольник добавлен");
        } else {
            System.out.printf("Невозможно построить треугольник со сторонами %.2f, %.2f и %.2f", a, b, c);
        }
        System.out.println();
    }

    private static boolean isTrianglePossible(double a, double b, double c){
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }
}