package elsaaaaaa;

import java.util.Scanner;

public class Day90 {

    String sapa(String nama) {
        return "Halo " + nama;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Day90 obj = new Day90();

        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        String hasil = obj.sapa(nama);
        System.out.println(hasil);
    }
}
