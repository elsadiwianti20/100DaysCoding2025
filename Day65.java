package elsaaaaa;

import java.util.Scanner;

public class codingday65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan N: ");
        int N = input.nextInt();

        int faktorial = 1; 

        for (int i = 1; i <= N; i++) {
            faktorial = faktorial * i; 
        }

        System.out.println("Faktorial dari " + N + " adalah: " + faktorial);
    }
}
