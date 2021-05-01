package com.company;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH on 5/1/2021 in 12:07 PM
 */
public class UsefulMethods {
    /*
    this class contains all the functionallity for methods that are useful
    for our application that we are making
     */

    //Important constants for our calculator
    public static final double PI = 3.14;
    public static final double E = Math.E;
    public final static String INVALID_VALUE_ENTERED = "Invalid Value(s) Entered";

    public void calculatePi() {
        System.out.println("Pi is = " + PI);
    }
    public void calculateE() {
        System.out.println("Euler's number or e, is = " + E);
    }
    //Important Operators
    public double add(double num1, double num2) {
        double addedNums = num1 + num2;
        System.out.println("The number " + num1 + " + " + " The number " + num2 + " is = " + addedNums);
        return addedNums;
    }

    public double subtract(double num1, double num2) {
        double subtract = num1 - num2;
        System.out.println("The number " + num1 + " minus " + "The number " + num2 + " is = " + subtract);
        return subtract;
    }

    public double multiply(double num1, double num2) {
        double multiplyNums = num1 * num2;
        System.out.println("The number " + num1 + " multiplied by " + " The number " + num2 + " is = " + multiplyNums);
        return multiplyNums;
    }

    public double divide(double num1, double num2) {
        double divideNums = num1 / num2;
        System.out.println("The number " + num1 + " divided by " + " The number " + num2 + " is = " + divideNums);
        return divideNums;
    }
    // Math basics^^^
    //Exponents and Square Roots
    public double exp(double number, double exponent) {
        double totalValue = Math.pow(number, exponent);
        System.out.println("The number " + number + " raised to the power "+ exponent + " is = " + totalValue);
        return totalValue;
    }

    public double squareRoot(double number) {
        System.out.println("The square root of the number " + number + " is = " + Math.sqrt(number));
        return Math.sqrt(number);
    }

    public double cubeRoot(double number) {
        System.out.println("The cube root of the number " + number + " is = " + Math.cbrt(64));
        return Math.cbrt(number);
    }

    public double squareNumber(double number) {
        double result = number * number;
        System.out.println("The number " + number + " squared is " + result);
        return result;
    }

    public static double cubeNumber(double number) {
        double result = number * number * number;
        System.out.println("The number " + number + " cubed is " + result);
        return result;
    }

    //Triangles
    public void typeOfTriangle(int sideOne, int sideTwo, int sideThree) {
        if(sideOne < 1 || sideTwo < 1 || sideThree < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        if(sideOne == sideTwo && sideOne == sideThree) {
            System.out.println("Your Triangle is an Equilateral Triangle");
        } else if((sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree)) {
            System.out.println("Your Triangle is an Isosceles Triangle");
        } else {
            System.out.println("Your triangle is a Scalene Triangle");
        }
    }

    public double areaOfTriangle(double base, double height) {
        if((base < 1) || (height < 1)) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double area = 0.5 * (base * height);
        System.out.println("The area of the triangle is = " + area);
        return area;
    }

    //Circles
    public double areaOfCircle(double radius) {
        if(radius < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double areaOfCircle = PI*radius*radius;
        System.out.println("The area of the circle is = " + areaOfCircle);
        return areaOfCircle;
    }

    public double circumferenceOfCircle(double radius) {
        if(radius < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double circumference = 2*PI*radius;
        System.out.println("The circumference of the circle is = " + circumference);
        return circumference;
    }

    public double findRadiusFromArea(double area) {
        if(area < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double radius = Math.sqrt(area / PI);
        System.out.println("The radius from the given area is = " + radius);
        return radius;
    }

    public double findRadiusFromCircumference(double circumference) {
        if(circumference < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double radius = circumference / (PI * 2);
        System.out.println("The radius from the given circumference is = " + radius);
        return radius;
    }

    //General Polygons -> Angles -> Diagonals

    //Rectangles -> Area
    public double areaOfRectangle(double length, double width) {
        if(length < 1 || width < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " has area of = " + area);
        return area;
    }

    public  double perimeterOfRectangle(double length, double width) {
        if(length < 1 || width < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double perimeter = (2*length) + (2*width);
        System.out.println("The perimeter of your rectangle with length " + length + " and width of " + width + " has perimeter of = " + perimeter);
        return perimeter;
    }
}
