package elsaaaaaa;

import java.util.Scanner;

public class Day92 {

    int kaliDua(int angka) {
        return angka * 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Day92 data = new Day92();   

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int hasil = data.kaliDua(n);

        System.out.println("Hasil kali dua: " + hasil);
    }
}
