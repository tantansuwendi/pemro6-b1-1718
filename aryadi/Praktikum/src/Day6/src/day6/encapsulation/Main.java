/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6.encapsulation;

/**
 *
 * @author hp
 */
public class Main {
    int x = 10;
    
    public static void main(String[] args) {
        int x = 5;
        System.out.println("x : " + new Main().getX());
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNama("Mahasiswa A");
        System.out.println("Nama : " + mhs1.getNama());
    }
    
    public int getX() {
        return this.x;
    }
}
