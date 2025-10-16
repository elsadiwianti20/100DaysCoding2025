package day39;

import java.util.Scanner;

public class codingday39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Menu Rasa Es cream===");
        System.out.println("1. Vanila");
        System.out.println("2. Cokelat");
        System.out.println("3. Strowbery");
        System.out.print("Masukkan pilihan 1-3: ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Kamu memilih Vanila");
        } else if (pilihan == 2) {
            System.out.println("Kamu memilih Cokelat");
        } else if (pilihan == 3) {
            System.out.println("Kamu memilih Strowbery");
        } else {
            System.out.println("Pilihan kamu tidak tersedia");
        }

        System.out.println("TERIMA KASIH SUDAH BERKUNJUNG");
    }
}
