/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;
import java.util.Scanner;
/**
 *
 * @author Hart
 */
public class JaketMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket jaket = new Jaket();
        int pil;
        do{
        System.out.println("Selamat Datang di Distro Sableng");
        System.out.println("Pilih Bahan Jaket yang di Inginkan");
        System.out.println("1.Bahan Jaket A : Rp.100000");
        System.out.println("2.Bahan Jaket B : Rp.125000");
        System.out.println("3.Bahan Jaket C : Rp.175000");
        System.out.println("Masukan Pilihan Anda : ");
        pil = input.nextInt();
        
        if(pil == 1){
            System.out.println("masukan jumlah pesanan anda : ");
            int A = input.nextInt(); 
            Jaket.setJumlah(A);
            jaket.hitJaketA();
        }
        else if(pil == 2){
            System.out.println("masukan jumlah pesanan anda : ");
            int A = input.nextInt(); 
            Jaket.setJumlah(A);
            jaket.hitJaketB();
        }
        else if(pil == 3){
            System.out.println("masukan jumlah pesanan anda : ");
            int A = input.nextInt(); 
            Jaket.setJumlah(A);
            jaket.hitJaketC();
        }
        else System.out.println("input yang anda masukan salah silahkan ulangi");
        }while(pil != 1 && pil != 2 && pil != 3);
    }
}
