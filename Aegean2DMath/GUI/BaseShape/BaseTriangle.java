package Aegean2DMath.GUI.BaseShape;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//TODO FIX ERRORS - A LOT OF THEM - hint compare with the quad app

public class BaseTriangle implements ActionListener, KeyListener {

    public JFrame TriangleFrame = new JFrame();
    private final JPanel quadDimensionPanel = new JPanel();
    private final JLabel Heightlbl = new JLabel("Height");
    private final JLabel Baselbl = new JLabel("Base");
    private final JLabel sideOne = new JLabel("Side No. 1");
    private final JLabel sideTwo = new JLabel("Side No. 2");
    private final JLabel sideThree = new JLabel("Side No. 3");

    private final JTextField HeightTxtFld = new JTextField();
    private final JTextField SideOneTxtFld = new JTextField();
    private final JTextField SideTwoTxtFld = new JTextField();
    private final JTextField SideThreeTxtFld = new JTextField();
    private final JTextField BaseTxtFld = new JTextField();


    private final JTextField answerFld = new JTextField();
    private final JTextField AreaFld = new JTextField();
    private final JButton CalculateTriType = new JButton("Calculate Tri. Type");
    private final JButton CalculateArea = new JButton("Calculate Area ");
    private final JButton clearButton = new JButton("CLEAR FIELDS");
    private final JButton CalculatePerimeter = new JButton("CALCULATE Pm.");

    String cm = "cm";
    String m = "m";
    String mm = "mm";
    String km = "km";
    String in = "in";
    String yd = "yd";
    String ft = "ft";
    String mi = "mi";

    String[] units = {cm, m, mm, km, in, yd, ft, mi};

    //JComboBox for units
    private final JComboBox unitComboBox;

    //label for units
    private JLabel unitLabel = new JLabel("CHOOSE UNIT");
    private JLabel warningLabelHeight = new JLabel();
    private JLabel warningLabelSideOne = new JLabel();
    private JLabel warningLabelSideTwo = new JLabel();
    private JLabel warningLabelSideThree = new JLabel();
    private final JLabel warningLabelBase = new JLabel();

    //our important strings and chars


