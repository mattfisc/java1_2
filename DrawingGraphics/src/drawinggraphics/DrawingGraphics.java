/*
 * By:     Matthew Fischer
 * Date:   
 */
package drawinggraphics;

import javax.swing.JFrame;

/**
 *
 * @author Matthew Fischer
 */
public class DrawingGraphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Window w = new Window();
        JFrame f = new JFrame();
        
        f.add(w);
        f.setTitle("graphics");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);
        
    }
    
}
