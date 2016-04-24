/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;

/**
 *
 * @author Hart
 */
public class Aritmatika {

    private static int penjumlahan;
    private static int pengurangan;
    private static int perkalian;
    private static double pembagian;

    public static void penjumlahan(int A, int B) {
        penjumlahan = A + B;
        System.out.println("hasil penjumlahan angka anda : " + penjumlahan);
    }

    public static void pengurangan(int A, int B) {
        pengurangan = A - B;
        System.out.println("hasil Pengurangan angka anda : " + pengurangan);
    }

    public void perkalian(int A, int B) {
        perkalian = A * B;
        System.out.println("hasil Pembagian angka anda : " + perkalian);
    }

    public void Pembagian(double A, double B) {
        pembagian = A / B;
        System.out.println("hasil pembagian angka anda : " + pembagian);
    }

    public void sederhana(){
        double S = pembagian%1;
        if(S<=0.5){
            System.out.println("Sederhananya : "+(pembagian-S));     
        }
        else if(S>0.5||S<1){
            System.out.println("Sederhananya : "+(pembagian-S+1));
        } 

       
    }
}
