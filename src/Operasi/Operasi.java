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
import java.util.Scanner;

public class Operasi {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        dtbs d = new dtbs();
        int ulang = -1;
        do {
            System.out.println("\t1. Pertambahan\n\t2. Pengurangan\n\t3. Perkalian\n\t4. Pembagian\n");
            System.out.print("Pilih\t: ");
            int pilih = a.nextInt();
            System.out.print("Masukkan angka pertama\t: ");
            int ang1 = a.nextInt();
            System.out.print("Masukkan angka kedua\t: ");
            int ang2 = b.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    dtbs.Penjumlahan(ang1, ang2);
                    System.out.println();
                    break;
                case 2:
                    dtbs.Pengurangan(ang1, ang2);
                    System.out.println();
                    break;
                case 3:
                    d.Perkalian(ang1, ang2);
                    System.out.println();
                    break;
                case 4:
                    d.Pembagian(ang1, ang2);
                    System.out.println();
                    d.Sederhana(ang1, ang2);
                    System.out.println();
                    break;
                default:
                    System.out.println("Ulangi Program ?\n\t1. Ya\n\t2. Tidak\n");
                    System.out.print("Pilih\t: ");
                    ulang = a.nextInt();
                    System.out.println();
                    break;
            }
            System.out.println("Ulangi Program ?\n\t1. Ya\n\t2. Tidak\n");
            System.out.print("Pilih\t: ");
            ulang = a.nextInt();
        } while (ulang == 1);
        System.out.println("\tTerima Kasih\n");
    }
}
