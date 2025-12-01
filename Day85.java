package elsaaaaaa;

import java.util.Scanner;

public class Day85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array ");
        int n = input.nextInt();

        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        int max = data[0];
        for (int i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        System.out.println("Nilai maksimal = " + max);
    }
}
