package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display_Panel extends JPanel {
    JButton new_game;


    public Display_Panel(){
        setBackground(Color.black);
        new_game = new JButton("New Game");
        add(new_game,BorderLayout.CENTER);

        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));
    }

    public void newGameActionListener(ActionListener listener) {
        new_game.addActionListener(listener);
    }
}
