package bab5;

import java.util.Scanner;

public class KalkulatorMain {
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        Scanner scn = new Scanner(System.in);
        System.out.println("KALKULATOR SEDERHANA");
        System.out.println("====================");
        while (true) {
            System.out.println("---------------------");
            System.out.println("Menu");
            System.out.println("---------------------");
            System.out.println("1. Input Bilangan");
            System.out.println("2. Penjumlahan");
            System.out.println("3. Pengurangan");
            System.out.println("4. Perkalian");
            System.out.println("5. Pembagian");
            System.out.println("6. Penyederhanaan pecahan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            int pil = scn.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan bilangan ke-1 : ");
                    kal.setA(scn.nextInt());
                    System.out.print("Masukkan bilangan ke-2 : ");
                    kal.setB(scn.nextInt());
                    break;
                case 2:
                    Kalkulator.Penjumlahan();
                    break;
                case 3:
                    Kalkulator.Pengurangan();
                    break;
                case 4:
                    kal.Perkalian();
                    break;
                case 5:
                    kal.Pembagian();
                    break;
                case 6:
                    System.out.print("\nMasukkan Pembilang = ");
                    int pemb1 = scn.nextInt();
                    System.out.print("Masukkan Penyebut = ");
                    int peny1 = scn.nextInt();
                    System.out.println("Pecahan sebelum disederhanakan =" + pemb1 + "/" + peny1);
                    int pembagi = kal.Sederhana(pemb1, peny1);
                    int pemb2 = pemb1 / pembagi;
                    int peny2 = peny1 / pembagi;
                    System.out.println("Pecahan setelah disederhanakan =" + pemb2 + "/" + peny2 + "\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
