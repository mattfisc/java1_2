package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display_Panel extends JPanel {
    JButton new_game;
    Display_Panel listener;

    public Display_Panel(){
        setBackground(Color.black);
        new_game = new JButton("New Game");
        add(new_game,BorderLayout.CENTER);


        new_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));

    }


}
