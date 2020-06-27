/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App extends JFrame{
    Container content = this.getContentPane();

    Window_Panel game_panel;
    Display_Panel display_panel;

    public App(){

        game_panel = new Window_Panel();
        display_panel = new Display_Panel();

        setVisible(true);
        setTitle("moving ball");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);

        content.add(display_panel,BorderLayout.NORTH);
        content.add(game_panel,BorderLayout.CENTER);
    }
   
    public static void main(String[] args) {
        App game = new App();
    }
    
}
