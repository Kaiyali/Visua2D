package Aegean2DMath.GUI.Manager;

import Aegean2DMath.GUI.Base.SystemSetup.BottomGUI;
import Aegean2DMath.GUI.Base.SystemSetup.ColorPalettePanel;
import Aegean2DMath.GUI.Base.SystemSetup.FrameSystem;
import Aegean2DMath.GUI.Base.SystemSetup.SideGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:46 AM
 */
public class Application extends JComponent {

    public JFrame Window = new FrameSystem();
    public JPanel bottomPanel = new BottomGUI();
    public JPanel sidePanel = new SideGUI();
    public JPanel colorPalettePanel = new ColorPalettePanel();

    public Application() {
        attributes();
    }

    public void attributes() {
        Window.add(bottomPanel, BorderLayout.SOUTH);
        Window.add(sidePanel, BorderLayout.WEST);
        bottomPanel.add(colorPalettePanel, BorderLayout.WEST);
        Window.setVisible(true);
    }
}
