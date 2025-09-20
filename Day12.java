package Day12.java;
import java.util.Scanner;

public class Codingday12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println(" input Biodata");
        
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
        
        System.out.println("Biodata");
        System.out.println("Nama:"+ nama);
        System.out.println("Umur:"+ umur);
        System.out.println("Jumlah saudara:"+ jumlahBersaudara);
        System.out.println("Tahun lahir:"+ tahunLahir);
        System.out.println("No HP:"+ noHp);
        System.out.println("Tinggi:"+tinggi);
        System.out.println("Ukuran sepatu:"+ ukuranSepatu);
        System.out.println("Perempuan:"+ perempuan);
        System.out.println("Laki-laki:"+ laki_laki);
        System.out.println("Golongan darah:"+ golonganDarah);
        
        
          
    }
    
}

       
