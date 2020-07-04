/*
 * By:     Matthew Fischer
 * Date:   
 */
package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    Container content = this.getContentPane();

    Board_Panel game_panel;
    Display_Panel display_panel;


    public App(){

        game_panel = new Board_Panel();
        display_panel = new Display_Panel();

        setVisible(true);
        setTitle("WormGame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        content.add(display_panel,BorderLayout.NORTH);
        content.add(game_panel,BorderLayout.CENTER);

        game_panel.addKeyListener(game_panel);
        game_panel.setFocusable(true);
    }
   
    public static void main(String[] args) {
        App game = new App();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == "new_game")
            System.out.println("hello");
        content.add(new Board_Panel(),BorderLayout.CENTER);
    }
}
