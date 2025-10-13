package day36;

import java.util.Scanner;

public class Day366 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt();

        System.out.print("Apakah kamu punya KTP? (ya/tidak): ");
        String ktp = input.nextLine();

        if (umur >= 17) {
            if (ktp.equalsIgnoreCase("ya")) {
                System.out.println("Kamu boleh ikut pemilu!");
            } else {
                System.out.println("Umur kamu cukup, tapi belum punya KTP.");
            }
        } else {
            System.out.println("Kamu belum cukup umur untuk ikut pemilu.");
        }

    }
}
