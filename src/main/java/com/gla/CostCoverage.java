package com.gla;

public class CostCoverage {
    public static void main(String[] args) {
        // Konstanta yang digunakan dalam perhitungan
        double cmyk = 6000;
        double priceTinta = 216860;
        double constantBaseCoverage = 5;

        // Menampilkan header
        System.out.println("Price List Biaya Tinta");

        // Perulangan dari 5 hingga 80 dengan kenaikan 5
        for (int i = 5; i <= 80; i += 5) {
            double hasilBaseCoverage = i / constantBaseCoverage;
            double pageDiv = cmyk / hasilBaseCoverage;
            double result = priceTinta / pageDiv;
            int resultFinal = (int) Math.ceil(result);

            // Format output
            System.out.println("CVG-" + i + "% Rp. " + resultFinal);
        }
    }
}