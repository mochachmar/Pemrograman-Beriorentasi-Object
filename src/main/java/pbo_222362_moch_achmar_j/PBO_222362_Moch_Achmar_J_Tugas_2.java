package pbo_222362_moch_achmar_j;
import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama, alamat;
        int usia, gaji, tunj;
        double pajak;

        System.out.print("Nama Karyawan : ");
        nama = scanner.nextLine();

        System.out.print("Alamat : ");
        alamat = scanner.nextLine();

        System.out.print("Usia : ");
        usia = scanner.nextInt();

        System.out.print("Gaji : ");
        gaji = scanner.nextInt();

        System.out.print("Tunjangan : ");
        tunj = scanner.nextInt();

        System.out.print("Pajak : ");
        pajak = scanner.nextDouble();

        double totalgajidiluarpajak = gaji + tunj;
        double jumlahpajak = (pajak / 100) * totalgajidiluarpajak;
        double TotalGajiDipotongPajak = totalgajidiluarpajak - jumlahpajak;

        System.out.println("--------------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji pokok: Rp" + formatCurrency(gaji));
        System.out.println("Tunjangan: Rp" + formatCurrency(tunj));
        System.out.println("Total gaji diluar pajak: Rp" + formatCurrency(totalgajidiluarpajak));
        System.out.println("Total pajak: Rp" + formatCurrency(jumlahpajak));
        System.out.println("Total gaji dipotong pajak: Rp" + formatCurrency(TotalGajiDipotongPajak));

        scanner.close();
    }

    private static String formatCurrency(double Gaji) {
        return String.format("%,.0f", Gaji);
    }
 }