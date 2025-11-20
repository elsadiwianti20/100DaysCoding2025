package elsaaaaa;

import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("=== MENU MAKANAN ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Ayam Bakar");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih: Nasi Goreng ");
                    break;

                case 2:
                    System.out.println("Anda memilih: Ayam Bakar ");
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

            System.out.println();

        } while (pilihan != 3);
    }
}
