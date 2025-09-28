package Day21.java;
public class codingday21 {
    public static void main(String[] args) {
        int e = 18;
        int l = 20;
        
        e = e + l;
        l = e - l;
        e = e - l;
        
        System.out.println("Setelah ditukar:");
        System.out.println("e = " + e);
        System.out.println("l = " + l);
      
    }
    
}
