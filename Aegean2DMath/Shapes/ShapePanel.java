package Aegean2DMath.Shapes;

import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel {

    Square sq = new Square();
    public ShapePanel() {
        //shape panel is defined in application as a new jPanel
        this.setBackground(new Color(214, 214, 214));
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(null);
        this.add(sq);
    }
}
