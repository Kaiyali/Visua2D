package src.GUI;

import src.GUI.ClearButton;
import src.GUI.FrameSystem;
import src.Shapes.Triangle;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH and DANIEL KAIYALI on 5/1/2021 in 12:08 PM
 */
public class Main implements ActionListener {

    private final JPanel SidePanel = new JPanel();
    public JPanel BottomPanel = new JPanel();
    public JPanel ColorPanel = new JPanel();
    private final FrameSystem Window = new FrameSystem();
    private final JPanel SettingPanel = new JPanel();
    private final JPanel DimensionPanel = new JPanel();
    private final JPanel CalPanel = new JPanel();
    private final JPanel LengthPanel = new JPanel();
    private final JPanel WidthPanel = new JPanel();
    private final JTextField calculateAreaTxt = new JTextField();
    private final JTextField calculatePCTxt = new JTextField();
    private final JButton[] calcButtons = {new JButton("Calculate Area"), new JButton("Calculate P/C")};



    public static void main(String[] args) {
        Main run = new Main();
        run.runApplication();
    }

    public void runApplication(){
        setSidePanel();
        setLengthlbl();
        setWidthlbl();
        setSquareButton();
    }

    public void setSidePanel(){
        SidePanel.setBackground(new Color(51, 51, 51));
        SidePanel.setPreferredSize(new Dimension(225, 800));
        SidePanel.setLayout(new FlowLayout());
        Window.add(SidePanel,BorderLayout.WEST);
        setBottomPanel();
    }

    public void setBottomPanel(){
        BottomPanel.setBackground(new Color(51, 51, 51));
        BottomPanel.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        BottomPanel.setBorder(redLine);
        BottomPanel.setLayout(new BorderLayout()); // here is where the layout was set
        Window.add(BottomPanel,BorderLayout.SOUTH);
        setColorPanel();
    }

    public void setColorPanel(){
        ColorPanel.setBackground(new Color(50, 48, 48));
        ColorPanel.setPreferredSize(new Dimension(225, 200));
        ColorPanel.setLayout(new FlowLayout());
        BottomPanel.add(ColorPanel);
        BottomPanel.add(ColorPanel, BorderLayout.WEST);
        setColorSetting();
    }

    public void setColorSetting(){
        ClearButton buttonRed = new ClearButton();
        ClearButton buttonYellow = new ClearButton();
        ClearButton buttonGreen = new ClearButton();
        ClearButton buttonPurple = new ClearButton();
        ClearButton buttonBlue = new ClearButton();
        ClearButton buttonPink = new ClearButton();
        ClearButton buttonLightBlue = new ClearButton();
        ClearButton buttonOrange = new ClearButton();
        ClearButton buttonWhite = new ClearButton();
        ClearButton buttonBitterSweet = new ClearButton();
        ClearButton buttonLavender = new ClearButton();
        ClearButton buttonRose = new ClearButton();

        buttonRed.setBackground(new Color(213, 27, 27));
        buttonRed.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonRed);

