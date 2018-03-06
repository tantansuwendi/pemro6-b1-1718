/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ars
 */
public class Tugas2 {
    public static void main(String[]args){
        Mahasiswa mhs;
        mhs = new Mahasiswa("Gladys Dara Nazariah" , "0617123005" , 21);
        
        System.out.println("Nama : " +mhs.nama );
        System.out.println("NPM  : " +mhs.npm );
        System.out.println("Umur : " +mhs.umur+ " tahun");
    }
}
