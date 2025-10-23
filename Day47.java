package Day47;

import java.util.Scanner;

public class codingday47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Menentukan Nama Hari ===");
        System.out.print("Masukkan angka (1–7): ");
        int hari = input.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari ke-" + hari + " adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + hari + " adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ke-" + hari + " adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ke-" + hari + " adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ke-" + hari + " adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ke-" + hari + " adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-" + hari + " adalah Minggu");
                break;
            default:
                System.out.println("Angka yang dimasukkan tidak valid! Harus");
        }
    }
}
