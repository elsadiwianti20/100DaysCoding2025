package elsaaaaaa;

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        double ceil = Math.ceil(angka);
        double floor = Math.floor(angka);
        long round = Math.round(angka);

        System.out.println("\nHasil Pembulatan:");
        System.out.println("ceil()  : " + ceil);
        System.out.println("floor() : " + floor);
        System.out.println("round() : " + round);
    }
}
