package latihan7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Car extends Vehicle{
    
    void retreat(){
        System.out.println("Mundur");
    }
    
    @Override
    void brake(){
        System.out.println("Car Brake");
    }
    
}
