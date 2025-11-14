package elsaaaaa;

import java.util.Scanner;

public class codingday68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan ukuran persegi: ");
        int N = input.nextInt();

        for (int i = 1; i <= N; i++) {         
            for (int j = 1; j <= N; j++) {     
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
