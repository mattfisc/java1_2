/*
 * By:     Matthew Fischer
 * Date:   
 */
package shapes;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Matthew Fischer
 */
class Draw extends JPanel{
    
    public Draw(){
        
    }
    
    public void drawing(){
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillOval(50, 20, 100, 300);
        g.setColor(Color.blue);
        g.fillRect(200, 300, 3, 94);
    }
}
