package HomeWork.dz_3;
public class Rectangle extends GeometricShapes implements Square, Perimeter {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными.");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * (a + b);
        System.out.printf("Периметр: %.2f%n", perimeter);
    }

    @Override
    public void getSquare() {
        double square = a * b;
        System.out.printf("Площадь: %.2f%n", square);
    }

    @Override
    public String toString() {
        return String.format("Сторона a: %.2f  Сторона b: %.2f", a, b);
    }

    @Override
    public double getSortSquare() {
        return a * b;
    }
}