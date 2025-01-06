package com.belajarJava;
import java.util.Scanner;
public class Perulangan {

    public static void main(String[] args) {
        System.out.println("Looping");

        // Perulangan menaik dari 0 sampai 4
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // // Perulangan menurun dari 5 sampai 1
        // for (int i = 5; i > 0; i--) {
        //     System.out.print(i);
        // }

        // System.out.println(); // Pindah ke baris baru

        // // Perulangan dengan loncatan 2 (1, 3, 5, 7, 9)
        // for (int i = 1; i < 10; i += 2) {
        //     System.out.print(i);
        // }

        // System.out.println(); 

        // for (int i = 1; i <= 5; i++) { 
        //     for (int j = 1; j <= i; j++) { 
        //         System.out.print("o");
        //     }
        //     System.out.println(); 
        // }

        // for (int i = 5; i >= 1; i--) { // Baris dari 5 hingga 1
        //     for (int j = 1; j <= i; j++) { // Cetak bintang sebanyak nilai i
        //         System.out.print("*");
        //     }
        //     System.out.println(); // Pindah ke baris baru
        // }

        Scanner input = new Scanner(System.in);

        // Perulangan tak terbatas
        while (true) {
            // Meminta pengguna untuk memasukkan angka
            System.out.print("Input ANGKA 0 untuk close program = ");
            int angka = input.nextInt();

            // Jika angka adalah 0, keluar dari loop
            if (angka == 0) {
                break;
            }
        }

        // Menutup objek Scanner
        input.close();
        System.out.println("Program selesai.");
    }

    

}