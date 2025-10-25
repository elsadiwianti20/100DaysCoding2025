package Day48;

import java.util.Scanner;

public class codingday48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== KALKULATOR=====");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();
        double hasil;
      
        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Hasil + : " + hasil);
                break;
            case 2:
                hasil = a - b;
                System.out.println("Hasil - : " + hasil);
                break;
            case 3:
                hasil = a * b;
                System.out.println("Hasil * : " + hasil);
                break;
            case 4:
                if (b != 0) {
                    hasil = a / b;
                    System.out.println("Hasil / : " + hasil);
                } else {
                    System.out.println("Eror: tidak boleh dibagi 0");
                }
                break;
            default:
                System.out.println(" tidak valid");
        }
    }
}
