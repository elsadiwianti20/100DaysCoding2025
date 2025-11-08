package elsaaaaa;

import java.util.Scanner;

public class codingday62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas akhir (N): ");
        int N = input.nextInt();

        int jumlah = 0; 

        for (int i = 1; i <= N; i++) {
            jumlah = jumlah + i;
        }

        System.out.println("Jumlah dari 1 sampai " + N + " adalah: " + jumlah);
    }
}
