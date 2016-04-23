import java.util.*;
public class Main {
    private static PabrikJaket pabrikjaket = new PabrikJaket();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        String loop="y";int jumlah=0,total=0,x = 0, bayar = 0;
        do{
            cetakMenu();
            switch(scan.nextByte()){
                case 0:
                    loop="n";
                    break;
                case 1:
                    pabrikjaket.pilihan("a");
                    cetakJumlah("A");
                    jumlah=scan.nextInt();
                    System.out.println("");
                    total=pabrikjaket.pembelian("a",jumlah);
                    bayar = bayar + total;
                    pabrikjaket.keranjang("A", total,jumlah,x,bayar);
                    x++;
                    break;
                case 2:
                    pabrikjaket.pilihan("b");
                    cetakJumlah("B");
                    jumlah=scan.nextInt();
                    System.out.println("");
                    total=pabrikjaket.pembelian("b",jumlah);
                    bayar = bayar + total;
                    pabrikjaket.keranjang("B", total,jumlah,x,bayar); 
                    x++;
                    break;
                case 3:
                    pabrikjaket.pilihan("c");
                    cetakJumlah("C");
                    jumlah=scan.nextInt();
                    System.out.println("");
                    total=pabrikjaket.pembelian("c",jumlah);
                    bayar = bayar + total;
                    pabrikjaket.keranjang("C", total,jumlah,x,bayar);
                    x++;
                    break;
                case 4:
                    System.out.println("\nKERANJANG BELI");
                    PabrikJaket.cetakStruk(pabrikjaket.getKeranjang());
                    System.out.print("Beli(y/n):");
                    if(scan.next().equals("y")){
                        System.out.println("Pembelian Berhasil");loop="n";
                        System.out.println("\n\nSTRUK PEMBELIAN");
                        PabrikJaket.cetakStruk(pabrikjaket.getKeranjang());
                        System.out.println("TERIMA KASIH\n\n");
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
        System.out.println("MENU");
        System.out.println("Beli Jaket");
        System.out.println("1. Bahan A");
        System.out.println("2. Bahan B");
        System.out.println("3. Bahan C");
        System.out.println("4. Lihat Keranjang");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }
    public static void cetakJumlah(String pilihan){
        System.out.print("\nJumlah jaket "+pilihan+" yang anda beli: ");
    }
}
