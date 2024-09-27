import java.util.Scanner;
public class parkir13 {

    public static void main(String[] args) {
        Scanner parkiran = new Scanner(System.in);

        System.out.println("Jenis Kendaraan (mobil/motor)");
        String jenisKendaraan = parkiran.nextLine();

        int biayaPerjam, jamParkir, biayaParkir;
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biayaPerjam = 5000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biayaPerjam = 3000;
        } else {
            System.out.println("Jenis kendaraan tidak valid. ");
            return;
        }
        
        System.out.println("Berapa lama anda parkir?");
        jamParkir = parkiran.nextInt();

        biayaParkir = biayaPerjam * jamParkir;

        System.out.println("Biaya parkir untuk " + jenisKendaraan + " selama " +jamParkir + " adalah " +biayaParkir);
    }
}