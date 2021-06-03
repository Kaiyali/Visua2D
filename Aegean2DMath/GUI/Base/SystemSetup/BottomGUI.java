package Aegean2DMath.GUI.Base.SystemSetup;

import Aegean2DMath.Functionallity.ShapeAssets;
import Aegean2DMath.GUI.Base.Assets.ClearButton;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.util.Objects;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class BottomGUI extends JPanel implements ActionListener, KeyListener {


    //VARIABLES DEFINING
    public final JPanel SettingPanel = new JPanel();
    public final JPanel DimensionPanel = new JPanel();
    public final JPanel CalPanel = new JPanel();
    public final JPanel LengthPanel = new JPanel();
    public final JPanel WidthPanel = new JPanel();
    public final JPanel CalcAreaPanel = new JPanel();
    public final JPanel CalcPCPanel = new JPanel();

    public final ClearButton calculatePCBtn = new ClearButton();

    public final JButton clearButton = new JButton("ClEAR FIELDS");

    public JTextField PCInputfld = new JTextField();
    public JLabel lengthlbl = new JLabel();
    public JLabel widthlbl = new JLabel();
    public JLabel UnitLabel = new JLabel("CHOOSE UNIT");


    public final ClearButton calculateAreaButton = new ClearButton();

    public JComboBox jComboBox;
    private final JLabel unlabel = new JLabel();
    private final JLabel un2Label = new JLabel();




    //=====================================================
    //=====================================================
    //=====================================================
    //=====================================================
    //------------------------------------------------------



    public BottomGUI() {

        this.setBackground(new Color(0, 0, 0));
        this.setPreferredSize(new Dimension(200, 200));
        Border redLine = BorderFactory.createLineBorder(new Color(0, 0, 0));
        this.setBorder(redLine);
        this.setLayout(new BorderLayout()); // here is where the layout was set

        setSettingPanel();
    }


    public void setCalAreaButton() {
        calculateAreaButton.setBackground(new Color(0, 0, 0));
        calculateAreaButton.setBounds(15, 17, 200, 60);
        calculateAreaButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        calculateAreaButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 19));
        calculateAreaButton.setForeground(Color.WHITE);
        calculateAreaButton.setText("CALCULATE AREA");
        calculateAreaButton.addActionListener(this);
        CalcAreaPanel.add(calculateAreaButton);
        setCalcAreafld();
    }

    public void setCalPCButton() {
        calculatePCBtn.setBackground(new Color(17, 0, 0));
        calculatePCBtn.setBounds(15, 17, 200, 60);
        calculatePCBtn.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        calculatePCBtn.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 19));
        calculatePCBtn.setForeground(Color.WHITE);
        calculatePCBtn.addActionListener(this);
        calculatePCBtn.setText("CALCULATE Pm.");
        CalcPCPanel.add(calculatePCBtn);
    }

    public void setSettingPanel() {
        SettingPanel.setPreferredSize(new Dimension(120, 120));
        SettingPanel.setLayout(new GridLayout(1, 3));
        SettingPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(SettingPanel, BorderLayout.CENTER);
        setDimensionPanel();
    }

    public void setDimensionPanel() {
        DimensionPanel.setBackground(new Color(0, 0, 0));
        DimensionPanel.setLayout(new GridLayout(2, 1, 5, 5));
        DimensionPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        SettingPanel.add(DimensionPanel);
        setLengthlbl();
        setWidthlbl();
        setLengthPanel();
    }

    public void setLengthPanel() {
        LengthPanel.setBackground(new Color(37, 37, 37));
        LengthPanel.setLayout(new FlowLayout());
        LengthPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        DimensionPanel.add(LengthPanel);
        setUnLabel();
        setWidthPanel();
    }

    public void setWidthPanel() {
        WidthPanel.setBackground(new Color(32, 32, 32));
        WidthPanel.setLayout(new FlowLayout());
        WidthPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 2));
        DimensionPanel.add(WidthPanel);
        setUn2Label();
        setCalPanel();
    }

    public void setCalPanel() {
        CalPanel.setBackground(new Color(0, 0, 0));
        CalPanel.setLayout(new GridLayout(2, 2, 2, 2));
        SettingPanel.add(CalPanel);

    }


    //------------------------------------------------------------------------------------------------------

    //--------------------------------------------------------------------------------------


    //BOTTOM PANEL GUI LABELS AND INPUT FIELDS
    public void setLengthlbl() {
        lengthlbl.setBounds(0, 10, 50, 50); // working on
        lengthlbl.setBackground(new Color(60, 58, 58));
        lengthlbl.setText("Length");
        lengthlbl.setForeground(Color.WHITE);
        lengthlbl.setFont(new Font("Asap", Font.PLAIN, 32));
        lengthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        lengthlbl.setVerticalAlignment(SwingConstants.CENTER);
        LengthPanel.add(lengthlbl);
        setLengthInputfld();
    }


    JTextField lengthInputfld = new JTextField();

    public void setLengthInputfld() {
        lengthInputfld.setPreferredSize(new Dimension(250, 40));
        lengthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 1));
        lengthInputfld.setFont(new Font("Consoles", Font.PLAIN, 32));
        lengthInputfld.setCaretColor(new Color(60, 58, 58));
        lengthInputfld.addKeyListener(this);
        LengthPanel.add(lengthInputfld);
    }


    public void setWidthlbl() {
        widthlbl.setBounds(10, 100, 50, 50); // working on
        widthlbl.setText("Width");
        widthlbl.setForeground(Color.WHITE);
        widthlbl.setFont(new Font("Asap", Font.PLAIN, 32));
        widthlbl.setHorizontalAlignment(SwingConstants.CENTER);
        widthlbl.setVerticalAlignment(SwingConstants.CENTER);
        WidthPanel.add(widthlbl);
        setWidthInputfld();
    }

    JTextField widthInputfld = new JTextField();

    public void setWidthInputfld() {
        widthInputfld.setPreferredSize(new Dimension(250, 40));
        widthInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 1));
        widthInputfld.setFont(new Font("Consoles", Font.PLAIN, 30));
        widthInputfld.setCaretColor(new Color(60, 58, 58));
        widthInputfld.addKeyListener(this);
        WidthPanel.add(widthInputfld);
        setCalcAreaPanel();
    }

    public void setCalcAreaPanel() {
        CalcAreaPanel.setBackground(new Color(205, 4, 4));
        CalcAreaPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        CalcAreaPanel.setLayout(null);
        CalPanel.add(CalcAreaPanel);
        setCalcPCPanel();
        setCalAreaButton();
        setJComboBox();
    }

    public void setCalcPCPanel() {
        CalcPCPanel.setBackground(new Color(6, 0, 179));
        CalcPCPanel.setLayout(null);
        CalcPCPanel.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        CalPanel.add(CalcPCPanel);
        setCalPCButton();
        setCalcPCfld();
        setClearButton();

    }

    JTextField AreaInputfld = new JTextField();

    public void setCalcAreafld() {
        AreaInputfld.setBounds(221, 20, 290, 55);
        AreaInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 1));
        AreaInputfld.setFont(new Font("Consoles", Font.PLAIN, 30));
        AreaInputfld.setCaretColor(new Color(60, 58, 58));
        AreaInputfld.setEditable(false);
        CalcAreaPanel.add(AreaInputfld);
    }


    public void setCalcPCfld() {
        PCInputfld.setBounds(221, 20, 290, 55);
        PCInputfld.setBorder(BorderFactory.createLineBorder(new Color(60, 58, 58), 1));
        PCInputfld.setFont(new Font("Consoles", Font.PLAIN, 30));
        PCInputfld.setCaretColor(new Color(60, 58, 58));
        PCInputfld.setEditable(false);
        CalcPCPanel.add(PCInputfld);
    }

    public void setUnLabel() {
        unlabel.setForeground(Color.RED);
        unlabel.setFont(new Font("Arial Black", Font.BOLD, 16));
        LengthPanel.add(unlabel);
    }

    public void setUn2Label() {
        un2Label.setForeground(Color.RED);
        un2Label.setFont(new Font("Arial Black", Font.BOLD, 16));
        WidthPanel.add(un2Label);
    }

    public void setClearButton() {
        clearButton.setBounds(518, 25, 120, 40);
        clearButton.setFont(new Font("Segoe UI", Font.ITALIC + Font.BOLD, 12));
        clearButton.setForeground(Color.BLACK);
        clearButton.setFocusPainted(false);
        clearButton.setHorizontalAlignment(SwingConstants.CENTER);
        clearButton.setVerticalAlignment(SwingConstants.CENTER);
        //this:: double colon operator refers to the method call for separate action performed event
        clearButton.addActionListener(this::showPopUpBoxForClearButton);
        CalcPCPanel.add(clearButton);
    }




    //-----------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------
    //-----------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------





    //FUNCTIONALLITY WORK
    char sqr = '\u00B2';
    String cm = "cm";
    String m = "m";
    String mm = "mm";
    String km = "km";
    String in = "in";
    String yd = "yd";
    String ft = "ft";
    String mi = "mi";

    @Override
    public void actionPerformed(ActionEvent e) {

        if((e.getSource() == calculateAreaButton) && (lengthInputfld.getText().isEmpty() || widthInputfld.getText().isEmpty())) {
            lengthInputfld.setEditable(false);
            widthInputfld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(calculateAreaButton, "Please Enter Some Positive Numerical Values To Compute", "Error Occurred", JOptionPane.ERROR_MESSAGE);
            lengthInputfld.setEditable(true);
            widthInputfld.setEditable(true);
        } else if((e.getSource() == calculatePCBtn) && (lengthInputfld.getText().isEmpty()) || widthInputfld.getText().isEmpty()) {
            lengthInputfld.setEditable(false);
            widthInputfld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(calculatePCBtn, "Please Enter Some Positive Numerical Values To Compute", "Error Occurred", JOptionPane.ERROR_MESSAGE);
            lengthInputfld.setEditable(true);
            widthInputfld.setEditable(true);
        } else if((e.getSource() == jComboBox) && (lengthInputfld.getText().isEmpty()) || widthInputfld.getText().isEmpty()) {
            lengthInputfld.setEditable(false);
            widthInputfld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(jComboBox, "Please Enter Some Positive Numerical Values To Compute", "Error Occurred", JOptionPane.ERROR_MESSAGE);
            lengthInputfld.setEditable(true);
            widthInputfld.setEditable(true);
        } else {
            String length = lengthInputfld.getText().trim();
            String width = widthInputfld.getText().trim();
            double lengthNum = Double.parseDouble(length);
            double widthNum = Double.parseDouble(width);
            double result = ShapeAssets.squareOrRectangleArea(lengthNum, widthNum);
            double result2 = ShapeAssets.squareRectanglePerimeter(lengthNum, widthNum);

            if (e.getSource() == calculateAreaButton) {
                AreaInputfld.setText(result + "");
            } else if(e.getSource() == calculatePCBtn) {
                PCInputfld.setText(result2 + "");
            }
            if (e.getSource() == jComboBox) {
                String selected = (String) jComboBox.getSelectedItem();
                assert selected != null;
                AreaInputfld.setText(result + " " + selected + sqr);
                PCInputfld.setText(result2 + " " + selected);
                lengthInputfld.setText(lengthNum + " " + selected);
                lengthInputfld.setEditable(false);
                widthInputfld.setText(widthNum + " " + selected);/*this deletes the last character of the string*/
                widthInputfld.setEditable(false);
            }
        }
    }

    public void showPopUpBoxForClearButton(ActionEvent e) {
        if((e.getSource() == clearButton && lengthInputfld.getText().isEmpty() && widthInputfld.getText().isEmpty())) {
            lengthInputfld.setEditable(false);
            widthInputfld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(clearButton, "Could Not Clear Any Values", "Alert", JOptionPane.WARNING_MESSAGE);
            lengthInputfld.setEditable(true);
            widthInputfld.setEditable(true);
        } else {
            jComboBox.removeActionListener(this);
            lengthInputfld.setText("");
            widthInputfld.setText("");
            AreaInputfld.setText("");
            PCInputfld.setText("");
            lengthInputfld.setEditable(true);
            widthInputfld.setEditable(true);
            jComboBox.setSelectedItem(units[0]);
            jComboBox.addActionListener(this);
        }
    }


    //CODE FOR COMBOBOX
    String[] units = {cm, m, mm, km, in, yd, ft, mi};

    public void setJComboBox() {
        setUnitLabel();
        jComboBox = new JComboBox(units);
        jComboBox.setBounds(532, 37, 100, 40);
        jComboBox.setFont(new Font("Arial", Font.BOLD, 15));
        jComboBox.addActionListener(this);
        CalcAreaPanel.add(jComboBox);
    }

    public void setUnitLabel() {
        UnitLabel.setBounds(523, 10, 120, 20);
        UnitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        UnitLabel.setVerticalAlignment(SwingConstants.CENTER);
        UnitLabel.setForeground(Color.WHITE);
        UnitLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        CalcAreaPanel.add(UnitLabel);
    }



    //CODE FOR IMPLEMENTING CONSTRAINTS ON THE TEXT FIELDS
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getSource() == lengthInputfld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                lengthInputfld.setEditable(true);
                unlabel.setText("");
            } else {
                lengthInputfld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();

                unlabel.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        } else if(ke.getSource() == widthInputfld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                widthInputfld.setEditable(true);
                un2Label.setText("");
            } else {
                widthInputfld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();

                un2Label.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //-------------------------------------------------------
}
