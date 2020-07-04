/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App extends JFrame{
    Container content = this.getContentPane();

    Board_Panel board;
    Display_Panel display;

    Worm worm;

    public App(){
        board = new Board_Panel();
        board.setPreferredSize(new Dimension(400,400));

        display = new Display_Panel();
        display.setPreferredSize(new Dimension(400,50));
        display.newGameActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                remove(board);
                board = new Board_Panel();
                content.add(board,BorderLayout.CENTER);

                addKeyListener(board);
                board.setFocusable(true);
                requestFocusInWindow();

                worm = new Worm();

                revalidate();
                repaint();
            }
        });

        worm = new Worm();

        setTitle("Worm Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);


        content.add(display,BorderLayout.SOUTH);
        content.add(board,BorderLayout.CENTER);

        addKeyListener(board);

        board.setFocusable(true);
        requestFocusInWindow();

        pack();

    }
   
    public static void main(String[] args) {
        App game = new App();
    }


}
