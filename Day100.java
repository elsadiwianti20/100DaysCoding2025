package elsaaaaaa;

import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int tahap = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (tahap == 0 && c == 'I') {
                tahap = 1;
            } else if (tahap == 1 && c == 'S') {
                tahap = 2;
            } else if (tahap == 2 && c == 'C') {
                System.out.println("CANTIK");
                return;
            }
        }

        System.out.println("TIDAK CANTIK");
    }
}
