import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args) {
        Scanner karyawan = new Scanner(System.in);
        double jam, upah, bonus = 0.10, pajak = 0.05, gajiMurni, tambahanBonus, gajiBonus, potonganPajak, gajiBulanan;

        System.out.print("Masukkan jumlah jam kerja selama sebulan: ");
        jam = karyawan.nextDouble();
        System.out.print("Masukkan upah kerja per jam: ");
        upah = karyawan.nextDouble();

        gajiMurni = upah * jam;
        tambahanBonus = bonus * gajiMurni;
        gajiBonus = gajiMurni + tambahanBonus;
        potonganPajak = pajak * gajiBonus;
        gajiBulanan = gajiBonus - potonganPajak;

        System.out.println("Gaji bulanan karyawan: " + gajiBulanan);
        System.out.println("------------------------------------------------");
        System.out.println("Rincian gaji: ");
        System.out.println("Gaji Murni: " + gajiMurni);
        System.out.println("Bonus yang didapat: " + tambahanBonus);
        System.out.println("Gaji dan Bonus: " + gajiBonus);
        System.out.println("Potongan Pajak: " + potonganPajak);
        System.out.println("Gaji bulanan akhir: " + gajiBulanan);

    }    
}
