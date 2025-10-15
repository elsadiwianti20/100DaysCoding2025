package day38;

import java.util.Scanner;

public class Codingday38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka:");
        int angka = input.nextInt();

        if (angka > 0) {
            System.out.println("positif");
        } else if (angka < 0) {
            System.out.println("negatif");
        } else {
            System.out.println("nol");
        }
    }
}
