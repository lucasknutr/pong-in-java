import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class GamePanel extends JPanel implements Runnable{
    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (5/9));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
    static final int BALL_DIAMETER = 20;
    static final int PADDLE_WIDTH = 25;
    static final int PADDLE_HEIGHT = 100;
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;
    GamePanel() {
        // How the game is represented
    }
    public void newBall() {
        // How a new ball is created
    }
    public void newPaddles() {
        // How a new paddle is created
    }
    public void paintComponent(Graphics g) {
        // How the game is painted
    }
    public void draw(Graphics g) {
        // How the game is drawn
    }
    public void move() {
        // How the game is moved
    }
    public void checkCollision() {
        // How the game checks for collisions
    }
    public void run() {
        // How the game is run
    }
    public class AL extends KeyAdapter {
        // How the game handles key presses
        public void keyPressed(KeyEvent e) {
            // How the game handles key presses
        }
        public void keyReleased(KeyEvent e) {
            // How the game handles key releases
        }
    }
}
