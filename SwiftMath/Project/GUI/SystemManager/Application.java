package SwiftMath.Project.GUI.SystemManager;

import SwiftMath.Project.GUI.System.AppSystem.BottomGUI;
import SwiftMath.Project.GUI.System.AppSystem.ColorPalettePanel;
import SwiftMath.Project.GUI.System.AppSystem.FrameSystem;
import SwiftMath.Project.GUI.System.AppSystem.SideGUI;
import SwiftMath.Project.Resources.ShapeGraphics.ShapeManager.ShapePanel;

import javax.swing.*;
import java.awt.*;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:46 AM
 */
public class Application extends JComponent {

    public static JFrame Window = new FrameSystem();
    public static JPanel bottomPanel = new BottomGUI();
    public static JPanel sidePanel = new SideGUI();
    public static JPanel colorPalettePanel = new ColorPalettePanel();
    public static JPanel shapepanel = new ShapePanel();


    public Application() {
        attributes();
    }

    public void attributes() {
        Window.add(bottomPanel, BorderLayout.SOUTH);
        Window.add(sidePanel, BorderLayout.WEST);
        Window.add(shapepanel, BorderLayout.CENTER);
        bottomPanel.add(colorPalettePanel, BorderLayout.WEST);
        Window.setVisible(true);
    }
}
