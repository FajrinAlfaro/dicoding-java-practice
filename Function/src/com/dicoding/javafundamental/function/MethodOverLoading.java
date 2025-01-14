package com.dicoding.javafundamental.function;

import static com.dicoding.javafundamental.function.ReturnFunction.hitungLuas;

public class MethodOverLoading {
    public static void main(String[] args) {
        double p = 7;
        double l = 6.5;
        double hasil = hitungLuas(p, l);
        System.out.println("Hasilnya adalah = " + hasil);
        int pn = 7;
        int lb = 6;
        int hsl = (int) hitungLuas(pn, lb);
        System.out.println("Hasilnya adalah = " + hsl);
    }

    public static double hitungLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }
}
