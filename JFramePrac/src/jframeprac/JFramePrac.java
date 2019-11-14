/*
 * By:     Matthew Fischer
 * Date:   
 */
package jframeprac;

import javax.swing.*;
import java.awt.*;

public class JFramePrac{

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Display());
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    
}
