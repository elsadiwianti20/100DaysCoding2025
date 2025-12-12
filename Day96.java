package elsaaaaaa;

import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input angka pertama : ");
        int a = sc.nextInt();

        System.out.print("Input angka kedua   : ");
        int b = sc.nextInt();

        int jml = tambah(a, b);
        int krg = kurang(a, b);
        int kl  = kali(a, b);
        int bg  = bagi(a, b);

        System.out.println("\n=== HASIL OPERASI ===");
        System.out.println("Penjumlahan   : " + jml);
        System.out.println("Pengurangan   : " + krg);
        System.out.println("Perkalian     : " + kl);
        System.out.println("Pembagian     : " + bg);
    }

    public static int tambah(int x, int y) {
        return x + y;
    }

    public static int kurang(int x, int y) {
        return x - y;
    }

    public static int kali(int x, int y) {
        return x * y;
    }

    public static int bagi(int x, int y) {
        return x / y;
    }
}
