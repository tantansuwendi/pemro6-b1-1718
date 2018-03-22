/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day6;

/**
 *
 * @author hp
 */
public class Car extends Vehicle{
    
    public Car(){
        System.out.println("this is Car");
    }
    void retreat(){
        System.out.println("Mundur");
    }
    // overriding method
    @Override
    void brake(){
        System.out.println("car brake");
    }
    
    
}
