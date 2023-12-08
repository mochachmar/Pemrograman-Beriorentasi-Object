package pbo_222362_moch_achmar_j;

import java.util.Scanner;

public class PBO_222362_Moch_Achmar_J_Tugas_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator Ku :v");
        System.out.println("====================");

        System.out.print("Angka 1 = ");
        int angka1 = scanner.nextInt();

        System.out.print("Angka 2 = ");
        int angka2 = scanner.nextInt();

        System.out.print("====================");
        System.out.print(" ");
        char operator = scanner.next().charAt(0);

        int hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan " + angka1 + " dan " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan " + angka1 + " dan " + angka2 + " = " + hasil);
                break;
            case 'x':
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian " + angka1 + " dan " + angka2 + " = " + hasil);
                break;
            case ':':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil Pembagian " + angka1 + " dan " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Sorry mami, pembagian dgn nol ndk diperbolehkan !");
                }
                break;
            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil Modulus " + angka1 + " dan " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Sorry mami, modulus dgn nol ndk diperbolehkan !");
                }
                break;
            default:
                System.out.println("Sorry mami, Operator ndk cocok !");
        }

        scanner.close();
    }
}
