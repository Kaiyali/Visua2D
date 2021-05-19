package com.GUI;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH AND DANIEL KAIYALI on 5/17/2021 in 8:53 AM
 */
public class FrameSystem extends JFrame {

    FrameSystem() {
        ImageIcon img = new ImageIcon("C:\\Users\\Owner\\IdeaProjects\\" +
                "GeoMath-2D-3D\\src\\com\\Images\\GeoMathImage.jpg");
        this.setIconImage(img.getImage());
        this.setSize(1320,820);
        this.setTitle("GeoMath 2D/3D"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(new Color(214, 214, 214));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(400, 100, 300, 300);
        g.fillRect(400, 100, 300, 300);
        g.setColor(Color.RED);
    }
}
