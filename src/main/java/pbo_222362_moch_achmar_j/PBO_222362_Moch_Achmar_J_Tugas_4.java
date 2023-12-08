package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nProgram Menghitung Luas Bangun Datar");
            System.out.println("==============================");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Menghitung Luas Segitiga");
            System.out.println("==============================");

            System.out.print("Anda Ingin Menghitung Luas Bangun Datar Apa ? = ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    PBO_222362_Moch_Achmar_J_Tugas_4_1.hitungLuas();
                    break;
                case 2:
                    PBO_222362_Moch_Achmar_J_Tugas_4_2.hitungLuas();
                    break;
                case 3:
                    PBO_222362_Moch_Achmar_J_Tugas_4_3.hitungLuas();
                    break;
                default:
                    System.out.println("\nPilihan Tidak Ada, Silahkan Input Lagi");
            }

            String jawaban;
            do {
                System.out.print("\nApakah Anda Mau Menghitung Lagi (Ya/Tidak) ? ");
                jawaban = scanner.next();
                if (jawaban.equalsIgnoreCase("ya") || jawaban.equalsIgnoreCase("tidak")) {
                    break;
                } else {
                    System.out.println("Jawaban tidak valid, silakan masukkan 'Ya' atau 'Tidak'.");
                }
            } while (true);

            if (jawaban.equalsIgnoreCase("tidak")) {
                System.out.println("\nTerima Kasih!");
                break;
            }

        } while (pilihan >= 1 && pilihan <= 3);
    }
}