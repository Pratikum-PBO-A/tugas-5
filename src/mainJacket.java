package Bab5.PraktikumSoal2;
import java.util.*;
public class mainJacket {
    private static Jacket jaket = new Jacket();
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("=== CV.LABKOMDAS ===");
        
        String loop="y"; 
        int jumlah=0, total=0, i=0, bayar=0;
        
        do{
            cetakMenu();
            switch(input.nextByte()){
                case 0:
                    loop="n";
                    break;
                case 1:
                    jaket.pilihan("a");
                    cetakJumlah("A");
                    jumlah=input.nextInt();
                    System.out.println("");
                    total = jaket.pembelian("a",jumlah);
                    bayar = bayar + total;
                    jaket.keranjang("A", total,jumlah,i,bayar);
                    i++;
                    break;
                case 2:
                    jaket.pilihan("b");
                    cetakJumlah("B");
                    jumlah=input.nextInt();
                    System.out.println("");
                    total = jaket.pembelian("b",jumlah);
                    bayar = bayar + total;
                    jaket.keranjang("B", total,jumlah,i,bayar); 
                    i++;
                    break;
                case 3:
                    jaket.pilihan("c");
                    cetakJumlah("C");
                    jumlah=input.nextInt();
                    System.out.println("");
                    total = jaket.pembelian("c",jumlah);
                    bayar = bayar + total;
                    jaket.keranjang("C", total,jumlah,i,bayar);
                    i++;
                    break;
                case 4:
                    System.out.println("\nKERANJANG PEMBELIAN");
                    Jacket.cetakStruk(jaket.getKeranjang());
                    System.out.print("Beli(y/n):");
                    if(input.next().equals("y")){
                        System.out.println("Pembelian Berhasil");loop="n";
                        System.out.println("\n\nSTRUK PEMBELIAN");
                        Jacket.cetakStruk(jaket.getKeranjang());
                        System.out.println("");
                        System.out.println("Terima Kasih Sudah Berbelanja :)");
                        System.out.println("CV.LABKOMDAS\n");
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan tidak ada\n");
                    break;
            }
                    
        }while(loop=="y");
    }
    public static void cetakMenu(){
        System.out.println("MENU Pemesanan Jaket");
        System.out.println("1. JAKET Berbahan A");
        System.out.println("2. JAKET Berbahan B");
        System.out.println("3. JAKET Berbahan C");
        System.out.println("4. KERANJANG PEMBELIAN");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
    public static void cetakJumlah(String pilihan){
        System.out.print("\nJumlah jaket " + pilihan + " yang akan dibeli : ");
    }
}