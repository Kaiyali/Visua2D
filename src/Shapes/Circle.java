package src.Shapes;
import src.functionality.UsefulMethods;
/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/3/2021 in 10:54 PM
 */
public class Circle extends UsefulMethods  {

    public Circle(double radius) {
        UsefulMethods.circleArea(radius);
        UsefulMethods.circleCircumference(radius);
        UsefulMethods.calculatePi();
        UsefulMethods.radiusFromArea(circleArea(radius));
        UsefulMethods.radiusFromCircumference(circleCircumference(radius));
    }

}
