package com.belajarJava;
import java.util.Scanner;
public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Harga tiket weekday dan weekend
        int hargaWeekday = 35000;
        int hargaWeekend = 45000;

        // Meminta input jumlah tiket
        System.out.print("Masukkan jumlah tiket: ");
        int jumlahTiket = scanner.nextInt();

        // Tentukan harga tiket
        boolean isWeekend = true; // Ubah sesuai kondisi (true jika weekend, false jika weekday)
        int hargaTiket = isWeekend ? hargaWeekend : hargaWeekday;

        // Hitung total harga
        int totalHarga = jumlahTiket * hargaTiket;

        // Berikan diskon jika jumlah tiket > 5
        if (jumlahTiket > 5) {
            totalHarga *= 0.9; // Diskon 10%
        }

        // Cetak hasil
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + totalHarga);
    }
}

