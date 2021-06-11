package SwiftMath.Functionallity;


public class ShapeAssets {

    public static double squareOrRectangleArea(double length, double width) {
        return length * width;
    }
    //double result = squareOrRectangleArea(lengthNum, widthNum);

    public static double squareRectanglePerimeter(double length, double width) {
        return (2 * length) + (2 * width);
    }

    public static double TriangleArea(double base, double height) {
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

     public static String QuadType(double SideOne, double SideTwo, double SideThree, double SideFour){
         if((SideOne == SideTwo) && (SideTwo == SideThree) && (SideThree == SideFour)){
             return "This is a Square";
         }else if((SideOne == SideThree) && (SideTwo == SideFour) && (SideThree !=  SideTwo)){
             return "This is a Rectangle";
         }else if((SideOne == SideTwo) && (SideThree == SideFour) && (SideFour !=  SideTwo)){
             return "This is a Rectangle";
         }else if((SideOne == SideFour) && (SideTwo == SideThree) && (SideFour !=  SideTwo)){
             return "This is a Rectangle";
         }else{
             return "This is a general quadrilateral";
         }
     }

    public static String TriangleType(double SideOne, double SideTwo, double SideThree) {
        if(SideOne == SideTwo && SideOne == SideThree) {
            return"Your Triangle is an Equilateral Triangle";
        } else if((SideOne == SideTwo) || (SideOne == SideThree) || (SideTwo == SideThree)) {
            return"Your Triangle is an Isosceles Triangle";
        } else {
            return"Your triangle is a Scalene Triangle";
        }
    }
}

