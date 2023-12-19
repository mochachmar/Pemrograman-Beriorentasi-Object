package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_4_2 {
    public static void hitungLuas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgram Menghitung Luas Persegi Panjang");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah iterasi luas persegi panjang yang akan dihitung : ");
        int jumlahIterasi = scanner.nextInt();

        for (int i = 0; i < jumlahIterasi; i++) {
            System.out.print("Masukkan Panjang ke-" + (i + 1) + " = ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan Lebar ke-" + (i + 1) + " = ");
            double lebar = scanner.nextDouble();

            double luas = panjang * lebar;

            System.out.println("Luas Persegi Panjang ke-" + (i + 1) + " = " + luas + " (Dengan Rumus Panjang X Lebar)");
        }
    }
}
