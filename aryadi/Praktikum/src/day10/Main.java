/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Main {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
        
    try {    
        System.out.println("Masukkan bil 1 : ");
        int bil1 = in.nextInt();
        System.out.println("Masukkan bil 2 : ");
        int bil2 = in.nextInt();
        
        double hasil = bil1 / bil2;
        System.out.println("Hasil : " + hasil);
    } catch(InputMismatchException ex) {
            System.out.println("Input bilangan hanya bil integer");
    } catch(ArithmeticException ex2) {
            System.out.println("Input bilangan tidak valid");
    }
    
    try {
        callTestThrow();
    } catch(Exception x){
        System.out.println("Catch exception main");
    }
    
}
    
    public static void callTestThrow() throws Exception {
        try {
            testThrow();
        } catch(Exception x) {
            System.out.println("Catch exception callTestThrow");
        }
    }

public static void testThrow() throws Exception {
    System.out.println("test");
    throw new Exception();
}
}
