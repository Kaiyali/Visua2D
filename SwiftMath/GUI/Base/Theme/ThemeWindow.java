package SwiftMath.GUI.Base.Theme;

import SwiftMath.GUI.Base.Assets.ColorVar;
import SwiftMath.GUI.Base.SystemSetup.BottomGUI;
import SwiftMath.GUI.Base.SystemSetup.ColorPalettePanel;
import SwiftMath.GUI.Base.SystemSetup.SideGUI;
import SwiftMath.GUI.Manager.Application;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeWindow extends JFrame implements ActionListener {

    String[] themes = {"Heaven", "Midnight", "Ocean", "Variety", "Sunset"};
    public JComboBox chooseThemeComboBox = new JComboBox(themes);
    public JLabel ChooseThemeLbl = new JLabel("Choose Your Theme");

    public ThemeWindow() {
        this.setResizable(false);
        this.setTitle("Choose Theme");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("src/Aegean2DMath/Images/UITheme-removebg-preview.png");
        this.setLayout(null);
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(238, 238, 238));

        ChooseThemeLbl.setForeground(Color.BLACK);
        ChooseThemeLbl.setFont(new Font("Arial Black", Font.BOLD, 26));
        ChooseThemeLbl.setBounds(15, 30, 350, 50);
        this.add(ChooseThemeLbl);

        chooseThemeComboBox.setBounds(70,80, 170, 40);
        chooseThemeComboBox.setEditable(false);
        chooseThemeComboBox.setFont(new Font("Arial", Font.BOLD, 20));
        chooseThemeComboBox.addActionListener(this);
        this.add(chooseThemeComboBox);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(chooseThemeComboBox.getSelectedItem() == themes[0]) {
            //Change the theme to Heaven White Theme
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[1]) {

            //change the theme to midnight
            Application.bottomPanel.setBackground(ColorVar.Midnight_Black);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(ColorVar.Midnight_Black);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 1));
            BottomGUI.calculateAreaButton.setForeground(ColorVar.Midnight_White);
            BottomGUI.calculatePCBtn.setBackground(ColorVar.Midnight_Black);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 1));
            BottomGUI.calculatePCBtn.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.DimensionPanel.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(ColorVar.Midnight_Black);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(ColorVar.Midnight_Black);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 2));
            BottomGUI.CalPanel.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.lengthlbl.setBackground(ColorVar.Midnight_Blue);
            BottomGUI.lengthlbl.setForeground(ColorVar.Midnight_White);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(ColorVar.Midnight_White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(ColorVar.Midnight_Blue);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(ColorVar.Midnight_Blue);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(Color.RED);
            BottomGUI.un2Label.setForeground(Color.RED);
            BottomGUI.clearButton.setBackground(ColorVar.Midnight_White);
            BottomGUI.clearButton.setForeground(ColorVar.Black);

            //SIDE GUI
            Application.sidePanel.setBackground(ColorVar.Midnight_Blue.darker().darker());
            SideGUI.Squarebutton.setBackground(ColorVar.Midnight_Gray);
            SideGUI.Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Squarebutton.setForeground(ColorVar.Variety_WHITE);
            SideGUI.Trianglebutton.setBackground(ColorVar.Midnight_Gray);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(ColorVar.Variety_WHITE);
            SideGUI.Rectanglebutton.setBackground(ColorVar.Midnight_Gray);
            SideGUI.Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Rectanglebutton.setForeground(ColorVar.Variety_WHITE);
            SideGUI.CircleButton.setBackground(ColorVar.Midnight_Gray);
            SideGUI.CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.CircleButton.setForeground(ColorVar.Variety_WHITE);
            SideGUI.CalculatorButton.setBackground(ColorVar.Midnight_White);
            SideGUI.CalculatorButton.setForeground(ColorVar.Midnight_Black);
            SideGUI.formulaPanel.setBackground(ColorVar.Midnight_Black);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 2));
            SideGUI.TriangleRbtn.setBackground(ColorVar.Variety_BLACK);
            SideGUI.TriangleRbtn.setForeground(ColorVar.Variety_WHITE);
            SideGUI.CircleRbtn.setBackground(ColorVar.Variety_BLACK);
            SideGUI.CircleRbtn.setForeground(ColorVar.Variety_WHITE);
            SideGUI.OpenQuad.setBackground(ColorVar.Variety_WHITE);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(ColorVar.Midnight_Black.brighter().brighter().brighter());
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(ColorVar.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(ColorVar.Variety_Aqua_Navy_Blue.darker());
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[2]) {
            Application.bottomPanel.setBackground(ColorVar.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(ColorVar.Black);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(ColorVar.White, 1));
            BottomGUI.calculateAreaButton.setForeground(ColorVar.White);
            BottomGUI.calculatePCBtn.setBackground(ColorVar.Black);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(ColorVar.White, 1));
            BottomGUI.calculatePCBtn.setForeground(ColorVar.White);
            BottomGUI.DimensionPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.CalPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.lengthlbl.setBackground(ColorVar.Blue_Grotto);
            BottomGUI.lengthlbl.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(ColorVar.White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(ColorVar.Misty_blue);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Black, 1));
            BottomGUI.AreaInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Black, 1));
            BottomGUI.PCInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(ColorVar.White);
            BottomGUI.un2Label.setForeground(ColorVar.White);
            BottomGUI.clearButton.setForeground(ColorVar.White);
            BottomGUI.clearButton.setBackground(ColorVar.Black);

            //Side GUI
            Application.sidePanel.setBackground(ColorVar.Misty_blue);
            SideGUI.Squarebutton.setBackground(ColorVar.Cool_Gray);
            SideGUI.Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Squarebutton.setForeground(ColorVar.White);
            SideGUI.Trianglebutton.setBackground(ColorVar.Cool_Gray);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(ColorVar.White);
            SideGUI.Rectanglebutton.setBackground(ColorVar.Cool_Gray);
            SideGUI.Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Rectanglebutton.setForeground(ColorVar.White);
            SideGUI.CircleButton.setBackground(ColorVar.Cool_Gray);
            SideGUI.CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.CircleButton.setForeground(ColorVar.White);
            SideGUI.CalculatorButton.setBackground(ColorVar.Cool_Gray);
            SideGUI.CalculatorButton.setForeground(ColorVar.White);
            SideGUI.formulaPanel.setBackground(ColorVar.Cool_Gray);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.White, 2));
            SideGUI.TriangleRbtn.setBackground(ColorVar.White);
            SideGUI.TriangleRbtn.setForeground(ColorVar.White);
            SideGUI.CircleRbtn.setBackground(ColorVar.White);
            SideGUI.CircleRbtn.setForeground(ColorVar.White);
            SideGUI.OpenQuad.setBackground(ColorVar.White);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalettePanel Changes
            Application.colorPalettePanel.setBackground(ColorVar.Misty_blue);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(ColorVar.Black, 4));
            ColorPalettePanel.openColorChooser.setForeground(ColorVar.White);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(ColorVar.Variety_Aqua_Navy_Blue);


        }

        if (chooseThemeComboBox.getSelectedItem() == themes[3]) {

            //change to Variety Theme - Archy

            //BottomGUI
            Application.bottomPanel.setBackground(ColorVar.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 1));
            BottomGUI.calculateAreaButton.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.calculatePCBtn.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 1));
            BottomGUI.calculatePCBtn.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.DimensionPanel.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_BLACK, 2));
            BottomGUI.LengthPanel.setBackground(ColorVar.Variety_Deep_Gray);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 2));
            BottomGUI.WidthPanel.setBackground(ColorVar.Variety_Deep_Gray);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 2));
            BottomGUI.CalPanel.setBackground(ColorVar.Variety_BLACK);
            BottomGUI.lengthlbl.setBackground(ColorVar.Variety_Misty_Gray);
            BottomGUI.lengthlbl.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(ColorVar.Variety_WHITE);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(ColorVar.Variety_Deep_Red);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_BLACK, 2));
            BottomGUI.CalcPCPanel.setBackground(ColorVar.Variety_BLUE);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_BLACK, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(ColorVar.Variety_Deep_Red);
            BottomGUI.un2Label.setForeground(ColorVar.Variety_Deep_Red);
            BottomGUI.clearButton.setForeground(ColorVar.Variety_BLACK);
            BottomGUI.clearButton.setBackground(ColorVar.Variety_WHITE);

            //Side GUI
            Application.sidePanel.setBackground(ColorVar.Variety_Misty_Gray);
            SideGUI.Squarebutton.setBackground(ColorVar.Variety_Pink);
            SideGUI.Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Squarebutton.setForeground(ColorVar.Variety_BLACK);
            SideGUI.Trianglebutton.setBackground(ColorVar.Variety_Pink);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(ColorVar.Variety_BLACK);
            SideGUI.Rectanglebutton.setBackground(ColorVar.Variety_Pink);
            SideGUI.Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Rectanglebutton.setForeground(ColorVar.Variety_BLACK);
            SideGUI.CircleButton.setBackground(ColorVar.Variety_Pink);
            SideGUI.CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.CircleButton.setForeground(ColorVar.Variety_BLACK);
            SideGUI.CalculatorButton.setBackground(ColorVar.Variety_Deep_Magenta);
            SideGUI.CalculatorButton.setForeground(ColorVar.Variety_WHITE);
            SideGUI.formulaPanel.setBackground(ColorVar.Variety_Bottle_Green);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_WHITE, 2));
            SideGUI.TriangleRbtn.setBackground(ColorVar.Variety_BLACK);
            SideGUI.TriangleRbtn.setForeground(ColorVar.Variety_WHITE);
            SideGUI.CircleRbtn.setBackground(ColorVar.Variety_BLACK);
            SideGUI.CircleRbtn.setForeground(ColorVar.Variety_WHITE);
            SideGUI.OpenQuad.setBackground(ColorVar.Variety_WHITE);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(ColorVar.Variety_Beige);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(ColorVar.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(ColorVar.Variety_Aqua_Navy_Blue);


        }

        if(chooseThemeComboBox.getSelectedItem() == themes[4]) {
            Application.bottomPanel.setBackground(ColorVar.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(ColorVar.Mimosa);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(ColorVar.Sunset_Gray, 1));
            BottomGUI.calculateAreaButton.setForeground(ColorVar.Sunset_Gray);
            BottomGUI.calculatePCBtn.setBackground(ColorVar.Mimosa);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(ColorVar.Sunset_Gray, 1));
            BottomGUI.calculatePCBtn.setForeground(ColorVar.Sunset_Gray);
            BottomGUI.DimensionPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.CalPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.lengthlbl.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.lengthlbl.setForeground(ColorVar.White);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(ColorVar.White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(ColorVar.Sunset_Gray);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Sunset_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(ColorVar.Sunset_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(ColorVar.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(ColorVar.Sunset_Gray);
            BottomGUI.un2Label.setForeground(ColorVar.Sunset_Gray);
            BottomGUI.clearButton.setForeground(ColorVar.Sunset_Gray);
            BottomGUI.clearButton.setBackground(ColorVar.Mimosa);

            //SideGUI
            Application.sidePanel.setBackground(ColorVar.Sunset_Gray);
            SideGUI.Squarebutton.setBackground(ColorVar.Mimosa);
            SideGUI.Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Squarebutton.setForeground(ColorVar.Black);
            SideGUI.Trianglebutton.setBackground(ColorVar.Mimosa);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(ColorVar.Black);
            SideGUI.Rectanglebutton.setBackground(ColorVar.Mimosa);
            SideGUI.Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Rectanglebutton.setForeground(ColorVar.Black);
            SideGUI.CircleButton.setBackground(ColorVar.Mimosa);
            SideGUI.CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.CircleButton.setForeground(ColorVar.Black);
            SideGUI.CalculatorButton.setBackground(ColorVar.Mimosa);
            SideGUI.CalculatorButton.setForeground(ColorVar.Black);
            SideGUI.formulaPanel.setBackground(ColorVar.Sunset_Gray);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(ColorVar.White, 2));
            SideGUI.TriangleRbtn.setBackground(ColorVar.White);
            SideGUI.TriangleRbtn.setForeground(ColorVar.White);
            SideGUI.CircleRbtn.setBackground(ColorVar.White);
            SideGUI.CircleRbtn.setForeground(ColorVar.White);
            SideGUI.OpenQuad.setBackground(ColorVar.White);
            SideGUI.OpenQuad.setForeground(ColorVar.White);

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(ColorVar.Sunset_Gray);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(ColorVar.Midnight_White, 4));
            ColorPalettePanel.openColorChooser.setForeground(ColorVar.Black);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(ColorVar.Mimosa);
        }
    }
}
