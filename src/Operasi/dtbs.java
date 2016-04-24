/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operasi;

/**
 *
 * @author Bachtiar
 */
public class dtbs {

    public static void Penjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void Pengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public void Perkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public void Pembagian(double a, double b) {
        double nilai = a / b;
        System.out.println("nilai pembagian adalah : " + nilai /*+ getSederhana()*/);
    }

    public void Sederhana(int a, int b) {
        int nilai = a / b;
        System.out.println("Hasil dari penyederhanaan adalah\t: " + nilai);
    }

}
