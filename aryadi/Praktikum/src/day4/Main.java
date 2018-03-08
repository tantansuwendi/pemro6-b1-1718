/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author STUDENT
 */
public class Main {
    public static void main(String[] args) {
        //Control Structure
        //Basic flow : sequence
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
        
        //Conditional
        // IF, IF ELSE, IF ELSE IF ELSE 
        // switch case
        // ? :
        
        //Operator aritmatika, +, -. /, *
        int bill = 1 + 1;
        String dummyString = "1" + "1";
        
        //Operator perbandingan
        // ==, !=, >, <, >=, <=
        boolean condition = (3 < 2);
        
        //Operator logika
        //!, ||,  &&
        System.out.println("\nLogika example \n");
        boolean condition2 = !condition;
        boolean condition3 = condition || condition2; //salah satu benar maka yang lain benar
        boolean condition4 = condition && condition3; //salah satu salah maka yang lain salah
        
        System.out.println("condition : " + condition);
        System.out.println("condition2 !condition : " + condition2);
        System.out.println("condition3 condition || condition2 : " + condition3);
        System.out.println("condition4 condition && condition3 : " + condition4);
        
        System.out.println(3<2);
        
        System.out.println("1");
        System.out.println("2");
        if ((3 > 2) && (5 > 10) || !(10 > 12))System.out.println("3");
        System.out.println("4");
        
        System.out.println("\nIf else example");
        if (condition) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
        
        System.out.println("\nIf else if else example");
        if (condition)
            System.out.println("A");
        else if (condition2)
            System.out.println("B");
        else if (condition2)
            System.out.println("C");
        else
            System.out.println("D");
        
        System.out.println("\nSiwtch");
        int pilihan = 1;
        
        switch (pilihan) {
            case 1: System.out.println("A"); break;
            case 2: System.out.println("B"); break;
            default : System.out.println("C"); break;   
        }
        
        System.out.println("Operator ? :");
        String result = (condition) ? "Widyatama" : "Utama";
        System.out.println("result: " + result);
        
        //Looping
        System.out.println("\nLOOPING");
        
        for (int i=0; i<10; i++){
            System.out.println("ABCDE");
        }
        
        for (int i=0; i<10; i+=3){
            System.out.println("A");
        }
        
        for (int i=5; i>1; i--) {
            System.out.println("B");
        }
        
        for (int i=0; i<4; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("AB");
            }
            System.out.println("-----------");
        }
        
        int arrayBill[] = {1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i<arrayBill.length; i++) {
            System.out.println("Array Value : " + arrayBill[i]);
        }
        //while
        int i=0;
        while (i < 10) {
            System.out.println("ABCDE");
            i++;
        }
    }
}
