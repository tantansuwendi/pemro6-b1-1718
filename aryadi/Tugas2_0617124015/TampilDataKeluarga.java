public class TampilDataKeluarga {
	public static void main(String[] args) {
		System.out.println("------------## TUGAS 2 ##------------");
		DataKeluarga data = new DataKeluarga();
		data.noKK = 111001;
		data.nikAyah = 111002;
		data.namaAyah = "Kholidin";
		data.nikIbu = 111003;
		data.namaIbu = "Suryati";
		data.nikAnak1 = 111004;
		data.namaAnak1 = "Arif Suryadin";
		data.nikAnak2 = 111005;
		data.namaAnak2 = "Aryadi Saputra";
		
		System.out.println("---------## DATA KELUARGA ##---------");
		System.out.println("Nomor KK		: " + data.noKK);
		System.out.println("=====================================");
		System.out.println("NIK Ayah		: " + data.nikAyah);
		System.out.println("Nama Ayah		: " + data.namaAyah);
		System.out.println("=====================================");
		System.out.println("NIK Ibu			: " + data.nikIbu);
		System.out.println("Nama Ibu		: " + data.namaIbu);
		System.out.println("=====================================");
		System.out.println("NIK Anak Ke-1	: " + data.nikAnak1);
		System.out.println("Nama Anak Ke-1	: " + data.namaAnak1);
		System.out.println("=====================================");
		System.out.println("NIK Anak Ke-2	: " + data.nikAnak2);
		System.out.println("Nama Anak Ke-2	: " + data.namaAnak2);
		System.out.println("=====================================");
	}
}