package com.dicoding.javafundamental.propertimetode;

public class Hewan {

    //Properti atau fields
    //Inisiasi dengan nilai inisial
    double tinggi = 30;
    double berat = 3;

    //inisiasi melalui konstruktor
    int umur;

    //konstruktor dengan paramater
    Hewan(int umur) {
        this.umur = umur;
    }

    void lari(){
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan(){
        System.out.println("Berjalan dengan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }

    double getTinggi() {
        return tinggi;
    }

    int getUmur() {
        return umur;
    }
}
