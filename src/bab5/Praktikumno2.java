package bab5;


import java.util.Scanner;

public class Praktikumno2 {
    private int jumlah;
    private final int HargaJaketA;
    private final int HargaJaketB;
    private final int HargaJaketC;
       
    public  Praktikumno2 (int HargaJaketA, int HargaJaketB, int HargaJaketC){
        this.HargaJaketA=HargaJaketA;
        this.HargaJaketB=HargaJaketB;
        this.HargaJaketC=HargaJaketC;     
    }
    
    public void program(){
        Scanner input= new Scanner (System.in);
        
        System.out.println("===============================");
        System.out.println("Selamat Datang di CV. Labkomdas");
        System.out.println("===============================");
        System.out.println("\n"
                         + "1. Jaket Merek A  Rp.100.000");
        System.out.println("2. Jaket Merek B  Rp.125.000");
        System.out.println("3. Jaket Merek C  Rp.175.000");
        System.out.print("Pilihan :");
        int pil = input.nextInt();
        System.out.print("Masukkan Jumlah Orderan :");
        int jum = input.nextInt();
      
       
        switch (pil){
            case 1:
                if (jum>100){
                    
                    int bayar = jum*(HargaJaketA-5000);
                    System.out.println("Karena diskon,harga per Jaket adalah 95000");
                    System.out.println("Harga Total adalah Rp."+bayar);
                   
                }
                else {
                    System.out.println("Tidak Ada diskon");
                
                int bayar = jum*HargaJaketA;
                System.out.println("Harga Total adalah Rp."+bayar);
                }
                break;
           
            case 2:
                if (jum>100){
                    int bayar = jum*(HargaJaketB-5000);
                    System.out.println("Karena diskon,harga per Jaket adalah 120000");
                    System.out.println("Harga Total adalah Rp."+bayar);
                   
                }
                else {
                    System.out.println("Tidak Ada diskon");
                
                int bayar = jum*HargaJaketB;
                System.out.println("Harga Total adalah Rp."+bayar);
                }
                break;
            case 3:
                if (jum>100){
                    int bayar = jum*(HargaJaketC-15000);
                    System.out.println("Karena diskon,harga per Jaket adalah 160000");
                    System.out.println("Harga Total adalah Rp."+bayar);
                   
                }
                else System.out.println("Tidak Ada diskon");
                int bayar = jum*HargaJaketC;
                System.out.println("Harga Total adalah Rp."+bayar);
        }
        
    }
    
}
