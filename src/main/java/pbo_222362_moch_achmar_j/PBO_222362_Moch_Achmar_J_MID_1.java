package pbo_222362_moch_achmar_j;

import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_MID_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kodeBarang = {"B01", "B02", "B03"};
        String[] namaBarang = {"Sampo", "Sabun", "Good Day"};
        int[] hargaBarang = {15000, 8000, 6000};
        int[] stokBarang = {100, 50, 30};

        String kodeInput, namaInput;
        int hargaInput, jumlahBeli, totalHarga, diskon, pembayaran, kembalian;

        do {
            System.out.println("\nProgram Kasir Sederhana\n");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|              B01                 B02                   B03           |");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("|             Sampo                Sabun                 Good Day      |");
            System.out.println("|             15.000               8.000                 6.000         |");
            System.out.println("------------------------------------------------------------------------");


            System.out.println("\nStok Sampo = " + stokBarang[0]);
            System.out.println("Stok Sabun = " + stokBarang[1]);
            System.out.println("Stok Good Day = " + stokBarang[2]);
            System.out.println("======================================================================");

            System.out.print("Masukkan Kode Barang = ");
            kodeInput = scanner.next();

            int index = -1;
            for (int i = 0; i < kodeBarang.length; i++) {
                if (kodeInput.equals(kodeBarang[i])) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                namaInput = namaBarang[index];
                hargaInput = hargaBarang[index];

                System.out.println("Nama Barang = " + namaInput);
                System.out.println("Harga Barang = Rp. " + hargaInput);

                System.out.print("Masukkan Jumlah Beli = ");
                jumlahBeli = scanner.nextInt();

                totalHarga = hargaInput * jumlahBeli;

                System.out.println("Total Harga = Rp. " + totalHarga);

                System.out.print("Ada Kartu Member? (Y/N) = ");
                String memberInput = scanner.next();
                if (memberInput.equalsIgnoreCase("Y")) {
                    diskon = (int) (0.15 * totalHarga);
                    System.out.println("Diskon = Rp. " + diskon);
                    totalHarga -= diskon;
                }

                System.out.println("Total Harga setelah Diskon = Rp. " + totalHarga);

                System.out.print("Masukkan Pembayaran = ");
                pembayaran = scanner.nextInt();

                if (pembayaran >= totalHarga) {
                    kembalian = pembayaran - totalHarga;
                    System.out.println("Terima kasih, kembalian anda = Rp. " + kembalian);
                } else {
                    System.out.println("Maaf, pembayaran kurang. Transaksi dibatalkan.");
                }

                stokBarang[index] -= jumlahBeli;

            } else {
                System.out.println("Kode Barang tidak valid. Silakan coba lagi.");
            }

            System.out.print("Mau Coba Lagi? (Ya/Tidak) = ");
        } while (scanner.next().equalsIgnoreCase("Ya"));

        System.out.println("Okesii.");
    }
}
