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
public class main {
    public static void main(String[] args) {
        //control structure
        // basic flow 
        
      //  System.out.println("1");
      // System.out.println("2");
      //  System.out.println("3");
      //   System.out.println("4");
        
        // Conitional
        // If, if else, if elseif else
        // Switch case
        // ?:
        
        //operator aritmatika, +,-,/,*
        int bil = 1 + 1;
        String dummyString = "1" + "1";
        
        //operator perbandingan
        // ==, !=, >, <, >=,<=
        boolean condition = (3 < 2); //false
        
        // operator logika
        // !, ||, &&
        boolean condition2 = !condition; //true
        boolean condition3 = condition || condition2; //true, karena ada salah satu yang true maka true
        boolean condition4 = condition2 && condition3; //true, karena semua bernilai true
        
        System.out.println("condition (3 < 2) : " + condition);
        System.out.println("condition2 !condition: " + condition2);
        System.out.println("condition3 condition || condition2: " + condition3);
        System.out.println("condition4 condition && condition2: " + condition4);
        
                
        System.out.println (3<2);
        
        // if example    
        System.out.println("if else example \n");
        System.out.println("1");
        System.out.println("2");
        if ((3 > 2) && (5 > 10) || !(10 > 12)) System.out.println("3");       
        System.out.println("4");
        
        System.out.println("if else example \n");
        if (condition) {
            System.out.println("A1");
            System.out.println("A2");
        } else {
            System.out.println("B1");
            System.out.println("B2");
        }
        
        System.out.println("if else example");
        if (condition)
            System.out.println("A");
        else if (condition2)
             System.out.println("B");
        else if (condition2)
             System.out.println("C");
        else if (condition2)
            System.out.println("D");
        
        System.out.println ("\n switch");
        int pilihan = 1;
        
        switch(pilihan) {
            case 1: System.out.println("A"); break;
            case 2: System.out.println("B"); break;
            default : System.out.println("C"); break;
        }
        
        System.out.println("Operator ? :");
        String result = (condition) ? "WIdyatama" : "UTAMA";
        System.out.println("result: " + result);
        
        
        //Looping
        System.out.println("LOOPING");
        
        
        //for
        for(int i=0; i<10; i++) {
         System.out.println("ABCDE");
        }
        
        for(int i=0; i<10; i+=3) {
         System.out.println("A");
        }    
        
        for(int i=5; i>1; i--) {
         System.out.println("B");
        }  
        
        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                System.out.println("AB");
            }
            System.out.println("--------------------");
        }
        
        int arrayBil[] = {1,2,3,4,5,6,7,8,9};
        for(int i=0; i<arrayBil.length; i++){
            System.out.println("array value :" +arrayBil[i]);
        }
        
        for (int i : arrayBil){
            System.out.println(i);
        }
        
        //while
        int i=0;
        while(i < 10) {
            System.out.println("ABCDE");
            i++;
        }
    }
 }
