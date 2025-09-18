package Day11.java;
import java.util.Scanner;

public class Codingday11 {
    public static void main(String[] args) {
        // membuat objek scanner
        Scanner input = new Scanner(System.in);
        
        //input nama (String)
        System.out.print("Masukkan nama :");
        String nama = input.nextLine();
        
        //input umur (int)
        System.out.print("Masukkan umur :");
        int umur = input.nextInt();
        
        //input tinggi badan (double)
        System.out.print("Masukkan tinggi badan (meter):");
        double tinggi = input.nextDouble();
        
        //output akan meminta kita untuk memasukkan nama,umur dan tinggi badan
        System.out.println("Nama    : "+ nama+ " diwianti");
        System.out.println("Umur    : "+ umur + " tahun");
        System.out.println("Tinggi  : "+ tinggi + "cm" );
        
        
    }
    
}
