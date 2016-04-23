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
import java.util.Scanner;
public class mainAritmatika {
    static double k,l,i;
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Aritmatika art = new Aritmatika();
            do{
        System.out.println("");
        System.out.println("Menu Aritmatika");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("0. Out");
        System.out.println("Pilihan anda    : ");
         i = in.nextInt();
        
        if(i==0){
            System.out.println("Program Selesai ");
        }
        else if(i==1){
            System.out.println("Masukkan angka Pertama  : ");
            k = in.nextDouble();
            System.out.println("Masukkan angka Keedua   : ");
            l = in.nextDouble();
            Aritmatika.Penjumlahan(k, l);
            art.sederhana();
        }
        else if(i==2){
            System.out.println("Masukkan angka Pertama  : ");
            k = in.nextDouble();
            System.out.println("Masukkan angka Keedua   : ");
            l = in.nextDouble();
            Aritmatika.Pengurangan(k, l);
        }
        else if(i==3){
            System.out.println("Masukkan angka Pertama  : ");
            k = in.nextDouble();
            System.out.println("Masukkan angka Keedua   : ");
            l = in.nextDouble();
            
            art.perkalian(k, l);
        }
        else if(i==4){
            System.out.println("Masukkan angka Pertama  : ");
            k = in.nextDouble();
            System.out.println("Masukkan angka Keedua   : ");
            l = in.nextDouble();
           
            art.pembagian(k, l);
        }
    }while(i!=0);
            }
}
