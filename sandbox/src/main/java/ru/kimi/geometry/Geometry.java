package ru.kimi.geometry;

import ru.kimi.geometry.figures.Rectangle;
import ru.kimi.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquareArea(7);
        Square.printSquareArea(5);
        Square.printSquareArea(3);

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(4.0, 5.5);
    }

}
