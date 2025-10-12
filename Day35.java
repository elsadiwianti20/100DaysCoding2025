package elmutt;

import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Masukkan kehadiran: ");
        int kehadiran = input.nextInt();

        if (nilai >= 70 && kehadiran >= 8) {
            System.out.println("Kamu lulus");
        } else {
            System.out.println("Kamu tidak lulus");
        }
    }
}
