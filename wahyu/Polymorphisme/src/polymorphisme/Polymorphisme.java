/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphisme;

/**
 *
 * @author STUDENT
 */
public class Polymorphisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperHero agus;
        
        agus = new SuperHero();
        agus.mainPower();
        
        agus = new Superman();
        agus.mainPower();
        
        agus = new Batman();
        agus.mainPower();
        
        
    }
    
}
