package com.Shapes;

import com.Functionallity.UsefulMethods;

public class Square extends UsefulMethods {

    public Square(double length, double width, double side) {
        UsefulMethods.squareArea(length, width);
        UsefulMethods.squarePerimeter(side);
    }
}
