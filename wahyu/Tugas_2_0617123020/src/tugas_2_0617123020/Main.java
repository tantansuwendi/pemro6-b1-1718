/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_2_0617123020;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    
    public static void main(String[] args) {
        
//        inisiasi variabel referensi
        RumahSakit rs = new RumahSakit();
        Hotel ht = new Hotel();
        
//        inisiasi untuk membuat inputan
        Scanner sc = new Scanner(System.in);
        
//        menggunakan cara default isi variabel dari kelas Hotel
//      mengisi variabel referensi
        ht.nama_hotel = "Trans Luxury Hotel";
        ht.alamat = "Bandung";
        ht.kode_pos = "45284";
        ht.harga_permalam = 1250000;
        ht.jml_kamar = 500;
//        menampilkan data
        System.out.println("Nama Hotel : "+ht.nama_hotel);
        System.out.println("Alamat : "+ht.alamat);
        System.out.println("Kode Pos : "+ht.kode_pos);
        System.out.println("Harga per Malam : "+ht.harga_permalam);
        System.out.println("Jumlah Kamar : "+ht.jml_kamar);
        
//        menggunakan cara inputan dari variabel kelas RumahSakit
//        mengisi variabel referensi dari inputan
        System.out.println("Data Rumah Sakit");
        System.out.println("--------------------");
        System.out.print("Inputkan Nama Rumah Sakit : ");
        rs.nama_rs = sc.next();
        System.out.print("Inputkan Alamat Rumah Sakit : ");
        rs.alamat = sc.next();
        System.out.print("Inputkan Kode Pos Rumah Sakit : ");
        rs.kode_pos = sc.next();
        System.out.print("Inputkan Jumlah Dokter : ");
        rs.jml_dokter = sc.nextInt();
        System.out.print("Inputkan Jumlah Perawat : ");
        rs.jml_perawat = sc.nextInt();
        System.out.print("Inputkan Jumlah Ruang Rawat di Rumah Sakit : ");
        rs.jml_ruang_rawat = sc.nextInt();
        System.out.println("----------------------");
//        menampilkan data inputan
        System.out.println("Menampilkan Data Rumah Sakit");
        System.out.println("Nama Rumah Sakit : "+rs.nama_rs);
        System.out.println("Alamat Rumah Sakit : "+rs.alamat);
        System.out.println("Kode Pos : "+rs.kode_pos);
        System.out.println("Jumlah Dokter : "+rs.jml_dokter);
        System.out.println("Jumlah Perawat : "+rs.jml_perawat);
        System.out.println("Jumlah Ruang Rawat : "+rs.jml_ruang_rawat);
        
    }
    
}
