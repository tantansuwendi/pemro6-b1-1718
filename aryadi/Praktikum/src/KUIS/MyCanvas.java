/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author STUDENT
 */
public class MyCanvas extends Canvas {
    
    public MyCanvas() {
        setSize(300, 300);
    }
    
    @Override
    public void paint (Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 200, 100);
        
        g.setColor(Color.BLUE);
        g.fillRect(200, 0, 100, 200);
        
        g.setColor(Color.RED);
        g.fillRect(0, 100, 100, 200);
        
        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 100);
        
       
    }
}
