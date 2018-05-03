package Day12;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas{
    public MyCanvas(){
        setSize(500, 500);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillRect(250, 250, 100, 100);
        
//        g.setColor(Color.red);
          g.drawRect(125, 250, 50, 50);
        
        g.setColor(Color.blue);
        g.fillOval(375, 125, 50, 50);
        
        int x[] = {20,  40,  60,  80,  100, 120, 140, 140, 20};
        int y[] = {250, 125, 250, 125, 250, 125, 250, 375, 375};
        
        g.fillPolygon(x,y,9);
    }
}
