package elsaaaaaa;

public class codingday61 {
    public static void main(String[] args) {
        int N = 50; 
        int M = 5;  

        System.out.println("Bilangan kelipatan " + M + " dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            if (i % M == 0) { 
                System.out.print(i + " ");
            }
        }
    }
}
