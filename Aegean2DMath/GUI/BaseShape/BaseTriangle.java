package Aegean2DMath.GUI.BaseShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseTriangle extends JFrame implements ActionListener {
    public JFrame Triangleframe =  new JFrame("Triangle");
    JLabel Heightlbl = new JLabel();
    JTextField HeightInputfld = new JTextField();
    JLabel Baselbl = new JLabel();
    JTextField BaseInputfld = new JTextField();
    JTextField AreaInputfld = new JTextField();
    JLabel Arealbl = new JLabel();

    public BaseTriangle(){
        this.setSize(420, 250);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(50,50,50));
        setHeightlbl();
    }

    public void setHeightlbl(){
        Heightlbl.setBounds(10,100,50,50); // working on
        Heightlbl.setText("Height");
        Heightlbl.setForeground(Color.WHITE);
        Heightlbl.setFont(new Font ("Asap", Font.PLAIN,32));
        Heightlbl.setHorizontalAlignment(SwingConstants.CENTER);
        Heightlbl.setVerticalAlignment(SwingConstants.CENTER);
        this.add(Heightlbl);
        setHeightInputfld();
    }

    public void setHeightInputfld(){
        HeightInputfld.setPreferredSize(new Dimension(250,40));
        HeightInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        HeightInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        HeightInputfld.setCaretColor(new Color(60, 58, 58));
        this.add(HeightInputfld);
        setBaselbl();
    }

    public void setBaselbl(){
        Baselbl.setBounds(10,100,50,50); // working on
        Baselbl.setText("Base");
        Baselbl.setForeground(Color.WHITE);
        Baselbl.setFont(new Font ("Asap", Font.PLAIN,32));
        Baselbl.setHorizontalAlignment(SwingConstants.CENTER);
        Baselbl.setVerticalAlignment(SwingConstants.CENTER);
        this.add(Baselbl);
        setBaseInputfld();
    }

    public void setBaseInputfld(){
        BaseInputfld.setPreferredSize(new Dimension(250,40));
        BaseInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        BaseInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        BaseInputfld.setCaretColor(new Color(60, 58, 58));
        this.add(BaseInputfld);
        setAreaInputfld();
    }

    public void setAreaInputfld(){
        AreaInputfld.setBounds(221, 20, 290, 55);
        AreaInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58),1));
        AreaInputfld.setFont(new Font("Consoles",Font.PLAIN,30));
        AreaInputfld.setCaretColor(new Color(60, 58, 58));
        AreaInputfld.setEditable(false);
        this.add(AreaInputfld);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}