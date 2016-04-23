/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5.soal;

import java.util.Scanner;

public class hitung {

    private int a;
    private int b;
    Scanner scan = new Scanner(System.in);

    public int getA() {
        return a;
    }

    public void setA() {
        System.out.print("Masukan Nilai 1 : ");
        a = scan.nextInt();
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB() {
        System.out.print("Masukan Nilai 2 : ");
        b = scan.nextInt();
        this.b = b;
    }

    public static void Penjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public void Perkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void Pengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public void Pembagian(double a, double b) {
        double nilai = a / b;
        System.out.println("nilai pembagian adalah : " + nilai);
    }

    public void sederhana(int a, int b) {
        if (a < b) {
            for (int i = a; i <= a; a--) {
                if (b % i == 0) {
                    System.out.println("Hasil penyederhanaan adalah " + (a/i) + "/" + (b / i));
                }
                else System.out.println("tidak dapat di sederhanakan");
            }
        } else if (a > b) {
            for (int i = b; i <= b; b--) {
                if (a % i == 0) {
                    System.out.println("Hasil penyederhanaan adalah " + (a/i) + "/" + (b / i));
                }
                 else System.out.println("tidak dapat di sederhanakan");
            }
        }
        else{System.out.println("Hasil penyederhanaan adalah  1");}
    }
}