        buttonWhite.setBackground(new Color(255, 255, 255));
        buttonWhite.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonWhite);

        buttonYellow.setBackground(new Color(255, 229, 0));
        buttonYellow.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonYellow);

        buttonLightBlue.setBackground(new Color(25, 212, 168));
        buttonLightBlue.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonLightBlue);

        buttonOrange.setBackground(new Color(220, 129, 14));
        buttonOrange.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonOrange);

        buttonPink.setBackground(new Color(255, 0, 186));
        buttonPink.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonPink);

        buttonBlue.setBackground(new Color(32, 99, 206));
        buttonBlue.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonBlue);

        buttonPurple.setBackground(new Color(148, 9, 234));
        buttonPurple.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonPurple);

        buttonGreen.setBackground(new Color(112, 217, 30));
        buttonGreen.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonGreen);

        buttonBitterSweet.setBackground(new Color(254, 111, 94));
        buttonBitterSweet.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonBitterSweet);

        buttonLavender.setBackground(new Color(244, 187, 255));
        buttonLavender.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonLavender);

        buttonRose.setBackground(new Color(255, 85, 163));
        buttonRose.setPreferredSize(new Dimension(50,50));
        ColorPanel.add(buttonRose);
        setSettingPanel();
    }

    public void setSettingPanel(){
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));

        BottomPanel.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();

    }

    public void setDimensionPanel(){
        DimensionPanel.setBackground(new Color(0, 0, 0));
        DimensionPanel.setLayout(new GridLayout(2,1, 5,5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        SettingPanel.add(DimensionPanel);
        setLengthPanel();
    }

    public void setLengthPanel(){
        LengthPanel.setBackground(new Color(0, 0, 0));
        LengthPanel.setLayout(new FlowLayout());
        LengthPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        DimensionPanel.add(LengthPanel);
        setWidthPanel();
    }

    public void setWidthPanel(){
        WidthPanel.setBackground(new Color(0, 0, 0));
        WidthPanel.setLayout(new FlowLayout());
        WidthPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        DimensionPanel.add(WidthPanel);
        setCalPanel();
    }

    public void setCalPanel(){
        CalPanel.setBackground(Color.black.brighter());
        CalPanel.setLayout(new GridLayout(2,2, 2, 2));
        SettingPanel.add(CalPanel);
        addCalcAreaBtn();
    }

    public void setLengthlbl(){
        JLabel lengthlbl = new JLabel();
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setBackground(Color.BLACK);
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Asap", Font.PLAIN,32));
        lengthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        lengthlbl.setVerticalAlignment(SwingConstants.CENTER);
        LengthPanel.add(lengthlbl);
        setLengthInputfld();
    }
    public void setLengthInputfld(){
        JTextField lengthInputfld = new JTextField();
        lengthInputfld.setPreferredSize(new Dimension(250,40));
        lengthInputfld.setBorder(BorderFactory.createLineBorder(new Color(201, 197, 197),1));
        lengthInputfld.setFont(new Font("Consoles",Font.PLAIN,32));
        lengthInputfld.setCaretColor(new Color(5, 153, 179));
        LengthPanel.add(lengthInputfld);
    }
    public void setWidthlbl(){
        JLabel widthlbl = new JLabel();
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Asap", Font.PLAIN,32));
        widthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        widthlbl.setVerticalAlignment(SwingConstants.CENTER);
        WidthPanel.add(widthlbl);
        setWidthInputfld();
    }
    public void setWidthInputfld(){
        JTextField widthInputfld = new JTextField();
        widthInputfld.setPreferredSize(new Dimension(250,40));
        widthInputfld.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0),1));
        widthInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        widthInputfld.setCaretColor(new Color(5, 153, 179));
        WidthPanel.add(widthInputfld); // changed
    }


    //this are filler for the images that will be added to the buttons
    public void setSquareButton(){
        ClearButton Squarebutton = new ClearButton();
        Squarebutton.setPreferredSize(new Dimension(150,50));
        Squarebutton.setBackground(new Color(36, 201, 176));
        Squarebutton.setText("Square");
        SidePanel.add(Squarebutton);
        setCircleButton();
        setRectangleButton();
        setTriangleButton();
        finalStatement();
    }

    public void setTriangleButton(){
        ClearButton Trianglebutton = new ClearButton();
        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(new Color(36, 201, 176));
        Trianglebutton.setText("Triangle");
        SidePanel.add(Trianglebutton);
    }

    public void setRectangleButton(){
        ClearButton Rectanglebutton = new ClearButton();
        Rectanglebutton.setPreferredSize(new Dimension(150,50));
        Rectanglebutton.setBackground(new Color(36, 201, 176));
        Rectanglebutton.setText("Rectangle");
        SidePanel.add(Rectanglebutton);

    }

    public void setCircleButton(){
        ClearButton CircleButton = new ClearButton();
        CircleButton.setPreferredSize(new Dimension(150,50));
        CircleButton.setBackground(new Color(36, 201, 176));
        CircleButton.setText("Circle");
        SidePanel.add(CircleButton);
    }

    public void addCalcAreaBtn() {
        calcButtons[0].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        calcButtons[0].setFont(new Font("Cooper Black", Font.BOLD, 30));
        calcButtons[0].setHorizontalAlignment(SwingConstants.CENTER);
        calcButtons[0].setVerticalAlignment(SwingConstants.CENTER);
        calcButtons[0].setFocusPainted(false);
        calcButtons[0].setBorderPainted(true);

        CalPanel.add(calcButtons[0]);
        addCalcAreaTxtFld();
        addCalcPC();
        calcPCTxtFld();
    }

    public void addCalcPC() {
        calcButtons[1].setBorder(BorderFactory.createLineBorder(Color.BLACK));
        calcButtons[1].setVerticalAlignment(SwingConstants.CENTER);
        calcButtons[1].setHorizontalAlignment(SwingConstants.CENTER);
        calcButtons[1].setFocusPainted(false);
        calcButtons[1].setBorderPainted(true);
        calcButtons[1].setFont(new Font("Cooper Black", Font.BOLD, 30));
        CalPanel.add(calcButtons[1]);
    }

    public void addCalcAreaTxtFld() {
        calculateAreaTxt.setEditable(false);
        calculateAreaTxt.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        CalPanel.add(calculateAreaTxt);
    }

    public void calcPCTxtFld() {
        calculatePCTxt.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        calculatePCTxt.setEditable(false);
        CalPanel.add(calculatePCTxt);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // do not remove this method
    }
    public void finalStatement(){
        Window.setVisible(true);
    }

}





