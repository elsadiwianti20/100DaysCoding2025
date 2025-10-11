package Day34;
import java.util.Scanner;

public class codingday34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan umur");
        int umur = input.nextInt();

        System.out.println("punya sim?");
        boolean punyaSim = input.nextBoolean();

        if(umur >= 18 && punyaSim == true){
            System.out.println("kamu boleh mengemudi");
        }else{
            System.out.println("belum boleh mengemudi");
        }
    }
}
