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

public class Window_Panel extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(5, this);

    // position on board
    int x = 10;
    int y = 10;
    double velX = .5, velY = .5;
    String direction = "down";

    Graphics2D g2;
    boolean game_over;

    public Window_Panel(){
        game_over = false;

        setBackground(Color.black);
        setSize(300,300);
        setLayout();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Ellipse2D worm = new Ellipse2D.Double(x,y,10,10);
        g2.fill(worm);

        t.start();

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // subtract ball size 50
        if(x < 10 || x > 290){
            game_over = true;
        }
        if(y < 10 || y > 290){
            game_over = true;
        }
        if(direction.equals("up") || direction.equals("down")){
            y+= velY;
        }
        else if(direction.equals("right") || direction.equals("left")){
            x+= velX;
        }


        repaint();

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // alt code
        if(e.getKeyCode() == KeyEvent.VK_LEFT && direction.equals("left")){
            direction = "left";
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN && direction.equals("down")){
            direction = "down";

        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT && direction.equals("right")){
            direction = "right";
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP && direction.equals("up")){
            direction = "up";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

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
