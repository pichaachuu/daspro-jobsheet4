import java.util.Scanner;
public class PemilihanBilangan13 {

    public static void main(String[] args) {
        Scanner input00 = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input00.nextInt();

    //     if (angka % 2 == 0)
    //     {
    //         System.out.println("Angka "+angka+" bilangan genap");
    //     }
    //     else
    //     {
    //         System.out.println("Angka "+angka+" bilangan ganjil");
    //     }

        String jenisAngka = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(jenisAngka);
        
    }
}