package praktikum5.soal;
import java.util.Scanner;

public class MainHitung {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pilih = 99;
        hitung input = new hitung();
        hitung operasi = new hitung();
        do {
            System.out.println("Menu");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("5.Penyrderhana pecahan");
            System.out.println("0.Keluar");
            System.out.print("Masukan pilihan anda : ");
            pilih = scan.nextInt();
            switch (pilih) {

                case 1:
                    input.setA();
                    input.setB();
                    hitung.Penjumlahan(input.getA(), input.getB());
                    break;
                case 2:
                    input.setA();
                    input.setB();
                    hitung.Pengurangan(input.getA(), input.getB());
                    break;
                case 3:
                    input.setA();
                    input.setB();
                    operasi.Perkalian(input.getA(), input.getB());
                    break;
                case 4:
                    input.setA();
                    input.setB();
                    operasi.Pembagian(input.getA(), input.getB());
                    break;
                case 5:
                    System.out.print("Masukan pembilang : ");
                    int a = scan.nextInt();
                    System.out.print("Masukan penyebut : ");
                    int b = scan.nextInt();
                    operasi.sederhana(a, b);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program kami");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");

            }

        } while (pilih != 0);
    }
}
