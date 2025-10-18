package latihn.evaluasii;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan menu");
        System.out.println("1. Nasi goreng – Rp 15.000");
        System.out.println("2. Mie goreng – Rp 12.000");
        System.out.println("3. Ayam bakar – Rp 18.000");
        System.out.print("Masukkan pilihan menu: ");
        int a = input.nextInt();

        System.out.print("Masukkan jumlah porsi: ");
        int b = input.nextInt();

        String menu = "";
        double harga = 0;

        if (a == 1) {
            menu = "Nasi Goreng – Rp 15.000";
            harga = 15000;
        } else if (a == 2) {
            menu = "Mie goreng – Rp 12.000";
            harga = 12000;
        } else if (a == 3) {
            menu = "Ayam bakar – Rp 18.000";
            harga = 18000;
        }

        double total = harga * b;

        if (b > 2 && total > 50000) {
            total = total - (total * 0.1);
        } else if (total > 50000 || b > 2) {
            total = total - (total * 0.05);
        }

        System.out.println("Menu : " + menu);
        System.out.println("Jumlah : " + b);
        System.out.println("total harga : " + harga);
    }
}
