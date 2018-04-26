/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package day11;

/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Main");
        Thread t = new Thread(new HelloRunnable());
        t.start();
        
        Thread t2 = new HelloThread();
        t2.start();
        
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        System.out.println("Pause");
    }
}
