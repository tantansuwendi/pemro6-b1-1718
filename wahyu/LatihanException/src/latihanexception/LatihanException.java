/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanexception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class LatihanException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        try {
            System.out.print("Masukan Bil 1 : ");
            int bil1 = in.nextInt();
            System.out.print("Masukan Bil 2 : ");
            int bil2 = in.nextInt();

            double hasil = bil1 / bil2;
            System.out.println("Hasilnya : "+hasil);
        } catch (InputMismatchException ex) {
            System.out.println("Salah woy inputannya");
        } catch (ArithmeticException ex2) {
            System.out.println("Salah Bilangannya");
        }
        
        
    }
    
    public static void callTestThrow() throws Exception{
        try {
            testThrow();
        } catch (Exception e) {
            System.out.println("Catch Exception Call Test Throw");
        }
    }
    
    public static void testThrow() throws Exception{
        System.out.println("test");
    }
    
}
