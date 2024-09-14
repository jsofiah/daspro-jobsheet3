import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) {
        Scanner listrik = new Scanner(System.in);
        int jmlPenggunaan, tarifListrik = 1500, batasListrik = 500;
        double totalTagihan;
        boolean melebihiBatas;

        System.out.print("Masukkan jumlah penggunaan listrik dalam kWh: ");
        jmlPenggunaan = listrik.nextInt();

        totalTagihan = jmlPenggunaan * tarifListrik;
        melebihiBatas = jmlPenggunaan > batasListrik;
        System.out.println("Total tagihan listrik anda sebesar: Rp." + totalTagihan);
        System.out.println("Jumlah penggunaan listrik melebihi 500kWh: " + melebihiBatas);
    }
}
