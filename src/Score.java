import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Score extends Rectangle{
    // How the score is represented
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;
    Score(int GAME_WIDTH, int GAME_HEIGHT) {
        // How the score is represented
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }
    public void draw(Graphics G){
        G.setColor(Color.white);
        G.setFont(new Font("Consolas", Font.PLAIN,60));

        G.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);
        G.drawString(String.valueOf(player1/10) + String.valueOf(player1%10), (GAME_WIDTH/2) - 85, 50);
        G.drawString(String.valueOf(player2/10) + String.valueOf(player2%10), (GAME_WIDTH/2) + 20, 50);
    }
}
