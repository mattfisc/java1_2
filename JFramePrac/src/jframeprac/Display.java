/*
 * By:     Matthew Fischer
 * Date:   
 */
package jframeprac;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Display extends JPanel implements ActionListener{
    
    private JButton print;
    private JLabel label;
    private JSlider slider;
    
    public Display(){
        print = new JButton("Print");
        label = new JLabel("Hit this button to print to the console");
        slider = new JSlider(0,10);
        
        setPreferredSize(new Dimension(245,136));
        setLayout(null);
        
        add(print);
        add(label);
        add(slider);
        
        print.setBounds(70,10,100,25);
        label.setBounds(20,45,210,35);
        slider.setBounds(15,80,210,35);
        
        print.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == print){
            System.out.println("We pressed the button");
            System.out.println("The value of our slider is " + slider.getValue());
        }
    }
    
    
    
}
