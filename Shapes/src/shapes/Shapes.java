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
public class Shapes {

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setVisible(true);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Draw object = new Draw();
        frame.add(object);
        
        object.drawing();

    }
    
}
