package bab5;

import java.util.Scanner;

public class KonveksiMain {
    public static void main(String[] args) {
        Konveksi kon = new Konveksi();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Selamat Datang di CV. Labkomdas");
        System.out.println("===============================");
        System.out.println("Daftar Harga");
        System.out.println("Jaket A = Rp 100000");
        System.out.println("Jaket B = Rp 125000");
        System.out.println("Jaket C = Rp 175000");
        System.out.println("===============================");
        System.out.println("Silahkan isi jumlah jaket yang mau dibeli.\nIsi dengan angka 0 jika Anda tidak membeli jenis jaket tertentu");
        
        System.out.print("Jumlah jaket A : ");
        kon.setNilaiA(scn.nextInt());
        System.out.println("Total harga jaket A : "+kon.getNilaiA());
        
        System.out.print("Jumlah jaket B : ");
        kon.setNilaiB(scn.nextInt());
        System.out.println("Total harga jaket B : "+kon.getNilaiB());
        
        System.out.print("Jumlah jaket C : ");
        kon.setNilaiC(scn.nextInt());
        System.out.println("Total harga jaket C : "+kon.getNilaiC());
        
        int total = kon.getNilaiA()+kon.getNilaiB()+kon.getNilaiC();
        System.out.println("Total yang harus dibayar : Rp "+total);
        
    }
}
