/*
 * By:     Matthew Fischer
 * Date:   
 */
package drawjframe;

import javax.swing.*;
import java.awt.*;



public class DrawJFrame extends JFrame{ 
    
    Container content = this.getContentPane();

    
    private JPanel panel = new JPanel();
    
    public static void main(String[] args) {
        DrawJFrame f = new DrawJFrame();
        
    }
    
    public DrawJFrame(){
        
        this.createWindow();
        content.add(panel,BorderLayout.CENTER);
        panel.setBackground(Color.black);
        
    }
    
    public void createWindow(){
        this.setSize(500, 500);
        this.setTitle("draw objects");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        
        
    }
    
    public void drawing(){
        repaint();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        
        g.setColor(Color.red);
        g.fillOval(100, 100, 50, 80);
        g.drawRect(150, 100, 200, 350);
    }
    
}
