package GeoMath2D.GUI.Base.SystemSetup;

import GeoMath2D.GUI.Base.Assets.ClearButton;

import javax.swing.*;
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
        Squarebutton.setBackground(new Color(36, 201, 176));
        Squarebutton.setText("Square");
        this.add(Squarebutton);
        setCircleButton();
        setRectangleButton();
        setTriangleButton();
        setCalulatorFrame();
    }

    public void setTriangleButton(){
        ClearButton Trianglebutton = new ClearButton();
        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(new Color(36, 201, 176));
        Trianglebutton.setText("Triangle");
        this.add(Trianglebutton);
    }

    public void setRectangleButton(){
        ClearButton Rectanglebutton = new ClearButton();
        Rectanglebutton.setPreferredSize(new Dimension(150,50));
        Rectanglebutton.setBackground(new Color(36, 201, 176));
        Rectanglebutton.setText("Rectangle");
        this.add(Rectanglebutton);

    }

    public void setCircleButton(){
        ClearButton CircleButton = new ClearButton();
        CircleButton.setPreferredSize(new Dimension(150,50));
        CircleButton.setBackground(new Color(36, 201, 176));
        CircleButton.setText("Circle");
        this.add(CircleButton);
    }

    public void setCalulatorFrame(){
        CalculatorButton.setPreferredSize(new Dimension(150,50));
        CalculatorButton.setBackground(new Color(229, 11, 50));
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
