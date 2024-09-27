import java.util.Scanner;
public class usia13 {
    public static void main(String[] args) {
        Scanner umur = new Scanner(System.in);

        int usia;

        System.out.println("Masukkan usia Anda: ");
        usia = umur.nextInt();

        if (usia < 0) {
            System.out.println("Usia tidak boleh negatif."); 
        } else {
            if (usia <= 12) {
                System.out.println("Anda termasuk kategori Anak. ");
            } else if (usia <= 19) {
                System.out.println("Anda termasuk kategori Remaja. ");
            } else if (usia <= 64) {
                System.out.println("Anda termasuk kategori dewasa. ");
            } else {
                System.out.println("Anda termasuk kategori lansia. ");
            }
        }
    }
}
