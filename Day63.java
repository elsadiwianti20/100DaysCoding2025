package elsaaaaa;

import java.util.Scanner;

public class codingday63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas akhir (N): ");
        int N = input.nextInt();

        int hasil = 1; 
        for (int i = 1; i <= N; i++) {
            hasil = hasil * i;
        }

        System.out.println("Hasil perkalian (1 x 2 x ... x " + N + ") adalah: " + hasil);
    }
}
