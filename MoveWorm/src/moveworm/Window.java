/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class Window extends JPanel implements ActionListener{
    
    Timer t = new Timer(5, this);
    double x = 50,y = 50, velX = 5, velY = 5;
    Graphics2D g2;
    
    public Window(){
        setBackground(Color.black);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
        g2.fill(circle);
        
       
        t.start();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // subtract ball size
        if(x < 50 || x > 530){
            velX = -velX;
        }
        if(y < 50 || y > 310){
            velY = -velY;
        }
        x+= velX;
        y+= velY;
        repaint();
              
    }
        
}
