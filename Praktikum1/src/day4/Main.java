/* 
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates 
 * and open the template in the editor. 
 */ 
package day4; 
 
/** 
 * 
 * @author Ahmad Muhsin 
 */ 
public class Main { 
    public static void main(String[] args) { 
        // Control Structure 
        // Basic flow : sequence 
//        System.out.println("1"); 
//        System.out.println("2"); 
//        System.out.println("3"); 
//        System.out.println("4"); 
         
        // Conditional 
        // if, if else, if elseif else 
        // switch case 
        // ? : 
         
        // operator aritmatika, +,-,/,* 
        int bil1 = 1 + 1; 
        String dummyString = "1" + "1"; 
         
        // operator perbandingan 
        // ==, !=, >, <, >=, <= 
        boolean condition = (3 < 2); //false 
         
        // operator logika 
        // !, ||, && 
        System.out.println("\nLogika example"); 
        boolean condition2 = !condition; 
        boolean condition3 = condition || condition2; 
        boolean condition4 = condition && condition2; 
         
        System.out.println("condition (3 < 2): " + condition); 
        System.out.println("condition2 !condition: " + condition2); 
        System.out.println("condition3 condition || condition2: " + condition3); 
        System.out.println("condition4 condition && condition2: " + condition4); 
         
        System.out.println(3<2); 
         
        System.out.println("\nif example"); 
        System.out.println("1"); 
        System.out.println("2"); 
        if((3 > 2) && (5 > 10) || !(10 > 12)) System.out.println("3"); 
        System.out.println("4"); 
         
        System.out.println("\nif else example"); 
        if(condition) { 
            System.out.println("A1"); 
            System.out.println("A2"); 
        }else { 
            System.out.println("B1"); 
            System.out.println("B2"); 
        } 
         
        System.out.println("\nif elseif else example"); 
        if (condition) 
            System.out.println("A"); 
        else if (condition2) 
            System.out.println("B"); 
        else if (condition2) 
            System.out.println("C"); 
        else 
            System.out.println("D"); 
         
         
        System.out.println("\n switch"); 
        int pilihan = 1; 
         
        switch(pilihan) { 
            case 1: System.out.println("A"); break; 
            case 2: System.out.println("B"); break; 
            default : System.out.println("C"); break; 
        } 
         
        System.out.println("Operator ? :"); 
        String result = (condition) ? "Widyatama" : "UTAMA"; 
        System.out.println("result: " + result); 
         
         
        // Looping 
        System.out.println("LOOPING"); 
         
        //for 
        for(int i=0; i<4; i++) { 
            System.out.println("ABCDE"); 
        } 
         
        for(int i=0; i<10; i+=3){ 
            System.out.println("A"); 
        } 
         
        for(int i=5; i>1; i--){ 
            System.out.println("B"); 
        } 
         
        for(int i=0; i<4; i++){ 
            for(int j=0; j<3; j++) { 
                System.out.println("AB"); 
            } 
            System.out.println("-------------"); 
        } 
         
        int arrayBil[] = {10,20,30,40,50,60,70,80,90}; 
        for(int i=0; i<arrayBil.length; i++){ 
            System.out.println("indeks: " + i); 
            System.out.println("array value : " + arrayBil[i]); 
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
File contents are unchanged.
commit:a8b12f
pertemuan 4