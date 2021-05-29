package Aegean2DMath.GUI.Base.SystemSetup;

import Aegean2DMath.GUI.Base.Assets.ClearButton;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class SideGUI extends JPanel implements ActionListener {


    private final JButton CalculatorButton = new ClearButton();

    public SideGUI() {
        this.setBackground(new Color(51, 51, 51));
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(new FlowLayout());
        setSquareButton();
    }

    public void setSquareButton(){
        ClearButton Squarebutton = new ClearButton();
        Squarebutton.setPreferredSize(new Dimension(150,50));
        Squarebutton.setBackground(new Color(255, 181, 181, 255));
        Squarebutton.setText("SQUARE");
        Squarebutton.setFont(new Font("Segoe UI", Font.BOLD + Font.ITALIC, 22));
        Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Squarebutton);
        setCircleButton();
        setRectangleButton();
        setTriangleButton();
        setCalulatorFrame();
    }



    public void setTriangleButton(){
        ClearButton Trianglebutton = new ClearButton();
        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(new Color(255, 181, 181, 255));
        Trianglebutton.setText("TRIANGLE");
        Trianglebutton.setFont(new Font("Segoe UI", Font.BOLD + Font.ITALIC, 22));
        Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Trianglebutton);
    }

    public void setRectangleButton(){
        ClearButton Rectanglebutton = new ClearButton();
        Rectanglebutton.setPreferredSize(new Dimension(150,50));
        Rectanglebutton.setBackground(new Color(255, 181, 181, 255));
        Rectanglebutton.setText("RECTANGLE");
        Rectanglebutton.setFont(new Font("Segoe UI", Font.BOLD + Font.ITALIC, 22));
        Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Rectanglebutton);

    }

    public void setCircleButton(){
        ClearButton CircleButton = new ClearButton();
        CircleButton.setPreferredSize(new Dimension(150,50));
        CircleButton.setBackground(new Color(255, 181, 181, 255));
        CircleButton.setText("SQUARE");
        CircleButton.setFont(new Font("Segoe UI", Font.BOLD + Font.ITALIC, 22));
        CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(CircleButton);
    }

    public void setCalulatorFrame(){
        CalculatorButton.setPreferredSize(new Dimension(150,50));
        CalculatorButton.setBackground(new Color(234, 232, 6));
        CalculatorButton.setFont(new Font("Segoe UI", Font.BOLD + Font.ITALIC, 22));
        CalculatorButton.setFocusable(false);
        CalculatorButton.addActionListener(this);
        CalculatorButton.setText("Calculator");
        this.add(CalculatorButton);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CalculatorButton) {
            BaseCalc calc = new BaseCalc();
            calc.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }

    public void changeColor(ActionEvent e){

    }

}
