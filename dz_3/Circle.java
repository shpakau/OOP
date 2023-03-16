package HomeWork.dz_3;
public class Circle extends GeometricShapes implements CircumferenceLength, Square {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус должен быть больше 0");
        }
        this.radius = radius;
    }

    @Override
    public void getCircumferenceLength() {
        double length = 2 * Math.PI * radius;
        System.out.printf("Длина окружности: %.2f%n", length);
    }

    @Override
    public void getSquare() {
        double square = Math.PI * radius * radius;
        System.out.printf("Площадь окружности: %.2f%n", square);
    }

    @Override
    public String toString() {
        return String.format("Радиус окружности: %.2f%n", radius);
    }

    @Override
    public double getSortSquare() {
        return Math.PI * radius * radius;
    }
}