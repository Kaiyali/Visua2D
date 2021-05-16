package com.GUI;

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
public class Run implements ActionListener {

    private final JPanel SidePanel = new JPanel();
    public JPanel BottomPanel = new JPanel();
    public JPanel ColorPanel = new JPanel();
    private final FrameSystem Window = new FrameSystem();
    private final JPanel SettingPanel = new JPanel();
    private final JPanel DimensionPanel = new JPanel();
    private final JPanel CalPanel= new JPanel();
    private final JTextField calculateAreaTxt = new JTextField();
    private final JTextField calculatePCTxt = new JTextField();
    private final JButton[] calcButtons = {new JButton("Calculate Area"), new JButton("Calculate P/C")};


    public static void main(String[] args) {
        Run run = new Run();
        run.runApplication();
    }

    public void runApplication(){
        setSidePanel();
        setLengthlbl();
        setWidthlbl();
        setClearButtonSystem();
    }

    public void setSidePanel(){
        SidePanel.setBackground(new Color(51, 51, 51));
        SidePanel.setPreferredSize(new Dimension(225, 800));
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
        BottomPanel.add(ColorPanel);
        BottomPanel.add(ColorPanel, BorderLayout.WEST);
        setSettingPanel();
    }

    public void setSettingPanel(){
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));
        BottomPanel.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();

    }

    public void setDimensionPanel(){
        DimensionPanel.setBackground(new Color(227, 20, 20));
        DimensionPanel.setLayout(new GridLayout(2,2, 5,5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        SettingPanel.add(DimensionPanel);
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
        lengthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,40));
        lengthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        lengthlbl.setVerticalAlignment(SwingConstants.CENTER);
        DimensionPanel.add(lengthlbl);
        setLengthInputfld();

    }
    public void setLengthInputfld(){
        JTextField lengthInputfld = new JTextField(1);
        lengthInputfld.setBounds(400, 550, 25, 25);
        DimensionPanel.add(lengthInputfld);
    }
    public void setWidthlbl(){
        JLabel widthlbl = new JLabel();
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,40));
        widthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        widthlbl.setVerticalAlignment(SwingConstants.CENTER);
        DimensionPanel.add(widthlbl);
        setWidthInputfld();
    }
    public void setWidthInputfld(){
        JTextField widthInputfld = new JTextField(1);
        widthInputfld.setBounds(400, 600, 25, 25);
        DimensionPanel.add(widthInputfld); // changed
    }

    public void setClearButtonSystem(){
        ClearButton buttonSystem = new ClearButton();
        buttonSystem.setBounds(0,10,50,50); // working on
        SidePanel.add(buttonSystem);
        finalStatement();
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
