package SwiftMath.Project.GUI.System.ShapeSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleGUI implements ActionListener {
    public JFrame Circleframe =  new JFrame();

    public CircleGUI(){
        Circleframe.setSize(420, 550);
        Circleframe.setResizable(false);
        Circleframe.setLayout(null);
        Circleframe.setVisible(true);
        Circleframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
