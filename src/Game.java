import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class Game  extends JFrame implements KeyListener{

    Board board;
    boolean upPressed, rightPressed, leftPressed;

    public Game(){


       // SetTitle("SNAKE");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);

        add(board);
        addKeyListener(this);
        pack();
        board.setUp();

    }
    public static void main(String[] args){

        new Game();
    }

    @Override
    public void keyTyped(KeyEvent e){

    }



    @Override
    public void keyPressed(KeyEvent e){

        if(e.getKeyCode() == VK_LEFT){
            leftPressed = true;
        }
        if(e.getKeyCode() == VK_RIGHT){
            rightPressed = true;
        }
        if(e.getKeyCode() == VK_UP){
            upPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        if(e.getKeyCode() == KeyEvent.VK_UP){
            upPressed = false;
        }
        if(e.getKeyCode() == VK_LEFT){
            leftPressed = false;
        }
        if(e.getKeyCode() == VK_RIGHT){
            rightPressed = false;
        }
    }

    public boolean isUpPressed(){
        return upPressed;
    }

    public boolean isLeftPressed(){
        return leftPressed;
    }

    public boolean isRightPressed(){
        return rightPressed;
    }


}
