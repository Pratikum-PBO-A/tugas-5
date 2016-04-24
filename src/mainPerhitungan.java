package Bab5.PraktikumSoal1;
import java.util.*;

public class mainPerhitungan {

    public static Scanner input = new Scanner(System.in);
    public static Perhitungan mat = new Perhitungan();

    public static void main(String[] args) {
        String loop = "y";
        do {
            cetakMenu();
            switch (input.nextInt()) {
                case 0: loop="n";break;
                case 1:
                    input();
                    Perhitungan.penjumlahan(mat.getNilai1(),mat.getNilai2());
                    mat.cetakHasil(mat.getHasil(),"+");
                    System.out.println("");
                    break;
                case 2:
                    input();
                    Perhitungan.pengurangan(mat.getNilai1(),mat.getNilai2());
                    mat.cetakHasil(mat.getHasil(),"-");
                    System.out.println("");
                    break;
                case 3:
                    input();
                    mat.perkalian(mat.getNilai1(),mat.getNilai2());
                    mat.cetakHasil(mat.getHasil(),"x");
                    System.out.println("");
                    break;
                case 4:
                    input();
                    mat.pembagian(mat.getNilai1(),mat.getNilai2());
                    mat.cetakHasil(mat.getHasil(),":");
                    System.out.println("");
                    break;
                case 5:
                    mat.sederhana();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (loop.equals("y"));

    }

    public static void cetakMenu() {
        System.out.println("== MENU PERHITUNGAN ==");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Penyederhanaan Pecahan");
        System.out.println("0. Keluar");
        System.out.print("Pilih Menu: ");
    }

    public static void input() {
        System.out.print("Masukkan niali 1 : ");
        mat.setNilai1(input.nextDouble());
        System.out.print("Masukkan nilai 2 : ");
        mat.setNilai2(input.nextDouble());
    }
}