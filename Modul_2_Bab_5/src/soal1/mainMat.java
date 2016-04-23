package soal1;
import java.util.Scanner;
public class mainMat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //static method jumlah-kurang
        System.out.print("Masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        matematika.hitungJumlah(nil1, nil2);
        
        System.out.print("Masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nil2 = in.nextInt();
        matematika.hitungKurang(nil1, nil2);
        
        //non-static method kali-bagi-sederhana
        matematika mat = new matematika();
        
        System.out.print("Masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nil2 = in.nextInt();
        mat.hitungKali(nil1, nil2);
        
        System.out.print("Masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        nil2 = in.nextInt();
        mat.hitungBagi(nil1, nil2);
        
        System.out.print("Masukkan pembilang : ");
        int pemb1 = in.nextInt();
        System.out.print("Masukkan penyebut : ");
        int peny1 = in.nextInt();
        mat.sederhana(pemb1, peny1);
    }
}
