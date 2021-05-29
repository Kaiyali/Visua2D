package Aegean2DMath.GUI.Base.SystemSetup;

import Aegean2DMath.GUI.Base.Assets.ClearButton;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class BottomGUI extends JPanel  {


    public final JPanel SettingPanel = new JPanel();
    public final JPanel DimensionPanel = new JPanel();
    public final JPanel CalPanel = new JPanel();
    public final JPanel LengthPanel = new JPanel();
    public final JPanel WidthPanel = new JPanel();
    public final JPanel CalcAreaPanel = new JPanel();
    public final JPanel CalcPCPanel = new JPanel();

    public final ClearButton  calculatePCBtn = new ClearButton();

    public JTextField PCInputfld = new JTextField();
    public JLabel lengthlbl = new JLabel();
    public JLabel widthlbl = new JLabel();


    public final ClearButton calculateAreaButton = new ClearButton();







    //------------------------------------------------------

    public BottomGUI() {

        this.setBackground(new Color(0, 0, 0));
        this.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        this.setBorder(redLine);
        this.setLayout(new BorderLayout()); // here is where the layout was set

        setSettingPanel();
    }

    public void setCalAreaButton() {
//        calculateAreaButton.setPreferredSize(new Dimension(40, 430));
        calculateAreaButton.setBackground(new Color(0, 0, 0));
        calculateAreaButton.setBounds(15,17, 200, 60);
        calculateAreaButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        calculateAreaButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 19));
        calculateAreaButton.setForeground(Color.WHITE);
        calculateAreaButton.setText("CALCULATE AREA");
        CalcAreaPanel.add(calculateAreaButton);
        setCalcAreafld();
    }

    public void setCalPCButton() {
//        calculateAreaButton.setPreferredSize(new Dimension(40, 430));
        calculatePCBtn.setBackground(new Color(17, 0, 0));
        calculatePCBtn.setBounds(15,17, 200, 60);
        calculatePCBtn.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        calculatePCBtn.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 19));
        calculatePCBtn.setForeground(Color.WHITE);
        calculatePCBtn.setText("CALCULATE P/C");
        CalcPCPanel.add(calculatePCBtn);
    }

    public void setSettingPanel(){
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));
        SettingPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();
    }

    public void setDimensionPanel(){
        DimensionPanel.setBackground(new Color(0, 0, 0));
        DimensionPanel.setLayout(new GridLayout(2,1, 5,5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        SettingPanel.add(DimensionPanel);
        setLengthlbl();
        setWidthlbl();
        setLengthPanel();
    }

    public void setLengthPanel(){
        LengthPanel.setBackground(new Color(27, 135, 0));
        LengthPanel.setLayout(new FlowLayout());
        LengthPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        DimensionPanel.add(LengthPanel);
        setWidthPanel();
    }

    public void setWidthPanel(){
        WidthPanel.setBackground(new Color(97, 20, 96));
        WidthPanel.setLayout(new FlowLayout());
        WidthPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        DimensionPanel.add(WidthPanel);
        setCalPanel();
    }

    public void setCalPanel(){
        CalPanel.setBackground(new Color(0, 0, 0));
        CalPanel.setLayout(new GridLayout(2,2, 2, 2));
        SettingPanel.add(CalPanel);

    }


    //------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------




    //BOTTOM PANEL GUI LABELS AND INPUT FIELDS
    public void setLengthlbl(){
        lengthlbl.setBounds(0,10,50,50); // working on
        lengthlbl.setBackground(new Color(60, 58, 58));
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font ("Asap", Font.PLAIN,32));
        lengthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        lengthlbl.setVerticalAlignment(SwingConstants.CENTER);
        LengthPanel.add(lengthlbl);
        setLengthInputfld();
    }


    JTextField lengthInputfld = new JTextField();
    public void setLengthInputfld(){
        lengthInputfld.setPreferredSize(new Dimension(250,40));
        lengthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        lengthInputfld.setFont(new Font("Consoles",Font.PLAIN,32));
        lengthInputfld.setCaretColor(new Color(60, 58, 58));
        LengthPanel.add(lengthInputfld);
    }


    public void setWidthlbl(){
        widthlbl.setBounds(10,100,50,50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font ("Asap", Font.PLAIN,32));
        widthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        widthlbl.setVerticalAlignment(SwingConstants.CENTER);
        WidthPanel.add(widthlbl);
        setWidthInputfld();
    }

    JTextField widthInputfld = new JTextField();
    public void setWidthInputfld(){
        widthInputfld.setPreferredSize(new Dimension(250,40));
        widthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        widthInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        widthInputfld.setCaretColor(new Color(60, 58, 58));
        WidthPanel.add(widthInputfld); // changed
        setCalcAreaPanel();
    }

    public void setCalcAreaPanel(){
        CalcAreaPanel.setBackground(new Color(205, 4, 4));
        CalcAreaPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        CalcAreaPanel.setLayout(null);
        CalPanel.add(CalcAreaPanel);
        setCalcPCPanel();
        setCalAreaButton();
//        setCalcArealbl();
//        setCalcAreafld();
    }

    public void setCalcPCPanel(){
        CalcPCPanel.setBackground(new Color(6, 0, 179));
        CalcPCPanel.setLayout(null);
        CalcPCPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        CalPanel.add(CalcPCPanel);
//        setCalcPClbl();
//        setCalcPCfld();
        setCalPCButton();
        setCalcPCfld();

    }

    JTextField AreaInputfld = new JTextField();
    public void setCalcAreafld(){
        AreaInputfld.setBounds(221, 20, 310, 55);
        AreaInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        AreaInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        AreaInputfld.setCaretColor(new Color(60, 58, 58));
        AreaInputfld.setEditable(false);
        CalcAreaPanel.add(AreaInputfld);
    }


    public void setCalcPCfld(){
        PCInputfld.setBounds(221, 20, 310, 55);
        PCInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        PCInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        PCInputfld.setCaretColor(new Color(60, 58, 58));
        PCInputfld.setEditable(false);
        CalcPCPanel.add(PCInputfld);
    }
}
