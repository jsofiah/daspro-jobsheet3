import java.util.Scanner; //untuk mengimpor Scanner agar bisa menerima input
public class Nomor2 {
    public static void main(String[] args) {
        Scanner karyawan = new Scanner(System.in); //membuat Scanner dengan nama "karyawan" untuk menerima input
        double jam, upah, bonus = 0.10, pajak = 0.05, gajiMurni, tambahanBonus, gajiBonus, potonganPajak, gajiBulanan; //deklarasi variabel dengan tipe double 'jam' untuk menyimpan jumlah jam kerja, 'upah' untuk upah per jam kerja,'bonus' dengan nilai 0.10 (10%), pajak' dengan nilai 0.05 (5%), 'gajiMurni, tambahanBonus, gajiBonus, potonganPajak, gajiBulanan' untuk menampung input dan hasil perhitungan

        System.out.print("Masukkan jumlah jam kerja selama sebulan: "); //menampilkan pesan pada pengguna untuk memasukkan jumlah jam kerja selama sebulan
        jam = karyawan.nextDouble(); //menerima input jumlah penggunaan listrik dari pengguna dn menyimpan nilainya ke variabel 'jam'
        System.out.print("Masukkan upah kerja per jam: "); //menampilkan pesan pada pengguna untuk memasukkan upah per jam kerja
        upah = karyawan.nextDouble(); //menerima input jumlah penggunaan listrik dari pengguna dn menyimpan nilainya ke variabel 'upah'

        gajiMurni = upah * jam; //menghitung gaji murni dengan mengalikan upah per jam dengan jumlah jam kerja
        tambahanBonus = bonus * gajiMurni; //menghitung bonus yang didapat dengan mengalikan bonus (10%) dengan gaji murni.
        gajiBonus = gajiMurni + tambahanBonus; //menghitung total gaji dengan menambahkan gaji murni dengan tambahan bonus.
        potonganPajak = pajak * gajiBonus; //menghitung potongan pajak dengan mengalikan pajak (5%) dengan total gaji dan bonus.
        gajiBulanan = gajiBonus - potonganPajak; //menghitung gaji bulanan setelah dikurangi potongan pajak.

        System.out.println("Gaji bulanan karyawan: " + gajiBulanan); //menampilkan gaji bulanan karyawan
        System.out.println("------------------------------------------------"); //menampilkan garis pemisah untuk memisahkan hasil akhir dan rincian gaji
        System.out.println("Rincian gaji: "); //menampilkan judul rincian gaji
        System.out.println("Gaji Murni: " + gajiMurni); //menampilkan gaji murni yang sudah dihitung berdasarkan jumlah jam kerja dikali upar per jam
        System.out.println("Bonus yang didapat: " + tambahanBonus); //menampilkan bonus yang didapat karyawan
        System.out.println("Gaji dan Bonus: " + gajiBonus); //menampilkan hasil dari gaji murni yang ditambah dengan bonus
        System.out.println("Potongan Pajak: " + potonganPajak); //menampilkan jumlah potongan pajak yang didapat
        System.out.println("Gaji bulanan akhir: " + gajiBulanan); //menampilkan gaji bulanan akhir karyawan setelah mendapat bonus dan dipotong pajak

    }    
}
