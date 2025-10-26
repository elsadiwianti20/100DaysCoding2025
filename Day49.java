package elsaaaaaa;
import java.util.Scanner;
public class codingday49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        //operator ternary 
        String kategori = (umur >= 18) ? "Dewasa" : "Anak-anak";
        System.out.println("Kategori umur: " + kategori);
    }
}
