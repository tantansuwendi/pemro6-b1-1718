/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmad Muhsin
 */
public class Main {
    // Example constant
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
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Ahmad";
        mhs.npm = "0612124567";
        mhs.usia = 25;
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Aldo";
        mhs2.npm = "0612124569";
        mhs2.usia = 20;
       
        mhs2 = mhs;
        
        System.out.println("Ini Data Mahasiswa");
        System.out.println("Nama: " + mhs2.nama);
        System.out.println("NPM : " + mhs2.npm);
        System.out.println("Usia : " + mhs2.usia);
        

    }
}
