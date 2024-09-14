/**
 * Tugas-Java1
 */
 import java.util.Scanner;
 public class siakad21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        double bobotKuis = 0.20, bobotTugas = 0.15, bobotUTS = 0.30, bobotUAS = 0.35;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = ((bobotKuis * nilaiKuis) + (bobotTugas * nilaiTugas) + (bobotUTS * nilaiUTS) + (bobotUAS * nilaiUAS));

        // System.out.println("Nama: " + nama + " NIM: " + nim );
        // System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s) kelas %c nomor absen %d", nama, nim, kelas, absen));
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        }
}