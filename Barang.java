/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum5;

/**
 *
 * @author seekers
 */
public class Barang {
    
    private final int a = 100;
    private final int b = 125;
    private final int c = 175;
    private int brg;

    public int getBrg() {
        return brg;
    }

    public void setBrg(int brg) {
        this.brg = brg;
    }
    
    public void hitunghargaa(int h){
        int totala = h*this.a;
        System.out.println("Jumlah Harga Total   : Rp. "+totala*1000);
    }
    public void hitunghargab(int h){
        int totalb = h*this.b;
        System.out.println("Jumlah Harga Total  : Rp. "+totalb*1000);
    }
    public void hitunghargac(int h){
        int totalc = h*this.c;
        System.out.println("Jumlah Harga Total  : Rp. "+totalc*1000);
    }
    public void hitungdiskona(int h){
        int diskona = h*95;
        System.out.println("Jumlah Harga Total  : Rp. "+diskona*1000);
    }
    public void hitungdiskonb(int h){
        int diskonb = h*120;
        System.out.println("Jumlah Harga Total  : Rp. "+diskonb*1000);
    }
    public void hitungdiskonc(int h){
        int diskonc = h*160;
        System.out.println("Jumlah Harga Total  : Rp. "+diskonc*1000);
    }
   
    
    
}
