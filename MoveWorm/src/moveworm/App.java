/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App extends JFrame {
    Container content = this.getContentPane();

    Board_Panel board;
    Display_Panel display;

    Worm worm;

    public App(){

        board = new Board_Panel();
        display = new Display_Panel();
        worm = new Worm();

        setVisible(true);
        setTitle("WormGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        content.add(display,BorderLayout.SOUTH);
        content.add(board,BorderLayout.CENTER);
        addKeyListener(board);

        board.setFocusable(true);
    }
   
    public static void main(String[] args) {
        App game = new App();
    }

}
