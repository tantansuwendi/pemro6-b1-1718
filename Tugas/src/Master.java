public class Master {
    private static final String KEY_ACCESS = "KEY_ACCESS";
    private static final int NUM_DAYS_PER_YEARS = 365;
    public static void main(String[] args) {
        System.out.println("Master pegawai");
 
        Pegawai peg = new Pegawai();
        peg.nipp = 70007;
        peg.nama = "Desy Kartika V";
        peg.jabatan = "Staff report and evaluation passeger marketing";
        peg.kedudukan = "Kantor pusat";
        
        Pegawai peg2 = new Pegawai();
        peg2.nipp = 70100;
        peg2.nama = "Fidya Dwi P";
        peg2.jabatan = "Staff Resource and development passenger marketing";
        peg.kedudukan = "Kantor pusat";
        
        peg2 = peg;
        System.out.println("Ini Data Pegawai PT. Kereta Api Indonesia");
        System.out.println("Nipp :" + peg2.nipp);
        System.out.println("Nama :" + peg2.nama);
        System.out.println("Jabatan :" + peg2.jabatan);
        System.out.println("Kedudukan :" + peg2.kedudukan);
    }
}
