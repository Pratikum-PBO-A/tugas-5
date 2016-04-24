
package prakpbo;
import java.util.Scanner;
public class hitung {
    public static void hitungPenjumlahan(int a,int b){
       int nilai = a+b;
       System.out.println("nilai penjumlahan adalah : "+nilai);
    }
     public static void hitungPengurangan(int a, int b){
       int nilai = a-b;
       System.out.println("nilai pengurangan adalah : "+nilai);
    }
    public void hitungPerkalian(int a, int b){
       int nilai = a*b;
       System.out.println("nilai perkalian adalah : "+nilai);
    }
    public void hitungPembagian(double a, double b){
        double nilai = a/b;
        System.out.println("nilai pembagian adalah : "+nilai);
    }
    
    static int BilPecahannya (int pemb, int peny){
        int s=2,t=2;
        int a=pemb, b=peny;
    while (a!=b){
        if (a>b){
    while ((pemb%s)!=0){
        s++;
    }
        a=pemb/s;
        s++;
    } 
        else {
    while ((peny%t)!=0){
        t++;
    }
        b=peny/t;
        t++;
        }
    }
    return (a);
}
    
    public void sederhana(){
    Scanner in = new Scanner (System.in);
    System.out.print("\nMasukkan Pembilang = ");
    int pemb1= in.nextInt();
    System.out.print("Masukkan Penyebut = ");
    int peny1= in.nextInt();
    System.out.println("Pecahan sebelum disederhanakan = "+pemb1+"/"+peny1 );
    int pembagi= BilPecahannya (pemb1, peny1);
    int pemb2= pemb1/pembagi;
    int peny2= peny1/pembagi;
    System.out.println("Pecahan setelah disederhanakan = "+pemb2+"/"+peny2+"\n");
    }
    }

