package elsaaaaa;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];  

        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + i + ": ");
            nilai[i] = input.nextInt();
        }

        System.out.println("Semua elemen array");

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Index " + i + " = " + nilai[i]);
        }
    }
}
