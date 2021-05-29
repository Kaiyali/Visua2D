package Aegean2DMath.Shapes;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/3/2021 in 10:54 PM
 */
public class Circle extends JPanel {
   CircleFrameWork Circle = new CircleFrameWork();

    public void paintComponent(Graphics g){
        g.setColor(new Color(205, 39, 205));
        g.fillOval(100,100,10,10);
    }

    public void changeTheColor() {
        Circle.setCircleBlue();
        repaint();
    }
}

/*
class DrawingCircle implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        CircleFrameWork.setCircleBlue();
    }


}
*/
