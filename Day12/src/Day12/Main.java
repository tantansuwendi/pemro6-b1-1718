/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;
import java.awt.Frame;


public class Main {
    public static void main(String[] args) {
        MyCanvas cvs = new MyCanvas();
        Frame f = new Frame ("My Canvas");
        f.add(cvs);
        f.setSize(500, 500);
        f.setVisible(true);
    }
}
