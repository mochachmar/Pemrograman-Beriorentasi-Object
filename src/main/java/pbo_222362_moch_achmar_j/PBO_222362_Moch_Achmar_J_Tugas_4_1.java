package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_4_1 {
    public static void hitungLuas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgram Menghitung Luas Persegi");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah iterasi luas persegi yang akan dihitung : ");
        int jumlahIterasi = scanner.nextInt();

        for (int i = 0; i < jumlahIterasi; i++) {
            System.out.print("Masukkan Panjang Sisi ke-" + (i + 1) + " = ");
            double sisi = scanner.nextDouble();

            double luas = sisi * sisi;

            System.out.println("Luas Persegi ke-" + (i + 1) + " = " + luas + " (Dengan Rumus Sisi X Sisi)");
        }
    }
}