    //constructor
    public BaseTriangle() {
        //setting the frame
        TriangleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TriangleFrame.setLayout(null);
        TriangleFrame.getContentPane().setBackground(new Color(212, 206, 204));
        TriangleFrame.setSize(650, 780);
        TriangleFrame.setTitle("Triangle Calculator");
        TriangleFrame.setResizable(false);

        //adding the panel
        quadDimensionPanel.setBounds(0, 0, 500, 510);
        quadDimensionPanel.setLayout(null);
        quadDimensionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        TriangleFrame.add(quadDimensionPanel);

        //setting side 1 label
        Heightlbl.setBounds(5, 5, 150, 50);
        Heightlbl.setBackground(Color.YELLOW);
        Heightlbl.setOpaque(true);
        Heightlbl.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Heightlbl.setVerticalAlignment(SwingConstants.CENTER);
        Heightlbl.setHorizontalAlignment(SwingConstants.CENTER);
        Heightlbl.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        Heightlbl.setForeground(Color.BLACK);
        quadDimensionPanel.add(Heightlbl);

        Baselbl.setBounds(5,100,150,50);
        Baselbl.setBackground(Color.YELLOW);
        Baselbl.setOpaque(true);
        Baselbl.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Baselbl.setVerticalAlignment(SwingConstants.CENTER);
        Baselbl.setHorizontalAlignment(SwingConstants.CENTER);
        Baselbl.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        Baselbl.setForeground(Color.BLACK);
        quadDimensionPanel.add(Baselbl);

        sideOne.setBounds(5, 200, 150, 50);
        sideOne.setBackground(Color.YELLOW);
        sideOne.setOpaque(true);
        sideOne.setFont(new Font("Segoe UI", Font.BOLD, 20));
        sideOne.setVerticalAlignment(SwingConstants.CENTER);
        sideOne.setHorizontalAlignment(SwingConstants.CENTER);
        sideOne.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        sideOne.setForeground(Color.BLACK);
        quadDimensionPanel.add(sideOne);

        sideTwo.setBounds(5, 300, 150, 50);
        sideTwo.setBackground(Color.YELLOW);
        sideTwo.setOpaque(true);
        sideTwo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        sideTwo.setVerticalAlignment(SwingConstants.CENTER);
        sideTwo.setHorizontalAlignment(SwingConstants.CENTER);
        sideTwo.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        sideTwo.setForeground(Color.BLACK);
        quadDimensionPanel.add(sideTwo);

        sideThree.setBounds(5, 400, 150, 50);
        sideThree.setBackground(Color.YELLOW);
        sideThree.setOpaque(true);
        sideThree.setFont(new Font("Segoe UI", Font.BOLD, 20));
        sideThree.setVerticalAlignment(SwingConstants.CENTER);
        sideThree.setHorizontalAlignment(SwingConstants.CENTER);
        sideThree.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        sideThree.setForeground(Color.BLACK);
        quadDimensionPanel.add(sideThree);

        //---------------------------------------

        //setting up the text fields
        HeightTxtFld.setBounds(158, 5, 325, 50);
        HeightTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        HeightTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        HeightTxtFld.addKeyListener(this);
        quadDimensionPanel.add(HeightTxtFld);

        BaseTxtFld.setBounds(158, 100, 325, 50);
        BaseTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        BaseTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        BaseTxtFld.addKeyListener(this);
        quadDimensionPanel.add(BaseTxtFld);

        SideOneTxtFld.setBounds(158, 200, 325, 50);
        SideOneTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        SideOneTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        SideOneTxtFld.addKeyListener(this);
        quadDimensionPanel.add(SideOneTxtFld);

        SideTwoTxtFld.setBounds(158, 300,325, 50);
        SideTwoTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        SideTwoTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        SideTwoTxtFld.addKeyListener(this);
        quadDimensionPanel.add(SideTwoTxtFld);

        SideThreeTxtFld.setBounds(158, 400, 328, 50);
        SideThreeTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        SideThreeTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        SideThreeTxtFld.addKeyListener(this);
        quadDimensionPanel.add(SideThreeTxtFld);


        //calculate quad type button implementation
        CalculateTriType.setBackground(new Color(0, 0, 0));
        CalculateTriType.setBounds(5, 680, 220, 60);
        CalculateTriType.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        CalculateTriType.setFont(new Font("Cambria", Font.BOLD + Font.ITALIC, 21));
        CalculateTriType.setFocusable(false);
        CalculateTriType.setForeground(Color.WHITE);
        CalculateTriType.addActionListener(this);
        TriangleFrame.add(CalculateTriType);

        //calculate Area button implementation
        CalculateArea.setBackground(new Color(0, 0, 0));
        CalculateArea.setBounds(5, 600, 200, 55);
        CalculateArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        CalculateArea.setFont(new Font("Cambria", Font.BOLD + Font.ITALIC, 21));
        CalculateArea.setFocusable(false);
        CalculateArea.setForeground(Color.WHITE);
        CalculateArea.addActionListener(this);
        TriangleFrame.add(CalculateArea);

        //calculate perimeter button
        CalculatePerimeter.setBounds(5, 518, 200, 60);
        CalculatePerimeter.setBackground(Color.BLACK);
        CalculatePerimeter.setForeground(Color.WHITE);
        CalculatePerimeter.setFocusable(false);
        CalculatePerimeter.setFont(new Font("Cambria", Font.BOLD + Font.ITALIC, 21));
        CalculatePerimeter.addActionListener(this);
        TriangleFrame.add(CalculatePerimeter);

        //text field for the answer
        answerFld.setBounds(237, 680, 390, 58);
        answerFld.setEditable(false);
        answerFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        answerFld.setFont(new Font("Segoe UI", Font.ITALIC, 27));
        TriangleFrame.add(answerFld);

        //text field for perimeter answer
        AreaFld.setBounds(215, 600, 412, 56);
        AreaFld.setEditable(false);
        AreaFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        AreaFld.setFont(new Font("Segoe UI", Font.ITALIC, 27));
        TriangleFrame.add(AreaFld);

        //text field for the area answer
        AreaFld.setBounds(215, 600, 412, 56);
        AreaFld.setEditable(false);
        AreaFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        AreaFld.setFont(new Font("Segoe UI", Font.ITALIC, 27));
        TriangleFrame.add(AreaFld);

        //setting up the unit label
        unitLabel.setBounds(510, 10, 120, 20);
        unitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unitLabel.setVerticalAlignment(SwingConstants.CENTER);
        unitLabel.setForeground(Color.BLACK);
        unitLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        TriangleFrame.add(unitLabel);


        //setting up our combo box
        unitComboBox = new JComboBox(units);
        unitComboBox.setBounds(517, 37, 100, 40);
        unitComboBox.setFont(new Font("Arial", Font.BOLD, 15));
        unitComboBox.addActionListener(this);
        TriangleFrame.add(unitComboBox);

        //setting up our clear button
        clearButton.setBounds(508, 468, 120, 40);
        clearButton.setFocusable(false);
        clearButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 13));
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        clearButton.addActionListener(this::clearFields);
        TriangleFrame.add(clearButton);


        //warning label height
        warningLabelHeight.setBounds(15, 55, 500, 40);
        warningLabelHeight.setForeground(new Color(243, 6, 6, 255));
        warningLabelHeight.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelHeight);

        //warning label base
        warningLabelBase.setBounds(15, 150, 500, 40);
        warningLabelBase.setForeground(new Color(243, 6, 6, 255));
        warningLabelBase.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelBase);

        //making the warning label 1
        warningLabelSideOne.setBounds(15, 250, 500, 40);
        warningLabelSideOne.setForeground(new Color(243, 6, 6, 255));
        warningLabelSideOne.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelSideOne);

        //warning label 2
        warningLabelSideTwo.setBounds(15, 350, 500, 40);
        warningLabelSideTwo.setForeground(new Color(243, 6, 6, 255));
        warningLabelSideTwo.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelSideTwo);

        //warning label 3
        warningLabelSideThree.setBounds(15, 460, 500, 40);
        warningLabelSideThree.setForeground(new Color(243, 6, 6, 255));
        warningLabelSideThree.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelSideThree);


        //making the window visible
        TriangleFrame.setVisible(true);
    }



    public void actionPerformed(ActionEvent e) {

    }


    //not needed but needed for the event listiner
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //needed
    @Override
    public void keyPressed(KeyEvent ke) {

        if(ke.getSource() == HeightTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                HeightTxtFld.setEditable(true);
                warningLabelHeight.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = HeightTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            HeightTxtFld.setEditable(false);
                            warningLabelHeight.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelHeight.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelHeight.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                HeightTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelHeight.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }


        if(ke.getSource() == SideOneTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                SideOneTxtFld.setEditable(true);
                warningLabelSideOne.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = SideOneTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            SideOneTxtFld.setEditable(false);
                            warningLabelSideOne.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSideOne.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSideOne.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                SideOneTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSideOne.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }


        if(ke.getSource() == SideTwoTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                SideTwoTxtFld.setEditable(true);
                warningLabelSideTwo.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = SideTwoTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            SideTwoTxtFld.setEditable(false);
                            warningLabelSideTwo.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSideTwo.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSideTwo.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                SideTwoTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSideTwo.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }



        if(ke.getSource() == SideThreeTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                SideThreeTxtFld.setEditable(true);
                warningLabelSideThree.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = SideThreeTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            SideThreeTxtFld.setEditable(false);
                            warningLabelSideThree.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSideThree.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSideThree.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                SideThreeTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSideThree.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }




        if(ke.getSource() == BaseTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                BaseTxtFld.setEditable(true);
                warningLabelBase.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = BaseTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            BaseTxtFld.setEditable(false);
                            warningLabelBase.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelBase.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelBase.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                BaseTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelBase.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }

        }
    }

    //not needed  as well but for the event listner
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void clearFields(ActionEvent e) {
        if(e.getSource() == clearButton && HeightTxtFld.getText().isEmpty() &&
                SideOneTxtFld.getText().isEmpty() && SideTwoTxtFld.getText().isEmpty() && SideThreeTxtFld.getText().isEmpty()) {
            HeightTxtFld.setEditable(false);
            SideOneTxtFld.setEditable(false);
            SideTwoTxtFld.setEditable(false);
            SideThreeTxtFld.setEditable(false);
            BaseTxtFld.setEditable(false);
            AreaFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(clearButton, "Could Not Clear Any Values", "Alert Message", JOptionPane.WARNING_MESSAGE);
            HeightTxtFld.setEditable(true);
            SideOneTxtFld.setEditable(true);
            SideTwoTxtFld.setEditable(true);
            SideThreeTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
            AreaFld.setEditable(true);
        } else {
            unitComboBox.removeActionListener(this);
            HeightTxtFld.setText("");
            SideOneTxtFld.setText("");
            SideTwoTxtFld.setText("");
            SideThreeTxtFld.setText("");
            BaseTxtFld.setText("");
            answerFld.setText("");
            AreaFld.setText("");
            HeightTxtFld.setEditable(true);
            SideOneTxtFld.setEditable(true);
            SideTwoTxtFld.setEditable(true);
            SideThreeTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
            AreaFld.setEditable(true);
            unitComboBox.setSelectedItem(units[0]);
            unitComboBox.addActionListener(this);
        }
    }
}