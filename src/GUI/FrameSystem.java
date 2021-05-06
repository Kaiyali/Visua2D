package src.GUI;

import javax.swing.*;
import java.awt.*;

public class FrameSystem extends JFrame {

    FrameSystem() {
        ImageIcon img = new ImageIcon("C:\\Users\\Owner\\IdeaProjects\\" +
                "Master Calculator\\src\\Master-Calculator.jpg");
        this.setIconImage(img.getImage());
        this.setSize(950,850);
        this.setTitle("GeoMath 2D/3D"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(214, 214, 214));
    }
}
