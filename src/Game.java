import javax.swing.*;

public class Game  extends JFrame{

    Board board;

    public Game(){


       // SetTitle("SNAKE");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);

        add(board);
        pack();
        board.setUp();

    }
    public static void main(String[] args){

        new Game();
    }



}
