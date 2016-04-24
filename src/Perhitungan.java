package Bab5.PraktikumSoal1;
import java.util.Scanner;

public class Perhitungan {
    private double nilai1;
    private double nilai2;
    private static double hasil;
    public static Perhitungan mtk = new Perhitungan();
    
    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }
    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }
    public double getNilai1() {
        return nilai1;
    }
    public double getNilai2() {
        return nilai2;
    }
    public double getHasil() {
        return hasil;
    }
    
    public static double penjumlahan(double b1,double b2) {
        hasil=b1+b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public static double pengurangan(double b1,double b2) {
        hasil=b1-b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public double perkalian(double b1,double b2) {
        hasil=b1*b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public double pembagian(double b1,double b2) {
        hasil=b1/b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public double sederhana(double hasil) {
        hasil = Math.round(hasil * 100.0) / 100.0;
        return hasil;
    }
    
    static int BilPecahan(int pembilang, int penyebut) {
        int s = 2, t = 2;
        int x = pembilang, y = penyebut;
        while (x != y) {
            if (x > y) {
                while ((pembilang % s) != 0) {
                    s++;
                }
                x = pembilang / s;
                s++;
            } else {
                while ((penyebut % t) != 0) {
                    t++;
                }
                y = penyebut / t;
                t++;
            }
        }
        return (x);
    }
       public void sederhana() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Pembilang = ");
        int pembilang1 = scan.nextInt();
        System.out.print("Penyebut  = ");
        int penyebut1 = scan.nextInt();
        int pembilang = BilPecahan(pembilang1, penyebut1);
        int pembilang2 = pembilang1 / pembilang;
        int penyebut2 = penyebut1 / pembilang;
        System.out.println(pembilang1+"/"+penyebut1+" = "+pembilang2+"/"+penyebut2+"\n");
    }
       
       public void cetakHasil(double hasil,String tanda) {
        System.out.println(this.nilai1 + " " + tanda + " " + this.nilai2 + " = " + hasil);
        }
}