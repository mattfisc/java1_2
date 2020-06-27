package moveworm;

import javax.swing.*;
import java.awt.*;

public class Display_Panel extends JPanel{
    JButton new_game;

    public Display_Panel(){
        setBackground(Color.black);
        new_game = new JButton("New Game");
        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));
        add(new_game,BorderLayout.CENTER);
    }
}
