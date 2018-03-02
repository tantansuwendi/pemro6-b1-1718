/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author @WahyuWehaye
 */
public class Main {
//    Example Constanta
    public static final String KEY_ACCESS = "KEY_ACCESS";
    public static final int NUM_DAYS_PER_YEARS = 365;
    
//    Tipe Data dalam Java
    
//    Tipe Data Primitif
    /*
    Bilangan
    int = bilangan bulat
    double = bilangan pecahan
    
    Char
    char = karakter like string
    
    Logika
    boolean isEnable true false
    
    
    */
    
//    Tipe Data Reference
    
    
    public static void main(String[] args) {
        String nama, nim, kelas;
        
        Scanner mhs = new Scanner(System.in);
        System.out.println("Daftar Mahasiswa Widyatama");
        System.out.print("Nama : ");
        nama = mhs.next();
        System.out.print("NIM : ");
        nim = mhs.next();
        System.out.print("Kelas : ");
        kelas = mhs.next();
        System.out.println("-------------------");
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
    }
    
}
