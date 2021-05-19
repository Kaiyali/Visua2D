package GeoMath2D.GUI.Base.SystemSetup;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class BottomGUI extends JPanel {


    public final JPanel SettingPanel = new JPanel();
    public final JPanel DimensionPanel = new JPanel();
    public final JPanel CalPanel = new JPanel();
    public final JPanel LengthPanel = new JPanel();
    public final JPanel WidthPanel = new JPanel();

    private final JTextField calculateAreaTxt = new JTextField();
    private final JTextField calculatePCTxt = new JTextField();

    private final JButton[] calcButtons = {new JButton("Calculate Area"), new JButton("Calculate P/C")};


    //------------------------------------------------------

    public BottomGUI() {

        this.setBackground(new Color(51, 51, 51));
        this.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        this.setBorder(redLine);
        this.setLayout(new BorderLayout()); // here is where the layout was set

        setSettingPanel();
    }


    public void setSettingPanel(){
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));

        this.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();

    }

    public void setDimensionPanel(){
        DimensionPanel.setBackground(new Color(0, 0, 0));
        DimensionPanel.setLayout(new GridLayout(2,1, 5,5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        SettingPanel.add(DimensionPanel);
        setLengthlbl();
        setWidthlbl();
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





    //------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------




    //BOTTOM PANEL GUI LABELS AND INPUT FIELDS
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






    //--------------------------------------------------------------------------------------

    //SIDE PANEL SETUP


    //this are filler for the images that will be added to the buttons




    //------------------------------------------------------------------------------------




    //BUTTONS SETUP FOR CALCULATIONS
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
}
