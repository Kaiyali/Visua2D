package com.Shapes;

import com.Functionallity.UsefulMethods;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/3/2021 in 10:54 PM
 */
public class Triangle {

    public Triangle(double base, double height, double side1, double side2, double side3) {
        UsefulMethods.triangleArea(base, height);
        UsefulMethods.trianglePerimeter(side1, side2, side3);
        UsefulMethods.typeOfTriangle(side1, side2, side3);
    }
}
