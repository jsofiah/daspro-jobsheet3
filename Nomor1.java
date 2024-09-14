import java.util.Scanner; //untuk mengimpor Scanner agar bisa menerima input
public class Nomor1 { 
    public static void main(String[] args) {
        Scanner listrik = new Scanner(System.in); //membuat Scanner dengan nama "listrik" untuk menerima input
        int jmlPenggunaan, tarifListrik = 1500, batasListrik = 500; //deklarasi variabel dengan tipe data int 'jmlPenggunaan' sebagai jumalh penggunaan listrik, 'tarifListrik' sebagai tarif listrik per kWh 1500, 'batasListrik' untuk menentukan lebih 500 atau tidak
        double totalTagihan; //deklarasi variabel dengan tipe data double 'totalTagihan' untuk menyimpan hasil hitung total tagihan listrik
        boolean melebihiBatas; //deklarasikan variabel dengan tipe data boolean 'melebihiBatas' untuk menyimpan status apakah penggunaan listrik melebihi batas

        System.out.print("Masukkan jumlah penggunaan listrik dalam kWh: "); //menampilkan pesan pada pengguna untuk memasukkan jumlah penggnaan listrik
        jmlPenggunaan = listrik.nextInt(); //menerima input jumlah penggunaan listrik dari pengguna dn menyimpan nilainya ke variabel 'jmlPenggunaan'

        totalTagihan = jmlPenggunaan * tarifListrik; //menghitung total tagihan dengan mengalikan jumlah penggunaan dengan tarif per kWh
        melebihiBatas = jmlPenggunaan > batasListrik; //mengecek apakah jumlah penggunaan yang diinputkan melebihi batas 500, dan akan menyimpan hasilnya ke variabel 'melebihiBatas'
        System.out.println("Total tagihan listrik anda sebesar: Rp." + totalTagihan); //menampilkan total tagihan listrik
        System.out.println("Jumlah penggunaan listrik melebihi 500kWh: " + melebihiBatas); //menampilkan apakah jumlah penggunaan listrik melebihi 500 kWh
    }
}
