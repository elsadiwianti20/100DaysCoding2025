package javaapplication5;

import java.util.Scanner;

public class j {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur:");
        int umur = input.nextInt();
        double harga = 75000;

        if (umur < 12) {
            harga = 45000;
        } else if (umur <= 59) {
            harga = 75000;
        } else {
            harga = 50000;
        }

        input.nextLine(); 
        System.out.println("Masukkan hari:");
        String hari = input.nextLine();

        double total;
        double diskon = 0;

        if (hari.equals("sabtu") || hari.equals("minggu")) {
            diskon = 0.1;
        } else {
            System.out.println("");
        }

        harga = harga + (harga * diskon);
        System.out.println(diskon);

        System.out.println("Masukkan ya / tidak:");
        String punya = input.nextLine();
        double diskon2 = 0;

        if (punya.equalsIgnoreCase("ya")) {
            diskon2 = 0.2;
        }

        System.out.println(diskon);
        total = harga - (harga * diskon2);

        System.out.println(total);
    }
}
