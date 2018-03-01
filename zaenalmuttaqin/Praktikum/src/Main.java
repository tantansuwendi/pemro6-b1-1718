/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A43SD
 */
public class Main {
    
    //1. Tipe data reference
    //Example Constanta
    public static final String KEY_ACCESS = "Test" ; //Access modifile
    public static final int NUM_DAYS_PER_YEARS = 365;
    
    public static void main(String[] args) {
        System.out.println("Main Kelas");
        
        //2. Tipe data primitive(tipe data dasar)
       
        // Bilangan
        int bilanganBulat = 0;//camelcase kecilBesar
        double bilanganPecahan = 5.5;
        int durasi = 2 * NUM_DAYS_PER_YEARS;
        
        //char
        char karakter = 'A';
       
        //logika
        boolean isEnabled = true;

       //tipe data reference 
       
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Dia";
        mhs.npm = "0617123008";
        mhs.usia = 25;

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Zaenal";
        mhs2.npm = "0617123008";
        mhs2.usia = 20;

       //tidak baik 
        mhs2 = mhs;

        System.out.println("Ini Data Mahasiswa ");
        System.out.println("Nama : " + mhs2.nama);
        System.out.println("NPM  : " + mhs2.npm);
        System.out.println("Usia : " + mhs2.usia);
        
        
        
        
    }
    
}
