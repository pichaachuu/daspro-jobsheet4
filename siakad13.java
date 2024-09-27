import java.util.Scanner;
public class siakad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim, kelas;
        byte absen;
        double nilaiKuis , bobotKuis = 0.2, nilaiTugas, bobotTugas = 0.15, nilaiUts, bobotUts = 0.3, nilaiUas, bobotUas = 0.35, nilaiAkhir;
        String nilaiHuruf, kualifikasiNilai;

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

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        } else {
            nilaiHuruf = "E";
            System.out.println("Nilai akhir huruf: " +nilaiHuruf);
        }

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            kualifikasiNilai = "Sangat Baik";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            kualifikasiNilai = "Lebih dari baik";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            kualifikasiNilai = "Baik";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            kualifikasiNilai = "Lebih dari cukup";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            kualifikasiNilai = "Cukup";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            kualifikasiNilai = "Kurang";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        } else {
            kualifikasiNilai = "Gagal";
            System.out.println("Kualifikasi: " +kualifikasiNilai);
        }
        
    }
}