import java.awt.*;
public class Player {

    int x, y;
    final int width = 20, height = 40;
    double dx = 4, dy = 4;

    public Player(Board board){

            x = board.getWidth() / 2;
            y = board.getHeight() / 2;
    }


    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, width, height);
    }

}
