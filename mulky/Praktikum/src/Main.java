/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Main {
    public static final String KEY_ACCESS = "KEY_ACCESS";
    public static final int NUM_DAYS_PER_YEARS = 365;
    
    public static void main(String[] args) {
        System.out.println("Main Kelas");
        
        //tipe data primitive
            //adalah tipe data dasar
            //Bilangan
            int bilangatBulat = 0;
            double bilanganPecahan = 5.5;
            int durasi = 2 * NUM_DAYS_PER_YEARS;
            
            //char
            char karakter = 'A';
            
            //logika
            boolean isEnabled = true;
        
        //tipe data reference
        //adalah tipe data gabungan
            Mahasiswa mhs = new Mahasiswa();
            mhs.nama = "Zaenal";
            mhs.npm = "0617123008";
            mhs.usia = 25;
            
            Mahasiswa mhs2 = new Mahasiswa();
            mhs2.nama = "Muttaqin";
            mhs2.npm = "061712300101";
            mhs2.usia = 22;
            
            mhs2 = mhs;
            
            System.out.println("Ini Data Mahasiswa");
            System.out.println("Nama : " + mhs2.nama);
            System.out.println("NPM : " + mhs2.npm);
            System.out.println("Usia : " + mhs2.usia);
    }
}
