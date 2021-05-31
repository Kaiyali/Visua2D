package Aegean2DMath.GUI.Base.SystemSetup;

import Aegean2DMath.GUI.Base.Assets.ClearButton;
import Aegean2DMath.GUI.BaseShape.BaseCircle;
import Aegean2DMath.GUI.BaseShape.BaseTriangle;


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
    private final ClearButton CircleButton = new ClearButton();
    private final ClearButton Squarebutton = new ClearButton();
    private final ClearButton Trianglebutton = new ClearButton();
    private final ClearButton Rectanglebutton = new ClearButton();
    private final JPanel formulaPanel = new JPanel();
    private final JRadioButton TriangleRbtn=new JRadioButton("Triangle");
    private final JRadioButton CircleRbtn=new JRadioButton("Circle");
    private final Font SidePanelFont = new Font("Segoe UI", Font.BOLD, 22);

    //this allows to select one radio button and deselect the other
    //or else we would select two of them and the code would be messed up - check bro codes video
    //on radio buttons
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public SideGUI() {
        this.setBackground(new Color(62, 62, 62));
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(new FlowLayout());
        setSquareButton();
    }

    public void setSquareButton(){

        Squarebutton.setPreferredSize(new Dimension(150,50));
        Squarebutton.setBackground(new Color(255, 181, 181, 255));
        Squarebutton.setText("SQUARE");
        Squarebutton.setFont(SidePanelFont);
        Squarebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Squarebutton);
        setCircleButton();
        setRectangleButton();
        setTriangleButton();
        setCalulatorFrame();
    }

    public void setTriangleButton(){

        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(new Color(255, 181, 181, 255));
        Trianglebutton.setText("TRIANGLE");
        Trianglebutton.setFont(SidePanelFont);
        Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Trianglebutton);
    }

    public void setRectangleButton(){

        Rectanglebutton.setPreferredSize(new Dimension(150,50));
        Rectanglebutton.setBackground(new Color(255, 181, 181, 255));
        Rectanglebutton.setText("RECTANGLE");
        Rectanglebutton.setFont(SidePanelFont);
        Rectanglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(Rectanglebutton);

    }

    public void setCircleButton(){

        CircleButton.setPreferredSize(new Dimension(150,50));
        CircleButton.setBackground(new Color(255, 181, 181, 255));
        CircleButton.setText("CIRCLE");
        CircleButton.setFont(SidePanelFont);
        CircleButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(CircleButton);
    }

    public void setCalulatorFrame(){
        CalculatorButton.setPreferredSize(new Dimension(150,50));
        CalculatorButton.setBackground(new Color(234, 232, 6));
        CalculatorButton.setFont(SidePanelFont);
        CalculatorButton.setFocusable(false);
        CalculatorButton.addActionListener(this);
        CalculatorButton.setText("Calculator");
        this.add(CalculatorButton);
        setFormulaPanel();
    }

    public void setFormulaPanel(){
        formulaPanel.setBackground(new Color(211, 52, 197));
        formulaPanel.setPreferredSize(new Dimension(200, 225));
        formulaPanel.setLayout(new FlowLayout());
        formulaPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        this.add(formulaPanel);
        setOptionsRadioBtn();

    }

    public void setOptionsRadioBtn(){
        TriangleRbtn.setPreferredSize(new Dimension(150,50));
        TriangleRbtn.setBackground(new Color(0,0,0));
        TriangleRbtn.setForeground(new Color(0, 0, 0));
        TriangleRbtn.setFont(SidePanelFont);
        TriangleRbtn.setFocusable(false);
        TriangleRbtn.setContentAreaFilled(false);
        TriangleRbtn.addActionListener(this);
        formulaPanel.add(TriangleRbtn);

        CircleRbtn.setPreferredSize(new Dimension(150,50));
        CircleRbtn.setBackground(new Color(0,0,0));
        CircleRbtn.setForeground(new Color(0, 0, 0));
        CircleRbtn.setFont(SidePanelFont);
        CircleRbtn.setFocusable(false);
        CircleRbtn.setContentAreaFilled(false);
        CircleRbtn.addActionListener(this);
        formulaPanel.add(CircleRbtn);

        buttonGroup.add(TriangleRbtn);
        buttonGroup.add(CircleRbtn);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == CalculatorButton) {
            BaseCalc calc = new BaseCalc();
            calc.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if (CircleRbtn.isSelected()){
            BaseCircle circle = new BaseCircle();
            circle.Circleframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(TriangleRbtn.isSelected()){
            BaseTriangle triangle = new BaseTriangle();
            triangle.Triangleframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }
}