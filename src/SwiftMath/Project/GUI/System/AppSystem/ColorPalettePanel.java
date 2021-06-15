package SwiftMath.Project.GUI.System.AppSystem;

import SwiftMath.Project.Resources.ComponentAssets.AppColors;
import SwiftMath.Project.Resources.ShapeGraphics.ShapeManager.ShapePanel;
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


    public static final JButton openColorChooser = new JButton("OPEN COLOR CHOOSER");



    public ColorPalettePanel() {
        this.setBackground(AppColors.Variety_Beige);
        this.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
        this.setPreferredSize(new Dimension(225, 200));
        this.setLayout(null);
        openColorChooser();
    }


   public void openColorChooser() {
        openColorChooser.setBounds(12, 135, 200, 50);
        openColorChooser.setFont(new Font("Arial Black", Font.ITALIC, 13));
        openColorChooser.setFocusPainted(false);
        openColorChooser.setForeground(AppColors.Variety_WHITE);
        openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        openColorChooser.setVerticalAlignment(SwingConstants.CENTER);
        openColorChooser.setHorizontalAlignment(SwingConstants.CENTER);
        openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue);
        openColorChooser.addActionListener(this);
        this.add(openColorChooser);
   }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == openColorChooser) {
            Color color = ColorPickerDialog.showDialog(null, Color.WHITE, true);
            ShapePanel.sqrdisplay.setBackground(color);
        }
    }
}
