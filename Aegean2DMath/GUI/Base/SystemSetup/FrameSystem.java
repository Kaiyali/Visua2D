package Aegean2DMath.GUI.Base.SystemSetup;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 8:53 AM
 */
public class FrameSystem extends JFrame {

    public FrameSystem() {
        ImageIcon img = new ImageIcon("src/Aegean2DMath/Images/GeoMathImage.jpg");
        this.setIconImage(img.getImage());
        this.setSize(1600,760);
        this.setTitle("Aegean 2D - Math Engine"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(214, 214, 214));

    }

    //Paint methods


}
