/*
 * By:     Matthew Fischer
 * Date:   
 */
package draw;

import javax.swing.*;

/**
 *
 * @author Matthew Fischer
 */
public class DrawingFrame extends JFrame{
    
    private DrawingPanel basePanel;
    private DrawingController baseController;
    
    public DrawingFrame(DrawingController baseController){
        
        this.baseController = baseController;
        basePanel = new DrawingPanel(baseController);
        setUpFrame();
        
    }
    
    private void setUpFrame(){
        this.setTitle("graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setVisible(true);
    }
}
