package pbo_222362_moch_achmar_j;

import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_MID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Program Laundry Sederhana\n");
            System.out.println("---------------------------------PAKET--------------------------------");
            System.out.println("|              L01                 |                   L02            |");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("|         Cuci Lipat/Kg            |           Cuci Setrika/Kg        |");
            System.out.println("|             5.000                |                 7.000            |");
            System.out.println("----------------------------------------------------------------------");

            int totalOrder = 0;

            System.out.println("\nTotal Order = " + totalOrder);
            System.out.println("======================================================================");

            String paket;
            int berat, waktuPengambilan, hargaPerKg, totalHargaSementara, totalHarga;

            while (true) {
                System.out.print("\nMasukkan Paket = ");
                paket = scanner.next();

                if (paket.equalsIgnoreCase("L01")) {
                    hargaPerKg = 5000;
                    break;
                } else if (paket.equalsIgnoreCase("L02")) {
                    hargaPerKg = 7000;
                    break;
                } else {
                    System.out.println("Paket tidak valid! Masukkan Paket yang valid!");
                }
            }

            System.out.print("Masukkan Berat (kg) = ");
            berat = scanner.nextInt();

            totalHargaSementara = berat * hargaPerKg;

            System.out.println("Total Harga Sementara = Rp. " + totalHargaSementara);

            System.out.print("Masukkan Waktu Pengambilan (Hari) = ");
            waktuPengambilan = scanner.nextInt();

            totalHarga = totalHargaSementara;

            if (waktuPengambilan < 1) {
                System.out.println("Waktu pengambilan tidak valid. Harga tidak dapat dihitung.");
            } else {
                totalHarga += waktuPengambilan * 5000;
                System.out.println("Total Harga = Rp. " + totalHarga);
                System.out.println("Terima Kasih, Atas Kepercayaan Anda");
            }

            System.out.println("======================================================================");

            System.out.print("Mau Input Lagi ? (Ya/Tidak) = ");
            String jawaban = scanner.next();

            if (!jawaban.equalsIgnoreCase("Ya")) {
                System.out.println("Terima Kasih, Atas Kepercayaan Anda");
                break;
            }
        }

        scanner.close();
    }
}
