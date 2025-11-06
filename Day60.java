package elsaaaaaa;

public class codingday60 {
    public static void main(String[] args) {
        int N = 10;

        System.out.println(" Angka Ganjil dari " + N + " ke 1 ");
        for (int i = N; i >= 1; i--) { 
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("Angka Genap dari " + N + " ke 1");
        for (int i = N; i >= 1; i--) { 
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
