/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class Frame extends JPanel implements ActionListener{
    
    Timer t = new Timer(5, this);
    double x = 50,y = 50, velX = 1, velY = 1;
    Graphics2D g2;
    
    public Frame(){
        setBackground(Color.black);
        setSize(300,300);
        BorderLayout layout = new BorderLayout();
        layout.setHgap(10);
        layout.setVgap(10);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        g2.setColor(Color.red);
        Ellipse2D circle = new Ellipse2D.Double(x,y,50,50);
        g2.fill(circle);
        
       
        t.start();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // subtract ball size 50
        if(x < 50 || x > 550){
            velX = -velX;
        }
        if(y < 50 || y > 550){
            velY = -velY;
        }
        x+= velX;
        y+= velY;
        repaint();
              
    }
        
}
