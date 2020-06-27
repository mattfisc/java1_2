package moveworm;

import javax.swing.*;
import java.awt.*;

public class Display_Panel extends JPanel{
    JButton new_game;

    public Display_Panel(){
        setBackground(Color.black);
        new_game = new JButton("New Game");

        add(new_game,BorderLayout.CENTER);
    }
}
