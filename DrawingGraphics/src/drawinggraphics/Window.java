/*
 * By:     Matthew Fischer
 * Date:   
 */
package drawinggraphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Matthew Fischer
 */
public class Window extends JPanel {
    
    public Window(){
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
//        Line2D line = new Line2D.Double(0,30,600,40);
        Rectangle2D rectangle = new Rectangle2D.Double(200,120,30,30);
//        Ellipse2D oval = new Ellipse2D.Double(400,200,40,60);
//        g2.draw(line);
//        g2.setPaint(Color.red);
        g2.fill(rectangle);
        g2.setPaint(Color.orange);
//        g2.fill(oval);
        
    }
    
    // methods
    
}
