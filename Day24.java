package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        //Rumus luas lingkaran
        // L = Math * r pangkat 2
        //L = luas lingkaran
        //r = jari-jari lingkaran (setengah dari diameter)
        
        System.out.print("Masukkan jari-jari lingkaran : ");
        double r = input.nextDouble();
        
        double luas = Math.PI * r * r;
        
        System.out.println("Luas lingkaran jari-jari " + r + "adalah: " + luas);
    }
    
}
