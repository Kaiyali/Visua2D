package src.GUI;

import com.sun.glass.ui.Clipboard;
import com.sun.scenario.Settings;
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
    private static JPanel SettingPanel;
    private static JPanel DimensionPanel;


    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication(){
        Window = new FrameSystem();
        setSidePanel();
        setLengthlbl();
        setWidthlbl();
        setClearButtonSystem();
    }
    //SidePanel
    public static void setSidePanel(){
        SidePanel = new JPanel();
        SidePanel.setBackground(new Color(51, 51, 51));
        SidePanel.setPreferredSize(new Dimension(225, 800));
        Window.add(SidePanel,BorderLayout.WEST);
        setBottomPanel();
    }
    //BottomPanel
    public static void setBottomPanel(){
        BottomPanel = new JPanel();
        BottomPanel.setBackground(new Color(51, 51, 51));
        BottomPanel.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        BottomPanel.setBorder(redLine);
        BottomPanel.setLayout(new BorderLayout()); // here is where the layout was set
        Window.add(BottomPanel,BorderLayout.SOUTH);
        setColorPanel();
    }

    // ColorPalette
    public static void setColorPanel(){
        ColorPanel = new JPanel();
        ColorPanel.setBackground(new Color(50, 48, 48));
        ColorPanel.setPreferredSize(new Dimension(225, 200));
        BottomPanel.add(ColorPanel);
        BottomPanel.add(ColorPanel, BorderLayout.WEST);
        setSettingPanel();
    }
    public static void setSettingPanel(){
        SettingPanel = new JPanel();
        SettingPanel.setBackground(new Color(51, 51, 51));
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));
        BottomPanel.add(SettingPanel);
        BottomPanel.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();

    }
    public static void setDimensionPanel(){
        DimensionPanel = new JPanel();
        DimensionPanel.setBackground(new Color(51, 51, 51));
        DimensionPanel.setLayout(new GridBagLayout());
        SettingPanel.add(DimensionPanel);
        setCalPanel();

    }
    public static void setCalPanel(){
        JPanel CalPanel= new JPanel();
        CalPanel.setBackground(new Color(0, 62, 255));
        CalPanel.setLayout(new GridLayout(2,2));
        SettingPanel.add(CalPanel);

    }
    public static void setLengthlbl(){
        JLabel lengthlbl = new JLabel();
        GridBagConstraints c1 = new GridBagConstraints();
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        c1.gridx=0;c1.gridy=0;DimensionPanel.add(lengthlbl, c1);
        setLengthInputfld();

    }

    public static void setLengthInputfld(){
        JTextField lengthInputfld = new JTextField(1);
        lengthInputfld.setBounds(400, 550, 25, 25);
        DimensionPanel.add(lengthInputfld);

    }
    public static void setWidthlbl(){
        JLabel widthlbl = new JLabel();
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        widthlbl.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0),2,true));
        DimensionPanel.add(widthlbl);
        setWidthInputfld();
    }
    public static void setWidthInputfld(){
        JTextField widthInputfld = new JTextField(1);
        widthInputfld.setBounds(400, 600, 25, 25);
        DimensionPanel.add(widthInputfld); // changed
    }



    public static void setClearButtonSystem(){
        ClearButton buttonSystem = new ClearButton();
        buttonSystem.setBounds(0,50,50,50); // working on
        SidePanel.add(buttonSystem);
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





