package src;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH and DANIEL KAIYALI on 5/1/2021 in 12:08 PM
 */
public class Main {
    private static JPanel SidePanel;
    private static FrameSystem Window;
    private static FlatButton OpenFolderbtn;


    public static void main(String[] args) {


        Window = new FrameSystem();

        SidePanel = new JPanel();
        SidePanel.setBounds(0, 0, 50, 650);
        SidePanel.setBackground(new Color(28, 27, 27));
        SidePanel.setSize(250, 700);
        Window.add(SidePanel);
        Border redLine= BorderFactory.createLineBorder(new Color(144, 16, 16));
        SidePanel.setBorder(redLine);

        ButtonOpenFolder();
    }

    public static void ButtonOpenFolder(){
        OpenFolderbtn = new FlatButton();
        OpenFolderbtn.setBounds(105, 30, 105, 30);
        OpenFolderbtn.setLocation(500,500);
        OpenFolderbtn.setPreferredSize(new Dimension(30,22));
        OpenFolderbtn.setText("Open Folder");
        Window.add(OpenFolderbtn);
    }


}
