package elsaaaaaa;

import java.util.Scanner;

public class Day97 {

    static int hitungLuas(int sisi) {
    return sisi * sisi;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        int luas = hitungLuas(sisi);

        System.out.println("Luas persegi adalah: " + luas);
    }
}
