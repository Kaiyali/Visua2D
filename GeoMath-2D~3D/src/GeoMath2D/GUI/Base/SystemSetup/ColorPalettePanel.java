package GeoMath2D.GUI.Base.SystemSetup;

import GeoMath2D.GUI.Base.Assets.ClearButton;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 11:16 AM
 */
public class ColorPalettePanel extends JPanel {

    public ClearButton buttonRed = new ClearButton();
    public ClearButton buttonYellow = new ClearButton();
    public ClearButton buttonGreen = new ClearButton();
    public ClearButton buttonPurple = new ClearButton();
    public ClearButton buttonBlue = new ClearButton();
    public ClearButton buttonPink = new ClearButton();
    public ClearButton buttonLightBlue = new ClearButton();
    public ClearButton buttonOrange = new ClearButton();
    public ClearButton buttonWhite = new ClearButton();
    public ClearButton buttonBitterSweet = new ClearButton();
    public ClearButton buttonLavender = new ClearButton();
    public ClearButton buttonRose = new ClearButton();

    //COLOR PANEL GUI

    public ColorPalettePanel() {
        this.setBackground(new Color(50, 48, 48));
        this.setPreferredSize(new Dimension(225, 200));
        this.setLayout(new FlowLayout());
        setColorSetting();
    }


    public void setColorSetting(){
        buttonRed.setBackground(new Color(213, 27, 27));
        buttonRed.setPreferredSize(new Dimension(50,50));
        this.add(buttonRed);

        buttonWhite.setBackground(new Color(255, 255, 255));
        buttonWhite.setPreferredSize(new Dimension(50,50));
        this.add(buttonWhite);

        buttonYellow.setBackground(new Color(255, 229, 0));
        buttonYellow.setPreferredSize(new Dimension(50,50));
        this.add(buttonYellow);

        buttonLightBlue.setBackground(new Color(25, 212, 168));
        buttonLightBlue.setPreferredSize(new Dimension(50,50));
        this.add(buttonLightBlue);

        buttonOrange.setBackground(new Color(220, 129, 14));
        buttonOrange.setPreferredSize(new Dimension(50,50));
        this.add(buttonOrange);

        buttonPink.setBackground(new Color(255, 0, 186));
        buttonPink.setPreferredSize(new Dimension(50,50));
        this.add(buttonPink);

        buttonBlue.setBackground(new Color(32, 99, 206));
        buttonBlue.setPreferredSize(new Dimension(50,50));
        this.add(buttonBlue);

        buttonPurple.setBackground(new Color(148, 9, 234));
        buttonPurple.setPreferredSize(new Dimension(50,50));
        this.add(buttonPurple);

        buttonGreen.setBackground(new Color(112, 217, 30));
        buttonGreen.setPreferredSize(new Dimension(50,50));
        this.add(buttonGreen);

        buttonBitterSweet.setBackground(new Color(254, 111, 94));
        buttonBitterSweet.setPreferredSize(new Dimension(50,50));
        this.add(buttonBitterSweet);

        buttonLavender.setBackground(new Color(244, 187, 255));
        buttonLavender.setPreferredSize(new Dimension(50,50));
        this.add(buttonLavender);

        buttonRose.setBackground(new Color(255, 85, 163));
        buttonRose.setPreferredSize(new Dimension(50,50));
        this.add(buttonRose);

    }

}
