package GeoMath2D.GUI.Base.SystemSetup;

import javax.swing.*;
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
    public final JPanel CalcAreaPanel = new JPanel();
    public final JPanel CalcPCPanel = new JPanel();



    //------------------------------------------------------

    public BottomGUI() {

        this.setBackground(new Color(60, 58, 58));
        this.setPreferredSize(new Dimension(200, 200));
        Border redLine= BorderFactory.createLineBorder(new Color(0, 0, 0));
        this.setBorder(redLine);
        this.setLayout(new BorderLayout()); // here is where the layout was set

        setSettingPanel();
    }


    public void setSettingPanel(){
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1,3));
        SettingPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        this.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();

    }

    public void setDimensionPanel(){
        DimensionPanel.setBackground(new Color(60, 58, 58));
        DimensionPanel.setLayout(new GridLayout(2,1, 5,5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        SettingPanel.add(DimensionPanel);
        setLengthlbl();
        setWidthlbl();
        setLengthPanel();
    }

    public void setLengthPanel(){
        LengthPanel.setBackground(new Color(60, 58, 58));
        LengthPanel.setLayout(new FlowLayout());
        LengthPanel.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 2));
        DimensionPanel.add(LengthPanel);
        setWidthPanel();
    }

    public void setWidthPanel(){
        WidthPanel.setBackground(new Color(60, 58, 58));
        WidthPanel.setLayout(new FlowLayout());
        WidthPanel.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 2));
        DimensionPanel.add(WidthPanel);
        setCalPanel();
    }

    public void setCalPanel(){
        CalPanel.setBackground(new Color(60, 58, 58));
        CalPanel.setLayout(new GridLayout(2,2, 2, 2));
        SettingPanel.add(CalPanel);

    }








    //------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------




    //BOTTOM PANEL GUI LABELS AND INPUT FIELDS
    public void setLengthlbl(){
        JLabel lengthlbl = new JLabel();
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


    public void setLengthInputfld(){
        JTextField lengthInputfld = new JTextField();
        lengthInputfld.setPreferredSize(new Dimension(250,40));
        lengthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        lengthInputfld.setFont(new Font("Consoles",Font.PLAIN,32));
        lengthInputfld.setCaretColor(new Color(60, 58, 58));
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
        widthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        widthInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        widthInputfld.setCaretColor(new Color(60, 58, 58));
        WidthPanel.add(widthInputfld); // changed
        setCalcAreaPanel();
    }

    public void setCalcAreaPanel(){
        CalcAreaPanel.setBackground(new Color(60, 58, 58));
        CalcAreaPanel.setLayout(new FlowLayout());
        CalcAreaPanel.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 2));
        CalPanel.add(CalcAreaPanel);
        setCalcPCPanel();
        setCalcArealbl();
        setCalcAreafld();
    }

    public void setCalcPCPanel(){
        CalcPCPanel.setBackground(new Color(60, 58, 58));
        CalcPCPanel.setLayout(new FlowLayout());
        CalcPCPanel.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 2));
        CalPanel.add(CalcPCPanel);
        setCalcPClbl();
        setCalcPCfld();

    }

    public void setCalcArealbl(){
        JLabel CalcArealbl = new JLabel();
        CalcArealbl.setBounds(10,100,50,50); // working on
        CalcArealbl.setText("Area");
        CalcArealbl.setForeground(Color.WHITE);
        CalcArealbl.setFont(new Font ("Asap", Font.PLAIN,32));
        CalcArealbl.setHorizontalAlignment(SwingConstants.CENTER);
        CalcArealbl.setVerticalAlignment(SwingConstants.CENTER);
        CalcAreaPanel.add(CalcArealbl);

    }

    public void setCalcAreafld(){
        JTextField AreaInputfld = new JTextField();
        AreaInputfld.setPreferredSize(new Dimension(250,40));
        AreaInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        AreaInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        AreaInputfld.setCaretColor(new Color(60, 58, 58));
        CalcAreaPanel.add(AreaInputfld);
    }

    public void setCalcPClbl(){
        JLabel CalcPClbl = new JLabel();
        CalcPClbl.setBounds(10,100,50,50); // working on
        CalcPClbl.setText("PC");
        CalcPClbl.setForeground(Color.WHITE);
        CalcPClbl.setFont(new Font ("Asap", Font.PLAIN,32));
        CalcPClbl.setHorizontalAlignment(SwingConstants.CENTER);
        CalcPClbl.setVerticalAlignment(SwingConstants.CENTER);
        CalcPCPanel.add(CalcPClbl);
    }
    public void setCalcPCfld(){
        JTextField PCInputfld = new JTextField();
        PCInputfld.setPreferredSize(new Dimension(250,40));
        PCInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        PCInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        PCInputfld.setCaretColor(new Color(60, 58, 58));
        CalcPCPanel.add(PCInputfld);
    }



    //--------------------------------------------------------------------------------------






}
