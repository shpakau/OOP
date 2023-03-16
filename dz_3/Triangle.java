package HomeWork.dz_3;
public class Triangle extends GeometricShapes implements Square, Perimeter{

    private double a, b, c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void getPerimeter() {
        double perimeter = a + b + c;
        System.out.printf("Периметр: %.2f%n", perimeter);
    }

    @Override
    public void getSquare() {
        double perimeter = a + b + c;
        double p = perimeter / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p-c));
        System.out.printf("Квадрат: %.2f%n", square);
    }

    @Override
    public String toString() {
        return String.format("Сторона a: %.2f  Сторона b: %.2f  Сторона c: %.2f", a, b, c);
    }

    @Override
    public double getSortSquare() {
        double perimeter = a + b + c;
        double p = perimeter / 2;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p-c));
        return square;
    }
}