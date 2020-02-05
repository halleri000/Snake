
import java.awt.*;
public class Enemy {

    int x, y, diameter = 10;
    double dx = 4, dy = 4;
    Board board;



    public Enemy(Board board){

        x = 10;
        y = 10;

    }

public void move(){
        x+=dx;
        y+=dy;
}

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDiameter() {
        return diameter;
    }

    public void paint(Graphics g) {
        g.fillOval(x, y, diameter, diameter);
    }
}