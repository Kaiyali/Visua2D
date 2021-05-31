package Aegean2DMath.GUI.Base.SystemSetup;

import com.bric.colorpicker.ColorPickerDialog;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 11:16 AM
 */
public class ColorPalettePanel extends JPanel implements ActionListener {

    //COLOR PANEL GUI

    public final JButton openColorChooser = new JButton("OPEN COLOR CHOOSER");

    public ColorPalettePanel() {
        this.setBackground(new Color(185, 177, 133));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 4));
        this.setPreferredSize(new Dimension(225, 200));
        this.setLayout(null);
        openColorChooser();
    }


   public void openColorChooser() {
        openColorChooser.setBounds(12, 135, 200, 50);
        openColorChooser.setFont(new Font("Arial Black", Font.ITALIC, 13));
        openColorChooser.setFocusPainted(false);
        openColorChooser.setForeground(Color.WHITE);
        openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        openColorChooser.setVerticalAlignment(SwingConstants.CENTER);
        openColorChooser.setHorizontalAlignment(SwingConstants.CENTER);
        openColorChooser.setBackground(new Color(4, 96, 132));
        openColorChooser.addActionListener(this);
        this.add(openColorChooser);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == openColorChooser) {
            System.out.println(ColorPickerDialog.showDialog(null, Color.WHITE, true));
        }
    }
}
