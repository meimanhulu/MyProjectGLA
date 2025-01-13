package com.belajarJava.belajarcollection;

public class DemoMobilArray {
    public static void main(String[] args) {
        Mobil listOfMobil[] = new Mobil[10];
        listOfMobil[0] = new Mobil("C", 100);
        listOfMobil[1] = new Mobil("D", 450);
        listOfMobil[7] = new Mobil("G", 230);
        Mobil lom2[] = {new Mobil("A", 1), new Mobil("B", 3)};

        for (Mobil m: lom2) {
            System.out.println(m.getMerk() + " " + m.getPrice());
        }

        for (Mobil m: listOfMobil) {
            try {
                System.out.println(m.getMerk() + " " + m.getPrice());
            } catch (NullPointerException e) {
                continue;
            }

        }

//        try {
//
//        } catch (NullPointerException e) {
        cust1.addMobil(new Mobil("M2", 124));
        cust1.addMobil(new Mobil("M3", 124));
        cust1.addMobil(new Mobil("M4", 124));
        cust1.addMobil(new Mobil("M5", 124));
        cust1.addMobil(new Mobil("M6", 124));
        cust1.addMobil(new Mobil("M7", 124));
        cust1.addMobil(new Mobil("M8", 124));
        cust1.addMobil(new Mobil("M9", 124));
        cust1.addMobil(new Mobil("M10", 124));
//            System.out.println("Error terjadi karena ada data yang belum diisi");
//        }

    }
}
