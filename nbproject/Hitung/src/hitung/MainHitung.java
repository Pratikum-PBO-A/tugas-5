package hitung;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1  : ");
        int a = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int b = in.nextInt();
        Hitung.Penjumlahan(a, b);
        System.out.print("Masukkan angka 1  : ");
        int c = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int d = in.nextInt();        
        Hitung.Pengurangan(c, d);
        Hitung x = new Hitung();
        System.out.print("Masukkan angka 1  : ");
        int e = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int f = in.nextInt(); 
        x.Perkalian(e, f);
         System.out.print("Masukkan angka 1  : ");
        int g = in.nextInt();
        System.out.print("Masukkan angka  2 : ");
        int h = in.nextInt();
        x.Pembagian(g, h);
        System.out.print("Masukkan angka 1 : ");
        int i = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int j = in.nextInt();
        x.Sederhana(i, j); }}


