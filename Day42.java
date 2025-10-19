package Day42;

import java.util.Scanner;

public class codingday42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan gaji pokok");
        double gajiPokok = input.nextDouble();

        System.out.println("Masukkan tunjangan");
        double tunjangan = input.nextDouble();

        System.out.println("Masukkan pajak (%)");
        double pajakPersen = input.nextDouble();

        System.out.println("Masukkan potongan lain");
        double potonganLain = input.nextDouble();

        double bonus = 0;
        if (gajiPokok > 5000000) {
            bonus = gajiPokok * 10 / 100;
            System.out.println("Selamat anda mendapatkan bonus 10%: Rp " + bonus);
        } else {
            System.out.println("Tidak ada bonus");
        }

        double gajiKotor = gajiPokok + tunjangan + bonus;
        double pajak = gajiKotor * pajakPersen / 100;
        double gajiBersih = gajiKotor - pajak - potonganLain;

        System.out.println("Gaji pokok     : Rp " + gajiPokok);
        System.out.println("Tunjangan      : Rp " + tunjangan);
        System.out.println("Bonus          : Rp " + bonus);
        System.out.println("Gaji Kotor     : Rp " + gajiKotor);
        System.out.println("Potongan Pajak : Rp " + pajak);
        System.out.println("Potongan Lain  : Rp " + potonganLain);
        System.out.println("Gaji Bersih    : Rp " + gajiBersih);
    }
          }
