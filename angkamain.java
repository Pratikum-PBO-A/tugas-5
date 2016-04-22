package definisimasalah;
import java.util.Scanner;
public class angkamain {
    static basisangka bs = new basisangka();
    static Scanner sc = new Scanner(System.in);
    static int pil,x,y;
    static double a, b;
    public static void main(String[] args) {
       men();
    }
    public static void men(){
        do {
            System.out.println("1. penjumlahan  ");
            System.out.println("2. Pengurangan  ");
            System.out.println("3. pembagian ");
            System.out.println("4. perkalian ");
            System.out.println("5. penyederhanaan ");
            System.out.println("6. keluar");
            System.out.print("masukan pilihan anda : ");
            pil = sc.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("masukan angka ke 1 : ");
                    a = sc.nextDouble();
                    System.out.print("masukan angka ke 2 : ");
                    b = sc.nextDouble();
                    basisangka.tambah(a, b);
                    men();
                    break;
                case 2:
                    System.out.print("masukan angka ke 1 : ");
                    a = sc.nextDouble();
                    System.out.print("masukan angka ke 2 : ");
                    b = sc.nextDouble();
                    basisangka.kurang(a, b);
                    men();
                    break;
                case 3:
                    System.out.print("masukan angka ke 1 : ");
                    a = sc.nextDouble();
                    System.out.print("masukan angka ke 2 : ");
                    b = sc.nextDouble();
                    bs.bagi(a, b);
                    men();
                    break;
                case 4:
                    System.out.print("masukan angka ke 1 : ");
                    a = sc.nextDouble();
                    System.out.print("masukan angka ke 2 : ");
                    b = sc.nextDouble();
                    bs.kali(a, b);
                    men();
                    break;
                case 5:
                    System.out.print("masukan pembilang : ");
                    x = sc.nextInt();
                    System.out.print("masukan penyebut : ");
                    y = sc.nextInt();
                    bs.sederhana(x, y);
                    men();
                    break;
                case 6:
                    System.out.println("Program selesai");
                    break;
                default :
                    System.out.println("inputan tidak tersedia");
                    men();
                    break;
            }
        } while (pil != 6);
    }
}
