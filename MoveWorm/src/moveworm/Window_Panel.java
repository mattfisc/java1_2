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

public class Window_Panel extends JPanel implements KeyListener{
    //Timer t = new Timer(5, this);

    // position on board
    int x = 190;
    int y = 10;
    double velX = 5, velY = 5;
    String direction = "down";

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

        Ellipse2D worm = new Ellipse2D.Double(x,y,10,10);
        g2.fill(worm);

        //t.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent evt) {
        int keyCode = evt.getKeyCode();
        int d;
        if (evt.isShiftDown())
            d = 5;
        else
            d = 1;

        if (keyCode == KeyEvent.VK_LEFT)
            System.out.println(KeyEvent.VK_LEFT);

        else if (keyCode == KeyEvent.VK_RIGHT)
            System.out.println(KeyEvent.VK_LEFT);
        else if (keyCode == KeyEvent.VK_UP)
            System.out.println(KeyEvent.VK_LEFT);
        else if (keyCode == KeyEvent.VK_DOWN)
            System.out.println(KeyEvent.VK_LEFT);
        else
            System.out.println("else");
        y+= velY;
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // WIDTH OF BALL
//        if(x < 10 || x > 380){
//            game_over = true;
//        }
//        if(y < 10 || y > 380){
//            game_over = true;
//        }
//
//        // MOVE IF NO CHANGE
//        if(direction.equals("up") || direction.equals("down"))
//            y+= velY;
//        else
//            x+= velX;
//
//
//
//        repaint();
//
//    }



//    public boolean end_game(){
//        if(game_over == true)
//            // end game
//            //the game is over
//        else if(game_over == false)
//            // game continues
//
//    }
}
