package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Gaji Karyawan");
        System.out.println("=====================");

        System.out.print("Masukkan Nama Karyawan : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Golongan : ");
        String golongan = input.nextLine();

        System.out.print("Masukkan Status Pernikahan (y/n) : ");
        String status = input.nextLine().toLowerCase();

        int jml_anak = 0;  // Inisialisasi jumlah anak dengan nilai default

        // Memeriksa status pernikahan
        if (status.equals("y")) {
            System.out.print("Masukkan Jumlah Anak : ");
            jml_anak = input.nextInt();
        } else if (!status.equals("n")) {
            System.out.println("Status Pernikahan Tidak Ada, Silahkan Input Lagi");
            System.exit(0);
        }

        System.out.print("Masukkan Pajak (%) : ");
        double pajak = input.nextDouble();

        int gaji = 0;
        switch (golongan.toUpperCase()) {
            case "3B" -> gaji = 2000000;
            case "3C" -> gaji = 3000000;
            case "3D" -> gaji = 4000000;
            default -> {
                System.out.println("Golongan Tidak Ada, Silahkan Input Lagi");
                System.exit(0);
            }
        }

        int tunjangan_istri = 0;
        if (status.equals("y")) {
            tunjangan_istri = 500000;
        } else {
            System.out.println("Status Pernikahan Tidak Ada, Silahkan Input Lagi");
            System.exit(0);
        }

        int tunjangan_anak = (jml_anak <= 3) ? jml_anak * 100000 : 400000;
        int gaji_kotor = gaji + tunjangan_istri + tunjangan_anak;
        double nominal_pajak = pajak / 100 * gaji_kotor;
        double gaji_bersih = gaji_kotor - nominal_pajak;

        System.out.println("---------------------------------------------");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan : " + golongan);
        System.out.println("Gaji Pokok : Rp. " + String.format("%,d", gaji));
        System.out.println("Status Pernikahan : " + status);
        System.out.println("Tunjangan Istri : Rp. " + String.format("%,d", tunjangan_istri));
        System.out.println("Jumlah Anak : " + jml_anak + " Orang");
        System.out.println("Tunjangan Anak : Rp. " + String.format("%,d", tunjangan_anak));
        System.out.println("---------------------------------------------");
        System.out.println("Gaji Kotor : Rp. " + String.format("%,d", gaji_kotor));
        System.out.println("Nominal Pajak : Rp. " + String.format("%,.0f", nominal_pajak));
        System.out.println("Gaji Bersih : Rp. " + String.format("%,d", (int) gaji_bersih));
    }
}