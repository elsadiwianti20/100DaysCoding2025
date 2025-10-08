package Day31.java;
import java.util.Scanner;

public class Codingday31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai: ");
        int nilai = input.nextInt();

        System.out.println("Masukkan kehadiran: ");
        int kehadiran = input.nextInt();

        if (nilai >= 70 && kehadiran >= 85) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak lulus");
        }
    }
}
