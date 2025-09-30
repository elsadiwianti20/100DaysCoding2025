package Day23.java;
import java.util.Scanner;
public class codingday23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang : ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar : ");
        int lebar = input.nextInt();
        
        System.out.println("Luas persegi panjang : " + (panjang*lebar));
    }
    
}
