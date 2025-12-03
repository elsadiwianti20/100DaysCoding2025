package elsaaaaaa;

import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];
      
        System.out.println("Masukkan elemen-elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        System.out.print("\nMasukkan angka yang ingin dicari: ");
        int cari = input.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (data[i] == cari) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Angka " + cari + " ditemukan dalam array.");
        } else {
            System.out.println("Angka " + cari + " TIDAK ditemukan dalam array.");
        }
    }
}
