import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Board extends JPanel implements ActionListener  {

    Player player;
    Enemy enemy;
Timer timer;
    Long timedDelay;

    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(1024, 768));
        setBackground(Color.BLACK);
        timer = new Timer(1000/60, this);
        timer.start();

    }

    public void setUp(){
        player = new Player(this);
        enemy = new Enemy(this);
        timedDelay = System.currentTimeMillis();


    }


    @Override
    public void actionPerformed(ActionEvent e){
        player.move();
        enemy.move();
        repaint();
    }


    public void paintComponent (Graphics g){

        super.paintComponent(g);
        player.paint(g);
        enemy.paint(g);
    }


}
