package soal2;
import java.util.Scanner;
public class mainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "y", b;
        int pil, jum;
        System.out.println("\tSelamat Datang di CV LABKOMDAS");
        System.out.println("=================================================");
        jaket j = new jaket();
        System.out.println("\t\tDaftar Jaket");
        System.out.println("No.\tTipe Jaket\tHarga (dalam ribu)");
        System.out.println("1.\tJaket A\t\t\t" + j.harga[0]);
        System.out.println("2.\tJaket B\t\t\t" + j.harga[1]);
        System.out.println("3.\tJaket C\t\t\t" + j.harga[2]);
        System.out.println("");
        System.out.println("\t\tDaftar Jaket Diskon");
        System.out.println("Nb : Apabila Beli lebih dari 100 item all Tipe");
        System.out.println("No.\tTipe Jaket\tHarga (dalam ribu)");
        System.out.println("1.\tJaket A\t\t\t" + j.hargab[0]);
        System.out.println("2.\tJaket B\t\t\t" + j.hargab[1]);
        System.out.println("3.\tJaket C\t\t\t" + j.hargab[2]);
        System.out.println("");
        do {
            System.out.print("Pilih jaket : ");
            pil = in.nextInt();
            switch (pil){
                case 1 : 
                    System.out.print("Masukkan jumlah item : ");
                    jum = in.nextInt();
                    j.jumlah(jum);
                    if (jum >= 100) {
                        j.price1b();
                    } else {
                        j.price1();
                    }
                    break;
                case 2 : 
                    System.out.print("Masukkan jumlah item : ");
                    jum = in.nextInt();
                    j.jumlah(jum);
                    if (jum >= 100) {
                        j.price2b();
                    } else {
                        j.price2();
                    }
                    break;
                case 3 : 
                    System.out.print("Masukkan jumlah item : ");
                    jum = in.nextInt();
                    j.jumlah(jum);
                    if (jum >= 100) {
                        j.price3b();
                    } else {
                        j.price3();
                    }
                    break;
                default :
                    System.out.println("Pilihan yang anda masukkan salah");
            }
            System.out.print("Tambah jaket ? (y/n) : ");
            b = in.next();
            System.out.println("");
        } while (a.equalsIgnoreCase(b));
        j.jumlah();
        j.display();
    }
}
