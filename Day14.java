package Day14;
public class Codingday14 {
    public static void main(String[] args) {
        String a = "18";
        String b = "2006";
        String c = "20";
        String d = "12345678910";
        String e = "155.5";
        String f = "50.5";
        String g = "B";
        String h = "true";
        

        byte umur = Byte.parseByte(a);
        short tahunLahir = Short.parseShort(b);
        int angkaFavorit =Integer.parseInt(c);
        long angka1_10 = Long.parseLong(d);
        float tinggi = Float.parseFloat(e);
        double bb = Double.parseDouble(f);
        char golonganDarah = g.charAt(0);
        boolean pintar = Boolean.parseBoolean(h);
        
        System.out.println("String " + a +" jadi byte " + umur);
        System.out.println("String " + b +" jadi short " + tahunLahir);
        System.out.println("String " + c +" jadi int " + angkaFavorit);
        System.out.println("String " + d +" jadi long " + angka1_10);
        System.out.println("String " + e +" jadi float " + tinggi);
        System.out.println("String " + f +" jadi double " + bb);
        System.out.println("String " + g +" jadi char "+ golonganDarah);
        System.out.println("String " + h +" jadi boolean " + pintar);
        
        
        
        
        
    }
    
}
