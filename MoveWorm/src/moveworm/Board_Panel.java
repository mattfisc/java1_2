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

    JLabel status;

    // Worm
    Worm w = new Worm();
    String direction;
    Graphics2D g2;

    boolean game_over;

    public Board_Panel(){
        direction = "start";
        status = new JLabel("Use arrows to start the Game");
        status.setForeground(Color.lightGray);

        add(status,BorderLayout.NORTH);

        game_over = false;

        setBorder(BorderFactory.createEtchedBorder(3,Color.blue,Color.darkGray));
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
        if(!game_over){
            int keycode = e.getKeyCode();
            if(keycode == KeyEvent.VK_UP && !direction.equals("down"))
                direction = "up";
            else if(keycode == KeyEvent.VK_DOWN && !direction.equals("up"))
                direction = "down";
            else if(keycode == KeyEvent.VK_LEFT && !direction.equals("right"))
                direction = "left";
            else if(keycode == KeyEvent.VK_RIGHT && !direction.equals("left"))
                direction = "right";

            status.setText("Eat the food");

            repaint();//add this line to update the UI
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(w.x < 5 || w.x > 395)
            game_over = true;

        if(w.y < 5 || w.y > 395)
            game_over = true;

        if(direction.equals("up"))
            w.y -= w.velY;
        else if(direction.equals("down"))
            w.y += w.velY;
        else if(direction.equals("left"))
            w.x -= w.velX;
        else if(direction.equals("right"))
            w.x += w.velX;

        if(!game_over)
            repaint();
        else
            status.setText("You died");
    }

}
