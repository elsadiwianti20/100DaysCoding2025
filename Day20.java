package Day20.java;
public class codingday20 {
    public static void main(String[] args) {
        //tipe data primitif
        byte umur = 18;
        short tahun_kelahiran = 2006;
        int tinggi_badan = 155;
        long nomorHp = 82395879964L;
        float bb = 55.5f;
        boolean perempuan = true;
        char jk = 'P';
        double harga_minyak = 15.000;
        // pakai " "
        String s1 = umur + "";  
        String s2 = tahun_kelahiran +"";
        String s3 = tinggi_badan +"";     
        
        // pakai valueOf      
        String s4 = String.valueOf(nomorHp);
        String s5 =String.valueOf(bb);
        
        //pakai toString
        String s6 = Boolean.toString(perempuan);
        String s7 = Character.toString(jk);
        String s8 = Double.toString(harga_minyak);
        
        
        System.out.println("byte ke String:" + s1);
        System.out.println("short ke String:" + s2);
        System.out.println("Integer ke String:" + s3);
        System.out.println("long ke String:" + s4);
        System.out.println("float ke String:" + s5);
        System.out.println("boolean ke String:" + s6);
        System.out.println("char ke String:" + s7);
        System.out.println("double ke String:" + s8);
        
        
               
        
        
        
    }
    
}
