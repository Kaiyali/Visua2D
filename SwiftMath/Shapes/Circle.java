package SwiftMath.Shapes;

import com.bric.colorpicker.ColorPickerDialog;

import javax.swing.*;
import java.awt.*;


public class Circle extends JComponent {

    public static int cornerRadius;
    public static Color color;


    public Circle(int radius) {
        cornerRadius = radius;
    }

    public void setColor(Color colorOfCircle) {
        color = colorOfCircle;
    }

    public Color getColor() {
        return color;
    }


    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        int width = getWidth();
        int height = getHeight();
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Draws the rounded panel with borders.
        graphics.setColor(getColor());
        graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//
    }

    public void changeColorOfTheCircle() {
        Color color = ColorPickerDialog.showDialog(null, Color.WHITE, true);
        this.setColor(color);
        repaint();
    }
}

