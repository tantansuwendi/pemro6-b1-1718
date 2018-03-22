/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author hp
 */
public class Vehicle {
    public Vehicle() {
        System.out.println("This is Car Constructor");
    }
    
    int ccNumber;
    
    void brake() {
        System.out.println("Brake");
    }
    
    void turnLeft() {
        System.out.println("Turn left");
    }
    
    void turnRight() {
        System.out.println("Turn right");
    }
}
