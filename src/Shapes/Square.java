package src.Shapes;
import src.functionality.UsefulMethods;

public class Square extends UsefulMethods  {

    public Square(double length, double width, double side) {
        UsefulMethods.squareArea(length, width);
        UsefulMethods.squarePerimeter(side);
    }
}
