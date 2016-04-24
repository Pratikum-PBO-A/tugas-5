/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;

import java.util.Scanner;

/**
 *
 * @author Hart
 */
public class AritmatikaMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aritmatika hitung = new Aritmatika();
        int pil;
        do {
            System.out.println("Program Perhitungan");
            System.out.println("Masukan Operasi yang anda inginkan");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("Masukan pilihan : ");
            pil = input.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("Operasi Penjumlahan");
                    System.out.println("Masukan Angka Pertama Anda : ");
                    int A = input.nextInt();
                    System.out.println("Masukan Angka Pertama Kedua Anda : ");
                    int B = input.nextInt();
                    Aritmatika.penjumlahan(A, B);
                    break;
                case 2:
                    System.out.println("Operasi Pengurangan");
                    System.out.println("Masukan Angka Pertama Anda : ");
                    int C = input.nextInt();
                    System.out.println("Masukan Angka Pertama Kedua Anda : ");
                    int D = input.nextInt();
                    Aritmatika.pengurangan(C, D);
                    break;
                case 3:
                    System.out.println("Operasi Perkalian");
                    System.out.println("Masukan Angka Pertama Anda : ");
                    int E = input.nextInt();
                    System.out.println("Masukan Angka Pertama Kedua Anda : ");
                    int F = input.nextInt();
                    hitung.perkalian(E, F);
                    break;
                case 4:
                    System.out.println("Operasi Pembagian");
                    System.out.println("Masukan Angka Pertama Anda : ");
                    int G = input.nextInt();
                    System.out.println("Masukan Angka Pertama Kedua Anda : ");
                    int H = input.nextInt();
                    hitung.Pembagian(G, H);
                    hitung.sederhana();
                    break;
                default:
                    System.out.println("pilihan anda salah");
            }
        } while (pil != 1 && pil != 2 && pil != 3 && pil != 4);
    }
}
