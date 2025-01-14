package com.belajarJava.belajarlist;

import java.util.ArrayList;

public class SeleksiKandidat {
    public static void main(String[] args) {
        ArrayList<String> lowongan = new ArrayList<String>();
        lowongan.add("Java");
        lowongan.add("Sql");
        lowongan.add("Automation");
        lowongan.add("Selenium");

        ArrayList<String> pelamarX = new ArrayList<String>();
        pelamarX.add("Java");
        pelamarX.add("Sql");
        pelamarX.add("Python");
        pelamarX.add("Git");
        // pelamarX.add("Selenium");

        
        ArrayList<String> SkillSesuai = new ArrayList<>(lowongan);

        SkillSesuai.retainAll(pelamarX);

        if (SkillSesuai.size() >= 3) {
            System.out.println("Selamat! Anda sesuai dengan kriteria.");
            System.out.println("Keahlian yang masuk kriteria: " + SkillSesuai);
        } else {
            System.out.println("Maaf, anda belum sesuai kriteria.");
            System.out.println("Keahlian yang masuk kriteria: " + SkillSesuai);
        }
    }
}