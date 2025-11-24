package elsaaaaa;

public class Day78 {
    public static void main(String[] args) {

        String teks = "   assalamualaikum Elsa Diwianti   ";
      
        System.out.println(teks.trim());
        System.out.println(teks.toUpperCase());
        System.out.println(teks.replace("Elsa", "ELSA"));
        System.out.println(teks.contains("Diwianti"));
        System.out.println(teks.equals("assalamualaikum Elsa Diwianti"));
        System.out.println(teks.substring(3, 18));
    }
}
