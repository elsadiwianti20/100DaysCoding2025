package elsaaaaaa;

import java.util.Scanner;

class codingday50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // Menggunakan operator ternary
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
