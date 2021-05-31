package Aegean2DMath.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 4:41 PM
 */
public class Menu extends JFrame implements ActionListener {

    private JFrame windowFrame = new JFrame();
    private JButton startApp = new JButton("Start Application");
    private JLabel[] startLabels = {new JLabel("GeoMath - 2D | Calculator"), new JLabel("Programmed by Archisman Nath and Daniel Kayali in the JAVA programming language")};

    Font roboto = new Font("Roboto", Font.BOLD, 28);

    public Menu() {
        ImageIcon img = new ImageIcon("C:\\Users\\ARCHISMAN NATH\\Desktop\\GeoMath-2D~3D\\src\\com\\Images\\GeoMathImage.jpg");
        windowFrame.setSize(750, 600);
        windowFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        windowFrame.setResizable(false);
        windowFrame.getContentPane().setBackground(new Color(105, 0, 0));
        windowFrame.setTitle("GeoMath 2D - Menu Screen");
        windowFrame.setIconImage(img.getImage());
        windowFrame.setLayout(null);
        setVisible();

        //Setting our labels
        setFirstStartLbl();
    }

    public void setFirstStartLbl() {
        startLabels[0].setBounds(100, 100, 350, 50);
        startLabels[0].setFont(roboto);
        startLabels[0].setForeground(Color.WHITE);
        startLabels[0].setVerticalAlignment(SwingConstants.CENTER);
        startLabels[0].setHorizontalAlignment(SwingConstants.CENTER);
        windowFrame.add(startLabels[0]);
    }

    public void setVisible() {
        windowFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
