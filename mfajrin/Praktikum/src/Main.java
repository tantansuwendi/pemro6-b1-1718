/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad Fajrin
 */
public class Main {
        //
            public static final String KEY_ACCESS = "Test";
            //CONSTRAINT
            public static final int NUM_DAYS_PER_YEARS = 365;
        public static void main(String[] args) {
            System.out.println("Main Kelas");
            
            //tipe data primitive (tipe data utama)
            int bilanganBulat = 0;
            double bilanganPecahan = 5.5;
            int durasi = 2 * NUM_DAYS_PER_YEARS;
            
            //char 
            char karakter = 'A';
            
            //logika
            boolean isEnabled = true;

           //tipe data reference (gabungan primitive)
           Mahasiswa mhs = new Mahasiswa();
           mhs.nama = "ahmad";
           mhs.npm = "06123123";
           mhs.umur = 15;
           
           
            System.out.println("Ini data mahasiswa");
            System.out.println("Nama : " + mhs.nama);
            System.out.println("NPM : " + mhs.npm);
            System.out.println("Usia :" + mhs.umur);
            
        }
}
