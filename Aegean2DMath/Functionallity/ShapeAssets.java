package Aegean2DMath.Functionallity;

public class ShapeAssets {

    public static double squareOrRectangleArea(double length, double width) {
        return length * width;
    }
    //double result = squareOrRectangleArea(lengthNum, widthNum);

    public static double squareRectanglePerimeter(double length, double width) {
        return (2 * length) + (2 * width);
    }

    public static double areaOfTriangle(double base, double height) {
        return (base / 2) * height;
    }

    public static double perimeterOfTriangle(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }


    public static double areaOfCircle(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }


    //quad type method
    public static String QuadType(double side1, double side2, double side3, double side4) {
        if (side1 == side3 && side2 == side4 && side1 != side2 &&
                side2 != side3 && side3 != side4 && side1 != side4) {
            return "This is a Rectangle";
            //QuadTypeFld.setText("This is a Rectangle");
        } else if (side1 == side2 && side3 == side4 &&
                side1 != side3 && side2 != side4 &&
                side1 != side4 && side2 != side3) {
            return "This is a Rectangle";
        } else if (side1 == side4 && side2 == side3 && side1 != side2 &&
                side1 != side3 && side2 != side4 && side3 != side4) {
            return "This is a Rectangle";
        } else if ((side1 == side2) && (side2 == side3) && (side3 == side4) &&
                (side1 == side3) && (side1 == side4) && (side2 == side4)) {
            return "This is a Square";
        } else {
            return "This is a Quadrilateral";
        }

//        } else if ((side1 != side2) && (side2 != side3) && (side3 != side4) && (side1 != side3) && (side1 != side4) && (side2 != side4)) {
//            return "This is a Quadrilateral";
//        } else if (side1 != side2 && side1 != side3 && side1 != side4 && side2 == side3 && side3 == side4 && side2 == side4) {
//            return "This is a Quadrilateral";
//        } else if (side1 == side2 && side2 == side3 && side1 == side3 && side4 != side1 && side4 != side2 && side4 != side3) {
//            return "This is a Quadrilateral";
//        } else if (side1 == side2 && side3 != side4 && side1 != side3 && side1 != side4 && side2 != side3 && side2 != side4) {
//            return "This is a Quadrilateral";
//        } else if (side1 != side2 && side3 == side4 && side1 != side3 && side1 != side4 && side2 != side3 && side2 != side4) {
//            return "This is a Quadrilateral";
//        } else if (side1 != side2 && side2 != side3 && side3 == side4 && side1 == side3 && side1 == side4 && side2 != side4) {
//            return "This is a Quadrilateral";
//        } else if ((side1 == side2 && side2 != side3 && side3 != side4) && (side1 != side3 && side1 == side4 && side2 == side4)) {
//            return "This is a Quadrilateral";
//        } else if ((side1 == side4 && side2 != side3) && (side1 != side2 && side1 != side3 && side2 != side4)) {
//            return "This is a Quadrilateral";
//        } else if (side1 != side2 && side1 != side3 && side1 != side4 && side2 == side4 && side2 != side3 && side3 != side4) {
//            return "This is a Quadrilateral";
//        } else if (side1 == side3 && side1 != side2 && side1 != side4 && side2 != side4 && side2 != side3) {
//            return "This is a Quadrilateral";
//        } else if (side2 == side3 && side1 != side4 && side1 != side2 && side1 != side3 && side2 != side4) {
//            return "This is a Quadrilateral";
//        } else {
//            return "";
//        }
        //QuadType will go here - making a new checkbox for that - have a new window.
    }
}
