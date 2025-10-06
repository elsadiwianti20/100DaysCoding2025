package Day29.java;

import java.util.Scanner;

public class Codingday29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan angka pertama");
        int angka1 = input.nextInt();
        
        System.out.println("masukkan angka kedua");
        int angka2 = input.nextInt();
        
        if (angka1 < angka2){
            System.out.println(angka1 + " lebih kecil dari " + angka2);
        }else if(angka1 > angka2){
            System.out.println(angka1 + " lebih besar dari " + angka2);
        }else{
            System.out.println(angka1 + " sama dengan " + angka2);
        }
    }
    
}
