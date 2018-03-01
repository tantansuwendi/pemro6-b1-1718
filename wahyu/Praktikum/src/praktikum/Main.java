/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    
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
