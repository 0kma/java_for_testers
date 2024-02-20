public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7);
        printSquareArea(5);
        printSquareArea(3);

        printRectangleArea(3.0, 5.0);
        printRectangleArea(4.0, 5.5);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со стороной " + a + " и " + b + " = " + rectangleArea(a, b));
    }

    private static double rectangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareArea(double side) {
        System.out.println("Площадь квадрата со стороной " + side + " = " + squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}