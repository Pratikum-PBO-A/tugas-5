/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;

/**
 *
 * @author Hart
 */
public class Jaket {
    private static final int jaketA = 100000;
    private static final int jaketB = 125000;
    private static final int jaketC = 175000;
    private static int jumlah;
    private int harga;

    

    public static void setJumlah(int jumlah) {
        Jaket.jumlah = jumlah;
    }

    public void hitJaketA(){
        if (jumlah > 100) {
            harga = (jaketA-5000)*jumlah;
            System.out.println("Selamat Anda Mendapat Discount Rp.5000/pc");
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
        else if(jumlah <=100){
            harga = jaketA*jumlah;
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
    }
    public void hitJaketB(){
        if (jumlah > 100) {
            harga = (jaketB-5000)*jumlah;
            System.out.println("Selamat Anda Mendapat Discount Rp.5000/pc");
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
        else if(jumlah <=100){
            harga = jaketB*jumlah;
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
    }
    public void hitJaketC(){
        if (jumlah > 100) {
            harga = (jaketC-15000)*jumlah;
            System.out.println("Selamat Anda Mendapat Discount Rp.15000/pc");
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
        else if(jumlah <=100){
            harga = jaketC*jumlah;
            System.out.println("Jadi Total Pembelian Anda : Rp."+harga);
        }
    }
    
    
}
