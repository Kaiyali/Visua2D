package src.GUI;

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
        Window.add(SidePanel,BorderLayout.WEST);
        setBottomPanel();
    }

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
        SettingPanel.setLayout(new GridBagLayout());
        BottomPanel.add(SettingPanel);
        BottomPanel.add(SettingPanel, BorderLayout.CENTER);


    }


    public static void setLengthInputfld(){
        JTextField lengthInputfld = new JTextField(1);
        lengthInputfld.setBounds(400, 550, 25, 25);
        SettingPanel.add(lengthInputfld);
        setWidthInputfld();
    }
    public static void setWidthInputfld(){
        JTextField widthInputfld = new JTextField(1);
        widthInputfld.setBounds(400, 600, 25, 25);
        SettingPanel.add(widthInputfld); // changed
    }
    public static void setLengthlbl(){
        JLabel lengthlbl = new JLabel();
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        SettingPanel.add(lengthlbl);
        setWidthlbl();
    }
    public static void setWidthlbl(){
        JLabel widthlbl = new JLabel();
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Cooper Black", Font.PLAIN,20));
        SettingPanel.add(widthlbl);
    }

    public static void setClearButtonSystem(){
        ClearButton buttonSystem = new ClearButton();
        buttonSystem.setBounds(0,10,50,50); // working on
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





