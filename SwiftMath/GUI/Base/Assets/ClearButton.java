package SwiftMath.GUI.Base.Assets;

import javax.swing.*;
import java.awt.*;

public class ClearButton extends JButton {

    public ClearButton(){
        initButton();
    }
    public void initButton(){
        this.setBounds(50, 50, 50, 50);
        this.setBorderPainted(true);
        this.setFocusPainted(false);
        this.setForeground(Color.BLACK);
        this.setBorder(BorderFactory.createLineBorder(new Color(12,12,12),1,true));
        this.setFocusable(false);
        this.setFocusPainted(false);
    }
}