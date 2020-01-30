import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionListener;


public class Board extends JPanel  {

    Player player;
    Food food;
    Timer timer;
    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(1024, 768));
        setBackground(Color.BLACK);
        //timer = new Timer(1000 / 60, this);
        timer.start();
    }

}
