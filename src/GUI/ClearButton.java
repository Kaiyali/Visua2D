package src.GUI;
import javax.swing.*;
import java.awt.*;

public class ClearButton extends JButton {

    ClearButton(){
        initButton();
    }
    public void initButton(){
        this.setBounds(50, 100, 95, 30);
        this.setBorderPainted(true);
        this.setFocusPainted(false);
        this.setForeground(Color.BLACK);
    }
}
