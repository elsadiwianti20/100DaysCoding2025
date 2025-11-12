package elsaaaaa;

import java.util.Scanner;

public class codingday66_angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka (N): ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i); 
        }
    }
}
