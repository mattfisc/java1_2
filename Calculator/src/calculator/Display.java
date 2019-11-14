/*
 * By:     Matthew Fischer
 * Date:   
 */
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Matthew Fischer
 */
public class Display extends JFrame implements ActionListener{
    Container content = this.getContentPane();
    
    JButton[] b = new JButton[20];
    
    JLabel label = new JLabel("0");
    
    JPanel top = new JPanel();
    JPanel bottom = new JPanel();
    JPanel center = new JPanel();
    
    Calculate calculator;
    
    String num1 = "";
    String num2 = "";
    char sign = ' ';
    boolean reset = true;

    public Display(){
        
        createWindow();
        content.setLayout(new GridLayout(2,1,2,2));
        
        label.setBackground(Color.black);
        
        center.setLayout(new GridLayout(5,5,1,1));
        bottom.setLayout(new GridLayout(1,2,1,1));
        // row 1
        label.setPreferredSize(new Dimension(150,30));
        top.add(label);
        
        content.add(top,BorderLayout.NORTH);
        
        b[0] = new JButton("Clear");
        b[0].addActionListener(this);
        bottom.add(b[0]);
        b[1] = new JButton("=");
        b[1].addActionListener(this);
        bottom.add(b[1]);
        
        
        // row 2
        b[4] = new JButton("1");
        b[5] = new JButton("2");
        b[6] = new JButton("3");
        b[7] = new JButton("/");
        
        //row 3
        b[8] = new JButton("4");
        b[9] = new JButton("5");
        b[10] = new JButton("6");
        b[11] = new JButton("*");
        
        // row 4
        b[12] = new JButton("7");
        b[13] = new JButton("8");
        b[14] = new JButton("9");
        b[15] = new JButton("-");
        
        b[16] = new JButton("(");
        b[17] = new JButton("0");
        b[18] = new JButton(")");
        b[19] = new JButton("+");
        
        for(int i = 4; i < b.length;i++){
            center.add(b[i]);
            b[i].addActionListener(this);
            
        }
        
        content.add(center,BorderLayout.CENTER);
        content.add(bottom,BorderLayout.SOUTH);
        pack();
       
    }
    
    // create window
    public void createWindow(){
        this.setSize(1000, 1000);
        this.setVisible(true);
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        // equal
        if(e.getSource() == b[1] ){
            num2 = label.getText();
            calculator = new Calculate(num1, num2, sign);
            calculator.getAnswer();
            label.setText( calculator.toString() );
            num1 = "";
            num2 = "";
            reset = true;
            
            
        }
        // clear
        else if(e.getSource() == b[0])
            label.setText("0");
        // signs
        else if(e.getSource() == b[7] || e.getSource() == b[11] || e.getSource() == b[15] || e.getSource() == b[19]){
            if(num1.equals("")){
                num1 = label.getText();
                label.setText("");
                sign = e.getActionCommand().charAt(0);
                
            }
            else
                label.setText("0");
        }
        // numbers
        else {
            if(reset == true){
                label.setText("");
                reset = false;
            }
            
            label.setText(label.getText() + e.getActionCommand());
            
        }
    }
    
    
    
}
