package src.GUI;

import src.GUI.FrameSystem;

import javax.swing.*;
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
    private static JPanel SidePanel;
    public static JPanel BottomPanel;
    public static JPanel ColorPanel;
    private static FrameSystem Window;
    private static JTextField lengthInputfld;
    private static JTextField widthInputfld;
    private static JLabel lengthlbl;
    private static JLabel widthlbl;
    private static ClearButton ButtonSystem;





    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication(){
        Window = new FrameSystem();
        setSidePanel();
        setLengthInputfld();
        setLengthlbl();
        setClearButtonSystem();
    }
    public static void setSidePanel(){
        SidePanel = new JPanel();
        SidePanel.setBackground(new Color(51, 51, 51));
        SidePanel.setPreferredSize(new Dimension(225, 800));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        SidePanel.setBorder(redLine);
        Window.add(SidePanel,BorderLayout.WEST);
        setBottomPanel();
    }

    public static void setBottomPanel(){
        BottomPanel = new JPanel();
        BottomPanel.setBackground(new Color(51, 51, 51));
        BottomPanel.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        BottomPanel.setBorder(redLine);
        BottomPanel.setLayout(new GridBagLayout()); // here is where the layout was set
        Window.add(BottomPanel,BorderLayout.SOUTH);
        setColorPanel();
    }
    public static void setColorPanel(){
        ColorPanel = new JPanel();
        ColorPanel.setBackground(new Color(217, 23, 23));
        ColorPanel.setPreferredSize(new Dimension(225, 200));
        BottomPanel.add(ColorPanel);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        BottomPanel.add(ColorPanel, gbc);
    }
    public static void setLengthInputfld(){
        lengthInputfld = new JTextField(1);
        lengthInputfld.setBounds(400, 550, 25, 25);
        BottomPanel.add(lengthInputfld);
        setWidthInputfld();
    }
    public static void setWidthInputfld(){
        widthInputfld = new JTextField(1);
        widthInputfld.setBounds(400, 600, 25, 25);
        BottomPanel.add(widthInputfld); // changed
    }
    public static void setLengthlbl(){
        lengthlbl = new JLabel();
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        BottomPanel.add(lengthlbl);
        setWidthlbl();
    }
    public static void setWidthlbl(){
        widthlbl = new JLabel();
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        BottomPanel.add(widthlbl);
    }
    public static void setClearButtonSystem(){
        ButtonSystem = new ClearButton();
        ButtonSystem.setBounds(0,10,50,50); // working on
        SidePanel.add(ButtonSystem);
        finalStatement();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // do not remove this method
    }
    public static void finalStatement(){
        Window.setVisible(true);
    }



}





