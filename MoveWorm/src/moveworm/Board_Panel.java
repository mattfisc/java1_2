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

import java.util.Random;

public class Board_Panel extends JPanel implements ActionListener,KeyListener{
    Timer t = new Timer(5, this);

    int level;
    Food[] food_list;
    int food_index;
    Graphics2D food;

    JLabel status;

    // Worm
    Worm w = new Worm();
    String direction;
    Graphics2D g2;



    boolean game_over;


    public Board_Panel(){

        level = 1;
        food_list = new Food[20];

        food_index = 0;

        direction = "start";
        status = new JLabel("Use arrows to start the Game");
        status.setForeground(Color.lightGray);
        add(status,BorderLayout.NORTH);

        game_over = false;

        setBackground(Color.black);

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g2 = (Graphics2D) g;
        g2.setColor(Color.GREEN);

        Ellipse2D worm = new Ellipse2D.Double(w.x,w.y,w.width,w.length);
        g2.fill(worm);

        // Check if eatten food


        // paint old food or new food
        if(food_list[food_index] == null){
            // initialize
            food_list[food_index] = new Food();

            // paint food
            food = (Graphics2D) g;
            food.setColor(Color.ORANGE);
            Ellipse2D f = new Ellipse2D.Double(food_list[food_index].x,
                    food_list[food_index].y,
                    10, 10);
            food.fill(f);
        }
        // food eatten
        else if(food_list[food_index].eatten == true) {
            food_index++;
        }
        // food not eatten
        else{

        }

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
        // minus worm width 10

        if(w.x < 0 || w.x > 390)
            game_over = true;

        if(w.y < 0 || w.y > 390)
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
