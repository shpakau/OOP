package HomeWork.dz_3;
public class Quadrate extends GeometricShapes implements Square, Perimeter {

    private Double sideLength;

    public Quadrate(Double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void getPerimeter() {
        Double perimeter = 4 * sideLength;
        System.out.printf("Периметр: %.2f%n", perimeter);
    }

    @Override
    public void getSquare() {
        Double square = sideLength * sideLength;
        System.out.printf("Площадь: %.2f%n", square);
    }

    @Override
    public String toString() {
        return String.format("Длина стороны квадрата: %.2f", sideLength);
    }

    @Override
    public double getSortSquare() {
        Double result = sideLength * sideLength;
        return result;
    }
}