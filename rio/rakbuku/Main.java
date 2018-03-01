/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rakbuku;

/**
 *
 * @author Rio
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
        Buku bk = new Buku(); 
        bk.judul = "Kapal"; 
        bk.pengarang = "Rio"; 
        bk.hal = 200; 
         
        Buku bk2 = new Buku(); 
        bk2.judul = "Tenggelam"; 
        bk2.pengarang = "Aidil"; 
        bk2.hal = 300;
         
        System.out.println("Ini Data Mahasiswa"); 
        System.out.println("Nama: " + bk.judul); 
        System.out.println("Pengarang : " + bk.pengarang); 
        System.out.println("Jumlah Halaman : " + bk.hal); 
         
        System.out.println("Ini Data Mahasiswa 2"); 
        System.out.println("Nama: " + bk2.judul); 
        System.out.println("Pengarang : " + bk2.pengarang); 
        System.out.println("Jumlah Halaman : " + bk2.hal);
    } 
}
