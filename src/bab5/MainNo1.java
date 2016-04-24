package bab5;

import java.util.Scanner;

public class MainNo1 {

public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Praktikumno1 a = new Praktikumno1 ();
    
    System.out.print("Masukkan Angka pertama :");
    int pertama = input.nextInt();
    System.out.print("Masukkan angka kedua   :");
    int kedua = input.nextInt();
    System.out.println("\n\n");
    
    Praktikumno1.Penjumlahan(pertama, kedua);
    Praktikumno1.Pengurangan(pertama, kedua);
    a.Perkalian(pertama, kedua);
    a.Pembagian(pertama, kedua);
    
    System.out.println("\n\n");
    
    System.out.print("Masukkan Pembilang : ");
    int pembilang = input.nextInt();
    System.out.print("Masukkan Penyebut  : ");
    int penyebut = input.nextInt();
    
   
    a.Sederhana(pembilang, penyebut);


    }
    
}
