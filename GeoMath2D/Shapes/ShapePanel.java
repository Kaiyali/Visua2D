package GeoMath2D.Shapes;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 9:48 AM
 */
public class ShapePanel extends JPanel {

    public ShapePanel() {
        //shape panel is defined in application as a new jPanel
        this.setBackground(new Color(214, 214, 214));
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(null);
    }

    public void paint(Graphics g){
        g.fillRect(130, 130,100, 100);
    }
}
