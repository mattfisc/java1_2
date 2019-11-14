/*
 * By:     Matthew Fischer
 * Date:   
 */
package draw;

import java.awt.Color;
import java.awt.*;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Matthew Fischer
 */
class DrawingPanel extends JPanel{
    
    private DrawingController baseController;
    //private ShapePanel shapePanel;
    private JButton addRectangleButton;
    private SpringLayout baseLayout;
    private ArrayList<Rectangle> rectangleList;
    private ShapePanel shapePanel;
    
    public DrawingPanel(DrawingController baseController){
        
        this.baseController = baseController;
        baseLayout = new SpringLayout();
        addRectangleButton = new JButton("Add a Rectangle");
        rectangleList = new ArrayList<Rectangle>();
        shapePanel = new ShapePanel();
        
        setupPanel();
        setupLayout();
        setupListeners();
        
    }
    
    
    private void setupPanel(){
        this.setLayout(baseLayout);
        this.setBackground(Color.DARK_GRAY);
        this.add(addRectangleButton);
        
        this.add(shapePanel);
    }
    private void setupLayout(){
        baseLayout.putConstraint(SpringLayout.WEST, addRectangleButton, 10, SpringLayout.WEST, this);
    }
    private void setupListeners(){
        addRectangleButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent click){
                int xPosition = (int)(Math.random() * getWidth());
                int yPosition = (int)(Math.random() * getHeight());
                int width = (int)(Math.random() * 100);
                int height = (int)(Math.random() * 100);
                
                rectangleList.add(new Rectangle(xPosition, yPosition,width,height));
                
                repaint();
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics currentGraphics){
        super.paintComponent(currentGraphics);
        
        Graphics2D mainGraphics = (Graphics2D) currentGraphics;
        mainGraphics.setStroke(new BasicStroke(2));
        mainGraphics.setColor(Color.orange);
        
        mainGraphics.drawRect(70, 50, 200, 20);
        
        for(Rectangle current : rectangleList){
            int red = (int)(Math.random() * 256);
            int green = (int)(Math.random() * 256);
            int blue = (int)(Math.random() * 256);
            
            mainGraphics.setColor(new Color(red,green,blue));
            mainGraphics.fill(current);
        }
    }
}
