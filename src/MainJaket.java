/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5.soal;
import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        String pilih = "";
        int total = 0;
        Scanner scan = new Scanner(System.in);
        jaket jkt = new jaket();
        do {
            System.out.println("Daftar Harga");
            System.out.println("A\tRp." + jkt.getA());
            System.out.println("B\tRp." + jkt.getB());
            System.out.println("C\tRp." + jkt.getC());
            System.out.print("Masukan pesanan : ");
            pilih = scan.next();
            System.out.print("Masukan jumlah pembelian : ");
            int jumlah = scan.nextInt();
            switch (pilih) {
                case "A":
                case "a":
                    if (jumlah < 100) {
                        total = total + (jkt.getA() * jumlah);
                    } else {
                        total = total + (95000 * jumlah);
                    }
                    System.out.print("Belanja Lagi Y/N?");
                    pilih = scan.next();
                    break;
                case "B":
                case "b":
                    if (jumlah < 100) {
                        total = total + (jkt.getB() * jumlah);
                    } else {
                        total = total + (120000 * jumlah);
                    } System.out.print("Belanja Lagi Y/N?");
                    pilih = scan.next();
                    break;
                case "C" :
                case "c":
                    if (jumlah < 100) {
                        total = total + (jkt.getC() * jumlah);
                    } else {
                        total = total + (160000 * jumlah);
                    } System.out.print("Belanja Lagi Y/N?");
                    pilih = scan.next();
                    break;
            }
        } while (pilih.equalsIgnoreCase("y"));
        System.out.println("Jumlah Pembelian Anda Rp."+total);
    }
}
