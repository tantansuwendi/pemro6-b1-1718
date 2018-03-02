/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author STUDENT
 */
public class Main {
    // Example konstanta
    public static final String KEY_ACCESS = "KEY_ACCESS";
    
   public static void main(String[] args) {
        
Kelas kls = new Kelas();
kls.ruangan = "B411";
kls.matakuliah = "PEMROVI";
kls.jmlsiswa = 25;

Kelas kls2 = new Kelas();
kls2.ruangan = "B415";
kls2.matakuliah = "PengolahanCitra";
kls2.jmlsiswa = 26;



System.out.println("Ini Data Ruang Kelas");
System.out.println("Ruangan : " + kls2.ruangan);
System.out.println("Mata Kuliah  : " + kls2.matakuliah);
System.out.println("Jumlah Siswa : " + kls2.jmlsiswa);

        
        
    }
}
