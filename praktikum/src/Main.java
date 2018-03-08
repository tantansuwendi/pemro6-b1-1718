public class Main {
    private static final String KEY_ACCESS = "KEY_ACCESS";
    private static final int NUM_DAYS_PER_YEARS = 365;
    public static void main(String[] args) {
        System.out.println("Main Kelas");
        
        //type data : 
        //type data primitive:
        //type data dasar
        //bilangan
        int bilanganBulat = 0;
        double bilanganPecahan = 5.5;
        int durasi = 2 * NUM_DAYS_PER_YEARS;
        //char
        char karakter = 'A';
        
        //logika
        boolean isEnabled = true;
        
        //type data reference:
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Desy";
        mhs.npm = "0617123003";
        mhs.usia = 23;
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Rani";
        mhs2.npm = "0617123022";
        mhs2.usia = 23;
        
        mhs2 = mhs;
        System.out.println("Ini Data Mahasiswa");
        System.out.println("Nama :" + mhs2.nama);
        System.out.println("NPM :" + mhs2.npm);
        System.out.println("Usia :" + mhs2.usia);
        
        /*private static final String KEY_ACCESS = "KEY_ACCESS";*/
        // type data yang terdiri dari gabungan type data primitive
    }
}
