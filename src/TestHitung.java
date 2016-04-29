package Modul2_Bab5;

/**
 *
 * @author abdu_
 */
import java.util.Scanner;
public class TestHitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hitung hitung = new Hitung();
        String[] operasi = new String[4];
        operasi[0] = "Penjumlahan";
        operasi[1] = "Pengurangan";
        operasi[2] = "Perkalian";
        operasi[3] = "Pembagian";
        String pilihan = "";
        do {
            System.out.println("===PROGRAM OPERASI HITUNG SEDERHANA===");
            for (int i = 0; i < operasi.length; i++) {
                System.out.println((i + 1) + ". " + operasi[i]);
            }
            System.out.print("Masukkan Pilihan Anda : ");
            int pil = in.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("=========OPERASI PENJUMLAHAN=========");
                    System.out.print("Masukkan bilangan pertama : ");
                    int biljum = in.nextInt();
                    System.out.print("Masukkan bilangan kedua   : ");
                    int biljum1 = in.nextInt();
                    Hitung.penjumlahan(biljum, biljum1);
                    System.out.print("Mau Hitung Lagi (Y/N) ? ");
                    pilihan = in.next();
                    break;
                case 2:
                    System.out.println("=========OPERASI PENGURANGAN=========");
                    System.out.print("Masukkan bilangan pertama : ");
                    int bilkur = in.nextInt();
                    System.out.print("Masukkan bilangan kedua   : ");
                    int bilkur1 = in.nextInt();
                    Hitung.pengurangan(bilkur, bilkur1);
                    System.out.print("Mau Hitung Lagi (Y/N) ? ");
                    pilihan = in.next();
                    break;
                case 3:
                    System.out.println("=========OPERASI PERKAlIAN=========");
                    System.out.print("Masukkan bilangan pertama : ");
                    int bilkal = in.nextInt();
                    System.out.print("Masukkan bilangan kedua   : ");
                    int bilkal1 = in.nextInt();
                    hitung.perkalian(bilkal, bilkal1);
                    System.out.print("Mau Hitung Lagi (Y/N) ? ");
                    pilihan = in.next();
                    break;
                case 4:
                    System.out.println("==========OPERASI PEMBAGIAN==========");
                    System.out.print("Masukkan bilangan pertama : ");
                    int bilbag = in.nextInt();
                    System.out.print("Masukkan bilangan kedua   : ");
                    int bilbag1 = in.nextInt();
                    hitung.pembagian(bilbag, bilbag1);
                    System.out.print("Mau Hitung Lagi (Y/N) ? ");
                    pilihan = in.next();
                    break;
                default:
                    System.out.println("PILIHAN TIDAK ADA");
            }
        } while (pilihan.equalsIgnoreCase("Y"));
    }
}
