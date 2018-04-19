/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

/**
 *
 * @author STUDENT
 */
public class Caller {
    
    public void register(CallBack callback) {
        callback.methodToCallback();
    }
    
    public static void main(String[] args) {
        // Contoh 1
        Caller c = new Caller();
        CallBack callback = new CallBackimp1();
        c.register(callback);
        
        // Contoh 2
        c.register(new CallBack() {

            @Override
            public void methodToCallback() {
                System.out.println("Callback 2");
            }  
        });
        
    }
}
