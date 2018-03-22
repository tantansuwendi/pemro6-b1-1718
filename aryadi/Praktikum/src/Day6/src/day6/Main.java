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
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brake();
        vehicle1.turnLeft();
        vehicle1.turnRight();
        
        Car car1 = new Car();
        car1.retreat();
        car1.brake();
    }
}
