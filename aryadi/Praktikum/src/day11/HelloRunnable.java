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
public class HelloRunnable implements Runnable{
    
    @Override
    public void run() {
        System.out.println("Hello from a thread!");
    }
}
