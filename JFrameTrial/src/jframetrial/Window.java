/*
 * By:     Matthew Fischer
 * Date:   
 */
package jframetrial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

/**
 *
 * @author Matthew Fischer
 */
public class Window extends JFrame implements ActionListener, MouseListener{
    
    Container content = this.getContentPane();
    
    JPanel left = new JPanel();
    JPanel center = new JPanel();
    
    
    JButton green = new JButton("green");
    JButton yellow = new JButton("yellow");
    JButton red = new JButton("red");
    
    public Window(){
        
        // create window
        createWindow();
        
        // left panel
        left.setBackground(Color.black);
        left.setLayout(new GridLayout(3,1,10,10));
        
        // buttons
        green.setSize(100, 100);
        left.add(green);
        green.addActionListener(this);
        
        left.add(yellow);
        yellow.addActionListener(this);
        left.add(red);
        red.addActionListener(this);
        
        // right panel
        center.setBackground(Color.gray);
        
        // add panels
        content.add(left,BorderLayout.WEST);
        content.add(center,BorderLayout.CENTER);
    }
    
    // create window
    public void createWindow(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setTitle("trial");
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == green){
            center.setBackground(Color.green);
        }
        else if(e.getSource() == yellow){
            center.setBackground(Color.yellow);
        }
        else{
            // red
            center.setBackground(Color.red);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == green)
            green.setForeground(Color.green);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
