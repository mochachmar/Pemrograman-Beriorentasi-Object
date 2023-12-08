package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_4_3 {
    public static void hitungLuas() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nProgram Menghitung Luas Segitiga");
        System.out.println("==============================");

        System.out.print("Masukkan jumlah iterasi luas segitiga yang akan dihitung : ");
        int jumlahIterasi = scanner.nextInt();

        for (int i = 0; i < jumlahIterasi; i++) {
            System.out.print("Masukkan Alas ke-" + (i + 1) + " = ");
            double alas = scanner.nextDouble();

            System.out.print("Masukkan Tinggi ke-" + (i + 1) + " = ");
            double tinggi = scanner.nextDouble();

            double luas = 0.5 * alas * tinggi;

            System.out.println("Luas Segitiga ke-" + (i + 1) + " = " + luas + " (Dengan Rumus 0.5 X Alas X Tinggi)");
        }
    }
}
