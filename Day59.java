package elsaaaaaa;

public class codingday59 {
    public static void main(String[] args) {
        int N = 10; 

        System.out.println("=== Angka Ganjil 1 sampai " + N + " ===");
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("=== Angka Genap 1 sampai " + N + " ===");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
