package Aegean2DMath.Shapes;

import java.awt.*;

public class CircleFrameWork{
    private Color color; // change this to a JComponent that displays all// shapes
    private int diameter;
    public CircleFrameWork(){
        color = Color.black;
        this.diameter = 100;
    }

    public void setCircleBlue(){
        this.setColor(new Color(12,12,12));
    }
    public void setColor(Color color) {

        this.color = color;
    }


}
