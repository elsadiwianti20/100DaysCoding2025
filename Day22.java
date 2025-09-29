package Day22.java;
import java.util.Scanner;
public class codingDay22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--program luas persegi--");
        
        System.out.println("Masukkan panjang sisi persegi");
        int sisi = input.nextInt();
       
        int luas = sisi*sisi;
        System.out.println("Luas persegi adalah: " + luas);
        
        
    } 
    
}
