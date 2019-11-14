/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import java.awt.*;

public class MovingBall {

   
    public static void main(String[] args) {
        Window w = new Window();
        JFrame f = new JFrame();
        
        f.add(w);
        f.setVisible(true);
        f.setTitle("moving ball");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(620, 440);
        
    }
    
}
