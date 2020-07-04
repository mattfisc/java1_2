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
import java.awt.geom.Ellipse2D;

public class Board_Panel extends JPanel implements ActionListener,KeyListener{
    Timer t = new Timer(5, this);

    // position on board
    Worm w = new Worm();

    Graphics2D g2;
    boolean game_over;

    public Board_Panel(){
        game_over = false;
        setSize(400,400);
        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));
        setBackground(Color.black);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g2 = (Graphics2D) g;
        g2.setColor(Color.red);

        Ellipse2D worm = new Ellipse2D.Double(w.x,w.y,w.width,w.length);
        g2.fill(worm);

        t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("hello");
        int keyCode = e.getKeyCode();
        int d;
        if (e.isShiftDown())
            d = 5;
        else
            d = 1;
        System.out.println("keyTyped: "+e);
        if (keyCode == KeyEvent.VK_LEFT)
            System.out.println("keyTyped: "+e);

        else if (keyCode == KeyEvent.VK_RIGHT)
            System.out.println("keyTyped: "+e);
        else if (keyCode == KeyEvent.VK_UP)
            System.out.println("keyTyped: "+e);
        else if (keyCode == KeyEvent.VK_DOWN)
            System.out.println("keyTyped: "+e);


        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // WIDTH OF BALL
        if(w.x < 10 || w.x > 280){
            game_over = true;
        }
        if(w.y < 10 || w.y > 280){
            game_over = true;
        }

        // MOVE IF NO CHANGE
        if(w.direction.equals("up") || w.direction.equals("down"))
            w.y+= w.velY;
        else if(w.direction.equals("left") || w.direction.equals("right"))
            w.x+= w.velX;

        repaint();
    }



//    public boolean end_game(){
//        if(game_over == true)
//            // end game
//            //the game is over
//        else if(game_over == false)
//            // game continues
//
//    }

}
