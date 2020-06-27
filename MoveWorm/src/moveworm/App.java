/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App {
    Window_Panel game_panel;
    JFrame window;
    JPanel display;

    public App(){
        window = new JFrame();
        game_panel = new Window_Panel();

        window.add(game_panel);
        window.setVisible(true);
        window.setTitle("moving ball");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 600);



    }
   
    public static void main(String[] args) {
        App game = new App();
    }
    
}
