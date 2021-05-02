package src;

import javax.swing.*;
import java.awt.*;

public class FrameSystem extends JFrame {

    FrameSystem() {
        ImageIcon img = new ImageIcon("C:\\Users\\Owner\\IdeaProjects\\" +
                "Master Calculator\\src\\Master-Calculator.jpg");
        this.setIconImage(img.getImage());
        this.setSize(800,700);
        this.setResizable(false);
        this.setTitle("Master 2D Calculator"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(52, 52, 52));
    }
}
