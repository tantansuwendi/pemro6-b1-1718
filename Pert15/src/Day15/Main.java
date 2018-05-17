package Day15;
import java.awt.Frame;


public class Main {
    public static void main(String[] args) {
        MyCanvas cvs = new MyCanvas();
        Frame f = new Frame ("My Canvas");
        f.add(cvs);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}