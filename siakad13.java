import java.util.Scanner;
public class siakad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis , bobotKuis = 0.2, nilaiTugas, bobotTugas = 0.15, nilaiUts, bobotUts = 0.3, nilaiUas, bobotUas = 0.35, nilaiAkhir;

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen: ");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.println("Masukkan nilai UAS");
        nilaiUas = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * bobotKuis) + (nilaiTugas * bobotTugas) + (nilaiUts * bobotUts) + (nilaiUas * bobotUas);

        // System.out.println("Nama: " + nama + " NIM: " + nim);
        // System.out.println("Kelas: " + kelas + " Absen: " + absen); 
        System.out.println(String.format("Mahasiswa dengan nama %s (NIM %s) kelas %s nomor absen %d", nama, nim, kelas, absen));       
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}