package src;

import src.FlatButton;
import src.FrameSystem;

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
    private static JPanel BottomPanel;
    private static FrameSystem Window;
   // private static JTextField lengthInputfld;


    public static void main(String[] args) {
        Window = new FrameSystem();
        SidePanel = new JPanel();
        BottomPanel = new JPanel();
        //lengthInputfld = new JTextField(1);

        SidePanel.setBounds(0, 0, 50, 650);
        SidePanel.setBackground(new Color(28, 27, 27));
        SidePanel.setSize(250, 700);
        Border redLine= BorderFactory.createLineBorder(new Color(144, 16, 16));
        SidePanel.setBorder(redLine);
        Window.add(SidePanel);

        BottomPanel.setBounds(200, 500, 600, 100);
        BottomPanel.setBackground(new Color(28, 27, 27));
        BottomPanel.setSize(600, 200);
        BottomPanel.setBorder(redLine);
        Window.add(BottomPanel);

        //textFieldSystemInput();
    }
    /*
    public static void textFieldSystemInput(){
        lengthInputfld.setBounds(50,20,25,25);
        BottomPanel.add(lengthInputfld);
    }

     */



    // do not remove this method
    @Override
    public void actionPerformed(ActionEvent e) {

    }




}
