/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealahand;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Matthew Fischer
 */
public class Draw extends JPanel{
    
    public void drawing(){
        
    }
    
    public void paintCompenent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(5, 10, 100, 400);
    }
}
