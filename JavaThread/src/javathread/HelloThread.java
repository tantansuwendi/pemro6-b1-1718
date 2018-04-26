/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javathread;

/**
 *
 * @author hp
 */
public class HelloThread extends Thread{
    
    @Override
    public void run(){
        System.out.println("Hello Thread 2");
    }        
    
}
