package Day43;

import java.util.Scanner;

public class codingday43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int e = in.nextInt();

        if (e % 3 == 0 && e % 5 == 0) {
            System.out.println(e + " Kelipatan 3 dan 5 ");
        } else if (e % 3 == 0) {
            System.out.println(e + " Kelipatan 3 ");
        } else if (e % 5 == 0) {
            System.out.println(e + " Kelipatan 5 ");
        } else {
            System.out.println(e + " Bkn kelipatan 3 & 5");
        }
    }
}
