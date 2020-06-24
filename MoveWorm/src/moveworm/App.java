/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;

public class App {

   
    public static void main(String[] args) {
        Frame w = new Frame();
        JFrame f = new JFrame();
        
        f.add(w);
        f.setVisible(true);
        f.setTitle("moving ball");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 600);
        
    }
    
}
