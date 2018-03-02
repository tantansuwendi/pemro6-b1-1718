/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_0617123018;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class Main {
    
    public static void main(String[] args) {
    Kosan k=new Kosan();
    Pemilik p=new Pemilik();
    Scanner tp = new Scanner(System.in);
    
    p.nama="Agus Setiawan";
    p.nohp="08122244232";
    p.alamat="Sukabirus";
    
        System.out.println("Ini Data Pemilik Kosan");
        System.out.println("Nama: " + p.nama);
        System.out.println("Nomor Hp : " + p.nohp);
        System.out.println("Alamat Kosan : " + p.alamat);
    
    
    
    System.out.println("Data Kosan");
    System.out.print("Masukkan Nama:    ");
    k.nama=tp.next();
    System.out.print("Masukkan Asal:    ");
    k.asal=tp.next();
    System.out.print("Masukkan NoKamar:    ");
    k.kamar=tp.nextInt();
    System.out.print("Masukkan Sewa pertahun:    ");
    k.pertahun=tp.nextInt();
    System.out.print("Harga:    ");
    k.jmlpertahun=tp.nextInt();
  
    
        System.out.println("Ini Data Pemilik Kosan");
        System.out.println("Nama: " + k.nama);
        System.out.println("Asal : " + k.asal);
        System.out.println("No Kamar : " + k.kamar);
        System.out.println("Sewa: " + k.pertahun +  "Tahun");
        System.out.println("Harga: " + k.jmlpertahun );
          }
}
