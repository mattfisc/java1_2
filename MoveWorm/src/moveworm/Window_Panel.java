/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class WindowFrame extends JPanel implements ActionListener{
    
    Timer t = new Timer(5, this);
    int x = 10;
    int y = 10;
    double velX = .5, velY = .5;
    Graphics2D g2;


    public WindowFrame(){

        setBackground(Color.black);
        setSize(300,300);

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
        if(x < 10 || x > 280){
            velX = -velX;
        }
        if(y < 10 || y > 280){
            velY = -velY;
        }
        x+= velX;
        y+= velY;
        repaint();

    }
        
}
