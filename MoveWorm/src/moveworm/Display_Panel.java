package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display_Panel extends JPanel implements ActionListener {
    JButton new_game;

    public Display_Panel(){
        setBackground(Color.black);
        new_game = new JButton("New Game");
        new_game.addActionListener();
        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));
        add(new_game,BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
