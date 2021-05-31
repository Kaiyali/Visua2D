package Aegean2DMath.Functionallity;

public class ShapeAssets {

    public static double squareOrRectangleArea(double length, double width) {
        return length * width;
    }
    //double result = squareOrRectangleArea(lengthNum, widthNum);

    public static double squareRectanglePerimeter(double length, double width) {
        return (2*length)  + (2*width);
    }

    public static double areaOfTriangle(double base, double height) {
        return (base/2) * height;
    }

    public static double perimeterOfTriangle(double side1, double side2, double side3) {
        return  side1 + side2 + side3;
    }


    public static double areaOfCircle(double radius) {
        return Math.PI*radius*radius;
    }

    public static double circumferenceOfCircle(double radius) {
        return 2*Math.PI*radius;
    }

    //QuadType will go here - making a new checkbox for that - have a new window.
}
