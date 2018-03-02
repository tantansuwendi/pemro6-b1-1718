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
           //CONSTRAINT
            
           public static void main(String[] args) {
            System.out.println("Main Keluarga");
            
           //tipe data reference (gabungan primitive)
           Keluarga klg = new Keluarga();
           klg.nama = "ahmad";
           klg.nik = "3204250602930007";
           klg.umur = 25;
           
           
            System.out.println("Ini data mahasiswa");
            System.out.println("Nama : " + klg.nama);
            System.out.println("NPM : " + klg.nik);
            System.out.println("Usia :" + klg.umur);
            
        }
}