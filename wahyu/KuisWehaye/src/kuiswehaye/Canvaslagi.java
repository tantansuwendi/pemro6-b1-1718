/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kuiswehaye;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author hp
 */
public class Canvaslagi extends Canvas{
    public Canvaslagi(){
        setSize(300, 300);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(0, 0, 150, 150);
        
        g.setColor(Color.red);
        g.fillRect(0, 150, 150, 150);
        
        g.setColor(Color.yellow);
        g.fillRect(150, 150, 150, 150);
        
        g.setColor(Color.blue);
        g.fillRect(150, 0, 150, 150);
        
        g.setColor(Color.white);
        int[] x={10,40,70};
        int[] y={150,30,150};
        Polygon segitiga=new Polygon(x,y,3);
        g.fillPolygon(segitiga);
        
        
        g.setColor(Color.black);
        g.fillOval(50, 50, 200, 200);
        
    }
    
}
