package elsaaaaa;

import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (negatif untuk berhenti): ");
            angka = input.nextInt();

            if (angka < 0) {
                
            }

            total += angka; 
        }

        System.out.println("Total penjumlahan = " + total);
    }
}
