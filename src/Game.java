import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game  extends JFrame{

    Board board;

    public Game(){


       // SetTitle("SNAKE");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);

        add(board);

    }



}
