package elsaaaaa;

import java.util.Scanner;

public class day79 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Buat username: ");
        String usernameAsli = input.nextLine();

        System.out.print("Buat password: ");
        String passwordAsli = input.nextLine();

        System.out.println("\nAkun berhasil dibuat\n");

        String usernameInput;
        String passwordInput;

        while (true) {
            System.out.print("Masukkan username: ");
            usernameInput = input.nextLine();

            System.out.print("Masukkan password: ");
            passwordInput = input.nextLine();

            if (usernameInput.equals(usernameAsli) && passwordInput.equals(passwordAsli)) {
                System.out.println("Login berhasil! Selamat datang " + usernameAsli);
                break;
            }else{
               System.out.println("Username atau password salah, Coba lagi.\n");
        }
    }
}
