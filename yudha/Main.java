/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rak_buku;
 
/**
 *
 * @author Yudha
 */
public class Main {
    public static final String KEY_ACCESS = "KEY_ACCESS"; 
    public static final int NUM_DAYS_PER_YEARS = 365;  
     
    public static void main(String[] args) { 
        System.out.println("Main Kelas"); 
         
        // Tipe data primitive 
        // Bilangan 
        int bilanganBulat = 0; 
        double bilanganPecahan = 5.5; 
        int durasi = 2 * NUM_DAYS_PER_YEARS; 
 
        //char 
        char karakter = 'A'; 
         
        //logika 
        boolean isEnabled = true; 
    
         
        // Tipe data reference 
        Barang brng = new Barang(); 
        brng.jenis = "Susu"; 
        brng.merek = "Dancow"; 
        brng.jumlah = 200; 
         
        Barang brng = new Barang(); 
        brng.jenis = "Biskuit"; 
        brng.merek = "ABC"; 
        brng.jumlah = 400; 