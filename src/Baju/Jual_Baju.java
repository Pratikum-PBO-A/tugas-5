/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baju;

/**
 *
 * @author Bachtiar
 */
import java.util.Scanner;

public class Jual_Baju {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);//for int
        Scanner b = new Scanner(System.in);//for String
        Database bj = new Database();
        System.out.println("\tBakhul Gombal Ora Larang\n");
        System.out.println("Kami Menyediakan Gombal dengan jenis kain \n"
                + "\t1. A = Kain Nagata\n\t2. B = Kain Mori\n\t3. C = Kain Jala\n");
        System.out.print("Pilih\t: ");
        int plh = a.nextInt();
        switch (plh) {
            case 1:
                System.out.print("Gombal jenis kain Nagata\t: ");
                bj.setBeli(a.nextInt());
                //bj.Bonus(100);
                bj.jenisA();
                System.out.println();
                break;
            case 2:
                System.out.print("Gombal jenis kain Mori\t: ");
                bj.setBeli(a.nextInt());
                //bj.Bonus(100);
                bj.jenisB();
                System.out.println();
                break;
            case 3:
                System.out.print("Gombal jenis kain Jala\t: ");
                bj.setBeli(a.nextInt());
                //bj.Bonus(100);
                bj.jenisC();
                System.out.println();
                break;
            default:
                System.out.println("Tidak Ada Yang Anda Pilih, Berarti Anda Tidak Membeli");
                System.out.println("\tTERIMA KASIH");

        }

    }

}
