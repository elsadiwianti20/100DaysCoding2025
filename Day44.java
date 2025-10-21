package Day44;

import java.util.Scanner;

public class codingday44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        String predikat;

        if (nilai >= 90 && nilai <= 100) {
            predikat = "A";
        } else if (nilai >= 80 && nilai < 90) {
            predikat = "B";
        } else if (nilai >= 70 && nilai < 80) {
            predikat = "C";
        } else if (nilai >= 60 && nilai < 70) {
            predikat = "D";
        } else if (nilai >= 0 && nilai < 60) {
            predikat = "E";
        } else {
            predikat = "Nilai tidak valid!";
        }

        System.out.println("Nilai Anda: " + nilai);
        System.out.println("Predikat: " + predikat);
    }
}
