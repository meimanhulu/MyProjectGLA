package com.belajarJava.belajarlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoIrisan {
    public static void main(String[] args) {
        ArrayList<String> batch20 = new ArrayList<String>();
        batch20.add("Glen");
        batch20.add("Yonas");
        batch20.add("Alvin");

        ArrayList<String> batch21 = new ArrayList<>();
        batch21.add("Uus");
        batch21.add("Feronika");
        batch21.add("Sandi");
        batch21.add("Glen");
        batch21.add("Yonas");

        batch20.retainAll(batch21);

        System.out.println(batch20);

        ArrayList<String> hobiGlen = new ArrayList<String>();
        ArrayList<String> hobiMeymand = new ArrayList<String>();


//        hobiGlen.add("Naik Gunung"); // dibuang
        hobiGlen.add("Mancings"); // dibuang
        hobiGlen.add("Bersepedas"); // dibuang
        hobiGlen.add("Berenangs");

        hobiMeymand.add("Mancing");
        hobiMeymand.add("Bersepeda");
        hobiMeymand.add("Berenang");

        hobiMeymand.set(1, "Motoran");

        // kalo sama semua : false
        // sebagian yang sama: true
        // seluruhnya tidak sama: true


        System.out.println(hobiGlen.retainAll(hobiMeymand));

        System.out.println(hobiGlen);

        // lowongan
        // - java
        // - sql
        // - automation
        // - selenium

        // pelamar x
        // - java
        // - sql
        // - python
        // - git

        // syarat minimum diterima minimal punya 3 keahlian yang sesuai
        // cetak "anda tidak sesuai" jika kurang dari 3


    }
}
