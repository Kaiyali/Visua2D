package src.Shapes;
import src.functionality.UsefulMethods;
import javax.swing.*;
import java.awt.*;
/**
    This is just an idea and setting up the foundation and ideology for the drawing of the shapes.
    I am using Graphics to develop and draw this rectangle. I still did not finish nor check if the file works.
    Hope this helps!
 **/
public class Rectangle extends JComponent {
    
     public Rectangle(double length, double width) {
        UsefulMethods.rectangleArea(length, width);
        UsefulMethods.rectanglePerimeter(length, width);
    }
    
    //draw rect
    public void paint(Graphics g){
        g.drawRect(480,480,200,100);


    }

   

}
