package src.functionality;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH and Daniel Kaiyali on 5/1/2021 in 12:07 PM
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

    public static void calculatePi() {
        System.out.println("Pi is = " + PI);
    }
    public static void calculateE() {
        System.out.println("Euler's number or e, is = " + E);
    }
    //Important Operators
    public static double Add(double num1, double num2) {
        double addedNums = num1 + num2;
        System.out.println("The number " + num1 + " + " + " The number " + num2 + " is = " + addedNums);
        return addedNums;
    }

    public static double subtract(double num1, double num2) {
        double subtract = num1 - num2;
        System.out.println("The number " + num1 + " minus " + "The number " + num2 + " is = " + subtract);
        return subtract;
    }

    public static double multiply(double num1, double num2) {
        double multiplyNums = num1 * num2;
        System.out.println("The number " + num1 + " multiplied by " + " The number " + num2 + " is = " + multiplyNums);
        return multiplyNums;
    }

    public static double divide(double num1, double num2) {
        double divideNums = num1 / num2;
        System.out.println("The number " + num1 + " divided by " + " The number " + num2 + " is = " + divideNums);
        return divideNums;
    }
    // Math basics^^^
    //Exponents and Square Roots
    public static double exp(double number, double exponent) {
        double totalValue = Math.pow(number, exponent);
        System.out.println("The number " + number + " raised to the power "+ exponent + " is = " + totalValue);
        return totalValue;
    }

    public static double squareRoot(double number) {
        System.out.println("The square root of the number " + number + " is = " + Math.sqrt(number));
        return Math.sqrt(number);
    }

    public static double cubeRoot(double number) {
        System.out.println("The cube root of the number " + number + " is = " + Math.cbrt(64));
        return Math.cbrt(number);
    }

    public static double squareNumber(double number) {
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
    public static void typeOfTriangle(int sideOne, int sideTwo, int sideThree) {
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

    public static double triangleArea(double base, double height) {
        if((base < 1) || (height < 1)) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double area = 0.5 * (base * height);
        System.out.println("The area of the triangle is = " + area);
        return area;
    }

    //Circles
    public static double circleArea(double radius) {
        if(radius < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double areaOfCircle = PI*radius*radius;
        System.out.println("The area of the circle is = " + areaOfCircle);
        return areaOfCircle;
    }

    public static double circleCircumference(double radius) {
        if(radius < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double circumference = 2*PI*radius;
        System.out.println("The circumference of the circle is = " + circumference);
        return circumference;
    }

    public static double radiusFromArea(double area) {
        if(area < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double radius = Math.sqrt(area / PI);
        System.out.println("The radius from the given area is = " + radius);
        return radius;
    }

    public static double radiusFromCircumference(double circumference) {
        if(circumference < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double radius = circumference / (PI * 2);
        System.out.println("The radius from the given circumference is = " + radius);
        return radius;
    }

    //General Polygons -> Angles -> Diagonals

    //Rectangles -> Area
    public static double rectangleArea(double length, double width) {
        if(length < 1 || width < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " has area of = " + area);
        return area;
    }

    public static double rectanglePerimeter(double length, double width) {
        if(length < 1 || width < 1) {
            System.out.println(INVALID_VALUE_ENTERED);
        }
        double perimeter = (2*length) + (2*width);
        System.out.println("The perimeter of your rectangle with length " + length + " and width of " + width + " has perimeter of = " + perimeter);
        return perimeter;
    }

    //new method
    public static void squareArea(double length, double width) {
        double area = length * width;
        if(length < 0 || width < 0) {
            System.out.println(INVALID_VALUE_ENTERED);
        } else {
            if(length != width) {
                System.out.println("This is not a square - please enter the same values for width and length");
            } else {
                System.out.println(area);
            }
        }
    }
    
     public static void squarePerimeter(double side) {
        double perimeter = side * 4;
        if(side < 0) {
            System.out.println(INVALID_VALUE_ENTERED);
        } else {
            System.out.println("The perimeter is " + perimeter);
        }
    }
}
