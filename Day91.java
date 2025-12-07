package elsaaaaaa;

public class Day91 {

    public static void main(String[] args) {
        
        cetakSalam("Pagi");

        int hasilAkhir = hitungLuasPersegi(7);

        System.out.println("Luas persegi dengan sisi 7 adalah: " + hasilAkhir);
    }

    public static void cetakSalam(String waktu) {
        System.out.println("Selamat " + waktu + " semuanya!");
    }

    public static int hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }
}
