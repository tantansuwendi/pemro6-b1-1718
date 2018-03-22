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
public class Main{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicle vehicle1 = new Vehicle();
        vehicle1.brake();
        vehicle1.turnLeft();
        vehicle1.turnRight();
        
        Car car = new Car();
        car.retreat();
        car.brake();
        
    }
}
