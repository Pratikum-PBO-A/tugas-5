
import java.util.*;

public class Main {

    public static Scanner scan = new Scanner(System.in);
    public static Perhitungan pht = new Perhitungan();

    public static void main(String[] args) {
        String loop = "y";
        do {
            cetakMenu();
            switch (scan.nextInt()) {
                case 0: loop="n";break;
                case 1:
                    input();
                    Perhitungan.penjumlahan(pht.getBilangan1(),pht.getBilangan2());
                    pht.cetakHasil(pht.getHasil(),"+");
                    sederhanakan();
                    if (scan.next().equals("y")) {
                        pht.cetakHasil(pht.sederhana(pht.getHasil()), "+");
                    }
                    System.out.println("");
                    break;
                case 2:
                    input();
                    Perhitungan.pengurangan(pht.getBilangan1(),pht.getBilangan2());
                    pht.cetakHasil(pht.getHasil(),"-");
                    sederhanakan();
                    if (scan.next().equals("y")) {
                        pht.cetakHasil(pht.sederhana(pht.getHasil()), "-");
                    }
                    System.out.println("");
                    break;
                case 3:
                    input();
                    pht.perkalian(pht.getBilangan1(),pht.getBilangan2());
                    pht.cetakHasil(pht.getHasil(),"x");
                    sederhanakan();
                    if (scan.next().equals("y")) {
                        pht.cetakHasil(pht.sederhana(pht.getHasil()), "x");
                    }
                    System.out.println("");
                    break;
                case 4:
                    input();
                    pht.pembagian(pht.getBilangan1(),pht.getBilangan2());
                    pht.cetakHasil(pht.getHasil(),":");
                    sederhanakan();
                    if (scan.next().equals("y")) {
                        pht.cetakHasil(pht.sederhana(pht.getHasil()), ":");
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (loop.equals("y"));

    }

    public static void cetakMenu() {
        System.out.println("PERHITUNGAN");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("0. Keluar");
        System.out.print("Pilih:");
    }

    public static void input() {
        System.out.print("Masukkan bilangan 1 = ");
        pht.setBilangan1(scan.nextDouble());
        System.out.print("Masukkan bilangan 2 = ");
        pht.setBilangan2(scan.nextDouble());
    }
    
    public static void sederhanakan() {
        System.out.print("sederhanakan(y/n)?");
    }

}
