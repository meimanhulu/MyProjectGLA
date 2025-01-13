package com.belajarJava.belajarcollection;

public class Customer {
    private String name;
    private String email;
    private Mobil[] listOfMobil;

    Customer(String name, String email, int totalOfMobil) {
        this.name = name;
        this.email = email;
        this.listOfMobil = new Mobil[totalOfMobil];
    }

    void addMobil(Mobil mobil) {
        for (int i = 0; i < listOfMobil.length; i++) {
            if (listOfMobil[i] == null) {
                this.listOfMobil[i] = mobil;
                break;
            }
        }
    }

    void cetakMobil() throws NullPointerException {
        for (Mobil m: listOfMobil) {
            System.out.println(m.getMerk() + " " + m.getPrice());
        }
    }
}
