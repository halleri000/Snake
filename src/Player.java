import java.awt.*;
public class Player {

    int x, y;
    final int width = 20, height = 40;
    double dx = 3, dy = 4;
    Game game;
    Board board;

    public Player(Board board){
        this.x = x - width/2;
        this.y= y - height/2;
    }

    public void move(){

        x+=dx;
        y+=dy;
        }




    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
    }

}
