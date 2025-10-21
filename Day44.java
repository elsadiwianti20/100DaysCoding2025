package Day44;

import java.util.Scanner;

public class codingday44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        String predikat;

        if (nilai >= 85 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 70 && nilai < 85) {
            predikat = "B";
        } else if (nilai >= 55 && nilai < 70) {
            predikat = "C";
        } else if (nilai >= 0 && nilai < 55) {
            predikat = "D";
        } else {
            predikat = "Nilai tidak valid!";
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Predikat: " + predikat);
    }
}
