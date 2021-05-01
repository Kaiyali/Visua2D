package com.company;
import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: Master 2D Calculator
 * Author: ARCHISMAN NATH on 5/1/2021 in 12:08 PM
 */
public class Main {
    private static JPanel blackPanel;
    private static FrameSystem GalleryFrame;
    private static Flatbutton OpenFolderbtn;


    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\IdeaProjects\\" +
                "Aurora\\src\\Aurora_Gallery.jpg");
        /*
        BufferImage Understanding:
        Image.SCALE_DEFAULT: Use the default image-scaling algorithm.
        Image.SCALE_FAST: Choose an image-scaling algorithm that gives higher priority to scaling
        speed than smoothness of the scaled image.
        Image.SCALE_SMOOTH: Choose an image-scaling algorithm that gives higher priority to image
        smoothness than scaling speed.
        Image.SCALE_AREA_AVERAGING: Use the Area Averaging image scaling algorithm.
        Image.SCALE_REPLICATE: Use the image scaling algorithm embodied in the ReplicateScaleFilter class.
         */

        GalleryFrame = new FrameSystem();

        blackPanel = new JPanel();
        blackPanel.setBounds(0, 0, 50, 650);
        blackPanel.setBackground(new Color(28, 27, 27));
        blackPanel.setSize(250, 700);
        GalleryFrame.add(blackPanel);


        JLabel Capture = new JLabel(icon);
        Capture.setBounds(600,200,600,200);
        Capture.setLocation(-175,-75); //moving of the image
        blackPanel.add(Capture);

        ButtonOpenFolder();
    }

    public static void ButtonOpenFolder(){
        OpenFolderbtn = new Flatbutton();
        OpenFolderbtn.setBounds(105, 30, 105, 30);
        OpenFolderbtn.setLocation(500,500);
        OpenFolderbtn.setPreferredSize(new Dimension(30,22));
        OpenFolderbtn.setText("Open Folder");
        GalleryFrame.add(OpenFolderbtn);
    }


}
