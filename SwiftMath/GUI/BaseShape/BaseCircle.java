package SwiftMath.GUI.BaseShape;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseCircle implements ActionListener {
    public JFrame Circleframe =  new JFrame();

    public BaseCircle(){
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
