package elsaaaa;
import java.util.Scanner;

public class codingday55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true; 

        while (ulang) {
            System.out.println("=== PROGRAM KONVERSI SATUAN ===");
            System.out.println("1. Celcius ke Fahrenheit");
            System.out.println("2. Kilometer ke Meter");
            System.out.println("3. Jam ke Menit");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nilai Celcius: ");
                    double c = input.nextDouble();
                    double f = (c * 9 / 5) + 32;
                    System.out.println("Hasil: " + f + " °F");
                    break;

                case 2:
                    System.out.print("Masukkan nilai Kilometer: ");
                    double km = input.nextDouble();
                    double m = km * 1000;
                    System.out.println("Hasil: " + m + " meter");
                    break;

                case 3:
                    System.out.print("Masukkan nilai Jam: ");
                    double jam = input.nextDouble();
                    double menit = jam * 60;
                    System.out.println("Hasil: " + menit + " menit");
                    break;

                case 4:
                    System.out.println("Keluar dari program...");
                    ulang = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            if (ulang) {
                System.out.print("Apakah ingin konversi lagi? (y/n): ");
                char lagi = input.next().charAt(0);
                if (lagi == 'n' || lagi == 'N') {
                    ulang = false;
                    System.out.println("Program selesai.");
                }
                
            }
        }
    }
}
