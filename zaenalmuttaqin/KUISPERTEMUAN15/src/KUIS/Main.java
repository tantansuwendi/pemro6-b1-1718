/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KUIS;
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
