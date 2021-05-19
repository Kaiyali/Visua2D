package com.Shapes;

import javax.swing.*;
import java.awt.*;

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
