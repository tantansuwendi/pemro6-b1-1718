package Day15;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MyCanvas extends Canvas{
    public MyCanvas(){
        setSize(300, 300);
    } 
    @Override
    public void paint(Graphics g){
        
        g.setColor(Color.green);
        g.fillRect(0, 0, 200, 100);
        g.setColor(Color.blue);
        g.fillRect(200, 0, 100, 200);
        g.setColor(Color.yellow);
        g.fillRect(100, 200, 200, 100);
        g.setColor(Color.red);
        g.fillRect(0, 100, 100, 200);
    }
}

