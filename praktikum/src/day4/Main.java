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
        /*Control Structure
        Basic flow : sequence
        */
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
        
        /*Conditional
        if, if else, if elseif else, switch case, ? :,
        
        
        operator aritmatika : +,-,/,*
        */
        int bill = 1 + 1;
        String dummyString = "1" + "1";
        
        // operator perbandingan : ==,!=,>,<,>=,<=
        boolean condition1 = (3<2);
        boolean condition2 = !condition1;
        boolean condition3 = condition1 || condition2;
        boolean condition4 = condition2 && condition3;
        
        // operator logika : !, ||, &&
        System.out.println("Condition 1 (3<2): " + condition1);
        System.out.println("Condition 2 (!condition1): " + condition2);
        System.out.println("Condition 3 (condition1 || condition2): " + condition3);
        System.out.println("Condition 4 (condition2 && condition3): " + condition4);
        if (condition1) System.out.println("3");
        System.out.println("4");
        
        if(condition1){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
        
        System.out.println("\nSwitch");
        int pilihan = 1;
        
        switch(pilihan){
            case 1 : System.out.println("A"); break;
            case 2 : System.out.println("B"); break;
            default : System.out.println("C"); break;
        }
        
        // Operator ? :
        System.out.println("\nOperator ? :");
        String result = (condition1) ? "Widyatama" : "Utama";
        System.out.println("Result : " + result);
        
        // Looping
        System.out.println("\nLOOPING");
        
//        for(int i=0; i<4; i++){
//            for(int j=0; j<3; j++){
//        System.out.println("AB");
//            }
//            System.out.println("--");
//        }
        
        //while
//        int i=0;
//        while(i<4){
//            System.out.println("FGHIJ");
//            i++;
//        }
        
        int arrayBil[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arrayBil.length; i++){
            System.out.println("Array Value : "+ arrayBil[i]);
        }
        
        
        
    }
}
