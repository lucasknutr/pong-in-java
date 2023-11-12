import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Ball extends Rectangle{
    // How a ball is represented in the game
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 3;
    Ball(int x, int y, int width, int height) {
        // How the ball is represented
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection == 0)
            randomXDirection--;
        setXDirection(randomXDirection*initialSpeed);

        int randomYDirection = random.nextInt(2);
        if(randomYDirection == 0)
            randomYDirection--;
        setYDirection(randomYDirection*initialSpeed);

    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;
    }
    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;
    }
    public void move() {
        // How the game is moved
        x += xVelocity;
        y += yVelocity;
    }
    public void draw(Graphics g) {
        // How the game is drawn
        g.setColor(Color.white);
        g.fillOval(x, y, width, height);
    }
}
