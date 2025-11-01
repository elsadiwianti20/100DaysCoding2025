package elsaaaaaa;
import java.util.Scanner;

public class codingday55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Batas Bawah : ");
        int a = input.nextInt();

        System.out.print("Batas Atas : ");
        int b = input.nextInt();

        System.out.print("Angka : ");
        int c = input.nextInt();

        if (c >= a && c <= b) {
            System.out.println("YAYAYAYA");
        } else {
            System.out.println("NONONONO");
        }
    }
}
