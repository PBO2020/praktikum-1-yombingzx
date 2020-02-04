import java.util.Scanner;
import java.util.ArrayList;
class prak{
	Scanner wow = new Scanner(System.in);
	ArrayList<String> NIK = new ArrayList<>();
	ArrayList<String> NAMA = new ArrayList<>();
	ArrayList<String> TTL = new ArrayList<>();
	ArrayList<String> JK = new ArrayList<>();
	ArrayList<String> GD = new ArrayList<>();
	public static void main(String[] args) {
		prak op = new prak();
		op.masuk();
		op.pemastian();
	}
	void masuk(){
		String NIKs;
		String NAMAs;
		String TTLs;
		String JKs;
		System.out.println("Masukkan NIK");
		NIKs=wow.nextLine();
		NIK.add(NIKs);
		System.out.println("Masukkan NAMA");
		NAMAs=wow.nextLine();
		NAMA.add(NAMAs);
		System.out.println("Masukkan TTL");
		TTLs=wow.nextLine();
		TTL.add(TTLs);
		System.out.println("Masukkan JK");
		JKs=wow.nextLine();
		JK.add(JKs);
		Golongan();
	}
	void Golongan(){		int GDs;
		System.out.println("Masukkan GD");
		GDs=wow.nextInt();
		if (GDs == 1) {
			GD.add("A");
		} else if (GDs == 2 ){
			GD.add("B");
		} else if (GDs == 3){
			GD.add("AB");
		} else if (GDs == 4){
			GD.add("O");
		} else {
			System.out.println("Nomor Tidak Ada Mohon Ulangi");
			Golongan();
		}
	}
	void pemastian(){
		int milih;
		System.out.println("Yakin Dengan Pilihan Ini ? ");
		System.out.println("1. Penambahan Data Baru");
		System.out.println("2. Melihat Hasil");
		System.out.println("3. Keluar");
		System.out.println("Masukkan Pilihan");
		milih = wow.nextInt();
		switch(milih){
			case 1 : 
			System.out.println("Masukkan Lagi Data");
			masuk();
			case 2:
			System.out.println("Lihat Hasil");
			for (int i=0;i<NIK.size() ;i++ ) {
				System.out.print("NIK : ");
				System.out.println(i + NIK.get(i));
			}
			for (int i=0;i<NAMA.size() ;i++ ) {
				System.out.print("NAMA : ");
				System.out.println(i + NAMA.get(i));
			}
			for (int i=0;i<TTL.size() ;i++ ) {
				System.out.print("TTL : ");
				System.out.println(i + TTL.get(i));
			}
			for (int i=0;i<JK.size() ;i++ ) {
				System.out.print("Jenis Kelamin : ");
				System.out.println(i + JK.get(i));
			}
			for (int i=0;i<GD.size() ;i++ ) {
				System.out.print("GD : ");
				System.out.println(i + GD.get(i));
			}
			case 3 :
			System.exit(0);
			default :
			System.out.println("Pilihan Tidak Ada ");
			pemastian();
		}
	}
}