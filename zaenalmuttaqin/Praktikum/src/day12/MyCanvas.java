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

    MyCanvas() {
        setSize(500, 500);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(250, 250, 100, 100);
        
        g.setColor(Color.red);
        g.drawRect(125, 250, 50, 50);
        
        //g.setColor(Color.BLUE);
        g.setColor(new Color(0,0,255));
        g.fillOval(375, 125, 50, 50);
        
        int x[] = {20,40,60,80,100,120,140,140,10};
        int y[] = {250,125,250,125,250,125,250,375,375};
        g.fillPolygon(x, y, 9);
    }
    
}
