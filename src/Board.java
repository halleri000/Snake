import javax.swing.*;
import java.awt.*;

//import java.awt.event.ActionListener;


public class Board extends JPanel  {

    Player player;
    Enemy enemy;

    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(1024, 768));
        setBackground(Color.BLACK);

    }

    public void setUp(){
        player = new Player(this);
    }


    public void paintComponent (Graphics g){
        super.paintComponent(g);
        player.paint(g);
    }

}
