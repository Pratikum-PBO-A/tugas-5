
package prakpbo;
import java.util.Scanner;
public class hitungmain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        hitung.hitungPenjumlahan(nil1, nil2);
        
        System.out.print("masukkan nilai 1 : ");
        int nil11 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil22 = in.nextInt();
        hitung.hitungPengurangan(nil11, nil22);
        
        hitung a = new hitung();
        System.out.print("masukkan nilai 1 : ");
        int nil = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil3 = in.nextInt();
        a.hitungPerkalian(nil, nil3);
        System.out.print("masukkan nilai 1 : ");
        int nil4 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil5 = in.nextInt();
        a.hitungPembagian(nil4, nil5);
        
        hitung b = new hitung();
        b.sederhana();
    }
}
