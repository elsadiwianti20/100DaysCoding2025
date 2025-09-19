package Day12.java;
import java.util.Scanner;

public class Codingday12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Biodata");
        
        System.out.println("nama");
        String nama = input.nextLine();
     
        System.out.println("umur:");
        byte umur = input.nextByte ();
        
        System.out.println(" jumlah saudara");
        short jumlahBersaudara = input.nextShort ();
        
        System.out.println("Tahun lahir");
        int tahunLahir = input.nextInt ();
        
        System.out.println("No HP");
        long noHp = input.nextLong ();
        
        System.out.println("Tinggi");
        float tinggi = input.nextFloat ();
        
        System.out.println("Ukuran sepatu");
        double ukuranSepatu = input.nextDouble();    
    
        System.out.println("Perempuan");
        boolean perempuan = input.nextBoolean();
        
        System.out.println("laki_laki");
        boolean laki_laki = input.nextBoolean();
        
        //next char tidak ada di scanner karena dibaca String
        System.out.println("Golongan darah");
        char golonganDarah = input.next().charAt (0);
        
        
          
    }
    
}
