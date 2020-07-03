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

public class Window_Panel extends JPanel implements ActionListener,KeyListener{
    Timer t = new Timer(5, this);

    // position on board
    Worm w = new Worm(190,10);

    Graphics2D g2;
    boolean game_over;

    public Window_Panel(){
        game_over = false;
        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));
        setBackground(Color.black);
        addKeyListener(this);
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
    public void keyPressed(KeyEvent evt) {
        System.out.println("hello");
        int keyCode = evt.getKeyCode();
        int d;
        if (evt.isShiftDown())
            d = 5;
        else
            d = 1;

        if (keyCode == KeyEvent.VK_LEFT)
            w.direction = "left";

        else if (keyCode == KeyEvent.VK_RIGHT)
            w.direction = "right";
        else if (keyCode == KeyEvent.VK_UP)
            w.direction = "up";
        else if (keyCode == KeyEvent.VK_DOWN)
            w.direction = "down";


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
        else
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
