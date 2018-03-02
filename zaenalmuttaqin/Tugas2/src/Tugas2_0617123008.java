/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A43SD
 */
public class Tugas2_0617123008 {
     public static void main(String[] args) {
        System.out.println("Tugas 2 0617123008_Zaenal Muttaqin");
                    
        FormulirPendaftaranSMK formulir = new FormulirPendaftaranSMK();
        formulir.nama = "Dilan";
        formulir.ttgl = "Bandung, 25 Desember 1985";
        formulir.AsalSmp ="SMP Karang Taruna";
        formulir.Alamat="Jl. Ciawitali no 53 kp cisomplak";
        formulir.NamaOrtu="Abidin";
        formulir.telp = "0831324341";
        

      

        System.out.println(" =====Formulir Pendaftaran====");
        System.out.println("Nama                    : " + formulir.nama);
        System.out.println("Tempat Tanggal Lahir    : " + formulir.ttgl);
        System.out.println("Asal SMP                : " + formulir.AsalSmp);
        System.out.println("Alamat                  : " + formulir.Alamat);
        System.out.println("Nama Ortu               : " + formulir.NamaOrtu);
        System.out.println("No Tlp                  : " + formulir.telp);
        
        
        
    }
    
}
