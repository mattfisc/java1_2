package moveworm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Display_Panel extends JPanel {
    JButton new_game;
    Display_Panel listener;

    Boolean reset;
    public Display_Panel(){
        reset = false;

        setBackground(Color.black);
        new_game = new JButton("New Game");
        add(new_game,BorderLayout.CENTER);


        new_game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset = true;
                System.out.println(reset);
            }
        });

        setBorder(BorderFactory.createEtchedBorder(Color.darkGray,Color.blue));

    }

    public Boolean getReset() {
        return reset;
    }

    public void setReset(Boolean reset) {
        this.reset = reset;
    }
}
