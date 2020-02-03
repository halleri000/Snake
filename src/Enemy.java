
import java.awt.*;
public class Enemy {

    int x, y, diameter = 10;
    double dx = 4, dy = 4;


    public Enemy(){

        x = 10;
        y = 10;

    }

    public void paint(Graphics g) {
        g.fillOval(x, y, diameter, diameter);
    }
}