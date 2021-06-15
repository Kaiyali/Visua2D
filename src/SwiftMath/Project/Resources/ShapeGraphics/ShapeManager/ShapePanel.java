package SwiftMath.Project.Resources.ShapeGraphics.ShapeManager;

import SwiftMath.Project.Resources.ComponentAssets.AppColors;
import SwiftMath.Project.Resources.ComponentAssets.VerticalLabelUI;
import SwiftMath.Project.Resources.ShapeGraphics.Shapes.Circle;
import SwiftMath.Project.Resources.ShapeGraphics.Shapes.Triangle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ShapePanel extends JPanel implements ActionListener, ChangeListener {

    char sqr = '\u00B2';


    public static final JPanel sqrdisplay = new JPanel();
    public static Circle circle = new Circle(300);
    public static Triangle triangle = new Triangle();

    //width
    public static JSlider widthSlider = new JSlider();
    public static JLabel widthLblChange = new JLabel();
    public static JLabel widthLblShow = new JLabel();
    //height
    public static JSlider heightSlider = new JSlider();
    public static JLabel heightLblChange = new JLabel();
    public static JLabel heightLblShow = new JLabel();
    //x
    public static JSlider xSlider = new JSlider();
    public static JLabel xLabelChanger = new JLabel();
    public static JLabel xLabelShower = new JLabel();
    //y
    public static JSlider ySlider = new JSlider();
    public static JLabel yLabelChanger = new JLabel();
    public static JLabel yLabelShower = new JLabel();
    //area
    public static JLabel areaLblForQuad = new JLabel();
    //perimeter



    public ShapePanel(){
        this.setBackground(AppColors.White);
        this.setPreferredSize(new Dimension(200, 200));
        this.setLayout(null);
        setWidthSlider();
        setHeightSlider();
        setXSlider();
        setYSlider();
        setAreaChanger();
        SquareDisplayed();
        CircleDisplayed();
        TriangleDisplayed();
    }


    //Square
    public void SquareDisplayed() {
        sqrdisplay.setBounds(597, 235, 100, 100);
        sqrdisplay.setVisible(false);
        this.add(sqrdisplay);
    }

    public void CircleDisplayed() {
        circle.setBounds(70,80,100,100);
        circle.setVisible(false);
        this.add(circle);
    }

    public void TriangleDisplayed() {
        triangle.setBounds(70, 80, 200, 200);
        triangle.setVisible(false);
        this.add(triangle);
    }

    public void setWidthSlider() {
        widthSlider.setMinimum(0);
        widthSlider.setMaximum(500);
        widthSlider.setValue(100);
        widthSlider.setBounds(90, 60, 1100, 45);

        widthSlider.setPaintTicks(true);
        widthSlider.setMinorTickSpacing(25);

        widthSlider.setPaintTrack(true);
        widthSlider.setMajorTickSpacing(100);

        widthSlider.setPaintLabels(true);
        widthSlider.setFont(new Font("Arial", Font.BOLD, 16));

        widthLblChange.setBounds(675, 18, 100, 25);
        widthLblChange.setFont(new Font("MV Boli", Font.BOLD, 20));
        widthLblChange.setForeground(Color.GREEN.darker().darker());
        widthLblChange.setText(widthSlider.getValue()+" px");
        widthLblChange.setVisible(false);

        widthSlider.addChangeListener(this);
        widthSlider.setVisible(false);

        widthLblShow.setText("Change Width: ");
        widthLblShow.setFont(new Font("Arial Black", Font.PLAIN, 18));
        widthLblShow.setBounds(520, 0, 230, 60);
        widthLblShow.setVisible(false);

        this.add(widthSlider);
        this.add(widthLblChange);
        this.add(widthLblShow);
    }

    public void setHeightSlider() {
        heightSlider.setMinimum(0);
        heightSlider.setMaximum(500);
        heightSlider.setValue(100);
        heightSlider.setBounds(1170, 127, 70, 350);

        heightSlider.setPaintTicks(true);
        heightSlider.setMinorTickSpacing(25);

        heightSlider.setPaintTrack(true);
        heightSlider.setMajorTickSpacing(100);

        heightSlider.setPaintLabels(true);
        heightSlider.setOrientation(SwingConstants.VERTICAL);
        heightSlider.addChangeListener(this);
        heightSlider.setFont(new Font("Arial", Font.BOLD, 16));
        heightSlider.setVisible(false);

        heightLblChange.setBounds(1250, 200, 30, 140);
        heightLblChange.setText("Change Height: ");
        heightLblChange.setFont(new Font("Arial Black", Font.PLAIN, 15));
        heightLblChange.setUI(new VerticalLabelUI(true));
        heightLblChange.setVisible(false);

        heightLblShow.setBounds(1240, 335, 50, 100);
        heightLblShow.setFont(new Font("MV Boli", Font.BOLD, 19));
        heightLblShow.setForeground(Color.GREEN.darker().darker());
        heightLblShow.setUI(new VerticalLabelUI(true));
        heightLblShow.setText(heightSlider.getValue() + " px");
        heightLblShow.setVisible(false);

        this.add(heightSlider);
        this.add(heightLblChange);
        this.add(heightLblShow);
    }

    public void setXSlider() {
        xSlider.setMinimum(0);
        xSlider.setMaximum(1000);
        xSlider.setValue(597);
        xSlider.setBounds(90, 500, 1120, 45);

        xSlider.setPaintTicks(true);
        xSlider.setMinorTickSpacing(50);

        xSlider.setPaintTrack(true);
        xSlider.setMajorTickSpacing(100);

        xSlider.setPaintLabels(true);
        xSlider.addChangeListener(this);
        xSlider.setFont(new Font("Arial", Font.BOLD, 16));
        xSlider.setVisible(false);

        xLabelShower.setBounds(513, 410, 230, 140);
        xLabelShower.setText("Change X Coordinate: ");
        xLabelShower.setFont(new Font("Arial Black", Font.PLAIN, 18));
        xLabelShower.setVisible(false);

        xLabelChanger.setBounds(740, 409, 100, 140);
        xLabelChanger.setText(xSlider.getValue() + " px");
        xLabelChanger.setFont(new Font("MV Boli", Font.BOLD, 20));
        xLabelChanger.setForeground(Color.MAGENTA.darker().darker());
        xLabelChanger.setVisible(false);

        this.add(xSlider);
        this.add(xLabelShower);
        this.add(xLabelChanger);
    }

    public void setYSlider() {
        ySlider.setMinimum(0);
        ySlider.setMaximum(450);
        ySlider.setValue(235);
        ySlider.setBounds(40, 128, 80, 360);

        ySlider.setPaintTicks(true);
        ySlider.setMinorTickSpacing(25);

        ySlider.setPaintTrack(true);
        ySlider.setMajorTickSpacing(50);

        ySlider.setPaintLabels(true);
        ySlider.addChangeListener(this);
        ySlider.setFont(new Font("Arial", Font.BOLD, 16));
        ySlider.setOrientation(SwingConstants.VERTICAL);
        ySlider.setVisible(false);

        yLabelShower.setBounds(10, 240, 20, 200);
        yLabelShower.setText("Change Y Coordinate: ");
        yLabelShower.setFont(new Font("Arial Black", Font.PLAIN, 15));
        yLabelShower.setUI(new VerticalLabelUI(false));
        yLabelShower.setVisible(false);

        yLabelChanger.setBounds(10, 50, 20, 200);
        yLabelChanger.setText(ySlider.getValue()+" px");
        yLabelChanger.setFont(new Font("MV Boli", Font.BOLD, 18));
        yLabelChanger.setUI(new VerticalLabelUI(false));
        yLabelChanger.setForeground(Color.MAGENTA.darker().darker());
        yLabelChanger.setVisible(false);

        this.add(ySlider);
        this.add(yLabelShower);
        this.add(yLabelChanger);
    }

    public void setAreaChanger() {
        areaLblForQuad.setBounds(1165, 2, 214, 40);
        areaLblForQuad.setFont(new Font("Calibri", Font.BOLD, 19));
        areaLblForQuad.setText("Area: " + widthSlider.getValue() * heightSlider.getValue() + " px" + sqr);
        areaLblForQuad.setForeground(Color.BLUE.darker().darker());
        areaLblForQuad.setVisible(false);
        this.add(areaLblForQuad);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        xLabelChanger.setText(xSlider.getValue() + " px");
        widthLblChange.setText(widthSlider.getValue()+" " + "px");
        heightLblShow.setText(heightSlider.getValue()+" " + "px");
        yLabelChanger.setText(ySlider.getValue()+" px");
        areaLblForQuad.setText("Area: " + widthSlider.getValue() * heightSlider.getValue() + " px" + sqr);
        sqrdisplay.setBounds(xSlider.getValue(), ySlider.getValue(), widthSlider.getValue(), heightSlider.getValue());
    }
}

