package day40;
import java.util.Scanner;
public class codingday40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan (1-4): ");
        int operasi = input.nextInt();
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        double hasil;

        if (operasi == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil: " + hasil);
        } else if (operasi == 4) {
            if (angka2 == 0) {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            } else {
                hasil = angka1 / angka2;
                System.out.println("Hasil: " + hasil);
            }
        } else {
            System.out.println("Pilihan operasi tidak valid.");
        }

    }
}
