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
public class Database {

    private int Beli;
    private int A, B, C;
    private final int Max = 100;

    public int getBeli() {
        return this.Beli;
    }

    public void setBeli(int Beli) {
        this.Beli = Beli;
    }

    public int getMax() {
        return this.Max;
    }

    public boolean Bonus(int take) {
        int dt = 0;
        dt = this.Beli + take;
        if (dt > Max) {
            this.Beli = this.Beli + take;
            return true;
        } else {
            return false;
        }
    }

    public void jenisA() {
        if (Beli > 100) {
            System.out.println("Mendapat Bonus 5000 @ baju");
            int harga = Beli * 95000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();
        } else {
            System.out.println("Harga Tetap");
            int harga = Beli * 100000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();

        }
    }
    
    public void jenisB() {
        if (Beli > 100) {
            System.out.println("Mendapat Bonus 5000 @ baju");
            int harga = Beli * 95000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();
        } else {
            System.out.println("Harga Tetap");
            int harga = Beli * 100000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();

        }
    }
    
    public void jenisC() {
        if (Beli > 100) {
            System.out.println("Mendapat Bonus 5000 @ baju");
            int harga = Beli * 95000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();
        } else {
            System.out.println("Harga Tetap");
            int harga = Beli * 100000;
            System.out.println("Total Harga\t: Rp " + harga + ",-");
            System.out.println();

        }
    }

}
