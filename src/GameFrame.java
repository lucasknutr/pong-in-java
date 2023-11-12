import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class GameFrame extends JFrame{
    // The window frame that has "minimize/maximize buttons", etc.
    GamePanel panel;
    GameFrame() {
        // How the game is represented
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
