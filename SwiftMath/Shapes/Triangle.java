package SwiftMath.Shapes;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JComponent {

    public void paintComponent(Graphics g) {
        int [] x = {50,100,0};
        int [] y = {0,100,100};
        g.drawPolygon(x, y, 3);
    }

}
