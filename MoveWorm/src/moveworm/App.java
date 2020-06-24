/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;

public class App {
    Frame center;
    JFrame window;

    public App(){
        center = new Frame();
        window = new JFrame();

        window.add(center);
        window.setVisible(true);
        window.setTitle("moving ball");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
    }
   
    public static void main(String[] args) {
        App game = new App();

        
    }
    
}
