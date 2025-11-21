package elsaaaaaa;

import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Tulis teks apa saja: ");
        String teks = input.nextLine();

        System.out.println("Panjang teks: " + teks.length());

        System.out.println(" Huruf besar semua: " + teks.toUpperCase());

        System.out.println(" Huruf kecil semua : " + teks.toLowerCase());
    }
}
