/*
 * By:     Matthew Fischer
 * Date:   
 */
package dealahand;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matthew Fischer
 */
public class Display extends JFrame implements ActionListener{
    Deck deck;
    
    Container content = this.getContentPane();
    
    JPanel top = new JPanel();
    JPanel bottom = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    
    // left panel
    JLabel l = new JLabel("left computer");
    JLabel[] displayComp1Hand = new JLabel[5];
    
    
    // right panel
    JLabel r = new JLabel("right computer");
    JLabel[] displayComp2Hand = new JLabel[5];
    
    
    // top panel
    JButton deal = new JButton("Deal a Hand");
    JButton reset = new JButton("START NEW GAME");
    
    JLabel status = new JLabel("Start of Game");
    
    // bottom panel
    JLabel[] displayHand = new JLabel[5];
    
    
    public Display(){
        
        createWindow();
        
        // deck created
        deck = new Deck();
        deck.populate();
        deck.shuffle();
        
        //content
        content.setBackground(Color.black);
        
        // status
        status.setBackground(Color.green);
        status.setForeground(Color.red);
        content.add(status,BorderLayout.NORTH);
        
        Draw object = new Draw();
        top.add(object);
        // top panel
        
        top.add(new JLabel("Push to deal a hand"));
        top.add(deal);
        top.add(reset);
        
        content.add(top,BorderLayout.CENTER);
        deal.addActionListener(this);
        reset.addActionListener(this);
        
        
        // bottom panel
        
        bottom.setLayout(new GridLayout(1,5,10,10));
        bottom.setSize(1000, 100);
        bottom.setBackground(Color.white);
        
        content.add(bottom,BorderLayout.SOUTH);
        
        // player hand
        for(int row = 0; row < 5; row++){
            displayHand[row] = new JLabel("empty");
            displayHand[row].setForeground(Color.blue);
            bottom.add(displayHand[row]);
        }
        
        
        // left panel
        left.add(l);
        left.add(new JLabel(""));
        left.setLayout(new GridLayout(5,1,10,10));
        left.setBackground(Color.red);
        
        // display computer 1
        for(int row = 0; row < 5; row++){
            displayComp1Hand[row] = new JLabel("empty");
            displayComp1Hand[row].setForeground(Color.blue);
            left.add(displayComp1Hand[row]);
        }
        
        content.add(left,BorderLayout.WEST);
        
        // right panel
        right.add(r);
        right.add(new JLabel(""));
        right.setLayout(new GridLayout(5,1,3,3));
        right.setBackground(Color.yellow);
        content.add(right,BorderLayout.EAST);
        
        // display computer 2
        for(int row = 0; row < 5; row++){
            displayComp2Hand[row] = new JLabel("empty");
            displayComp2Hand[row].setForeground(Color.blue);
            right.add(displayComp2Hand[row]);
        }
    }
    
    
    public void createWindow(){
        // create program window
        this.setVisible(true);// set window visible
        this.setSize(1000,500);// set window size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set window will close on exiting button
        this.setTitle("Deal a Hand of Cards");// set window title
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
            
    }
    
    
}
