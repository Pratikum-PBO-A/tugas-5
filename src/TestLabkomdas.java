package Modul2_Bab5;

/**
 *
 * @author abdu_
 */
import java.util.Scanner;

public class TestLabkomdas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Jaket[] = new String[3];
        String pilihan = "";

        do {
            Jaket[0] = "Jaket A           Rp.100000";
            Jaket[1] = "Jaket B           Rp.125000";
            Jaket[2] = "Jaket C           Rp.175000";
            System.out.println("=====KOPERASI LABKOMDAS========");
            System.out.println("No. Jenis Jaket         Harga");
            System.out.println("===============================");
            for (int i = 0; i < Jaket.length; i++) {
                System.out.println((i + 1) + ". " + Jaket[i]);
            }
            System.out.println("NB: Mendapat diskon jika jumlah\njaket yang dibeli lebih dari 100\n");
            System.out.print("Masukkan Pilihan Anda : ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    Labkomdas pembeliA = new Labkomdas();
                    System.out.print("Masukkan Jumlah Jaket A yang ingin dibeli : ");
                    int jumA = in.nextInt();
                    pembeliA.jaketA(jumA);
                    System.out.print("Ingin Beli Lagi (Y/y)? ");
                    pilihan = in.next();
                    break;
                case 2:
                    Labkomdas pembeliB = new Labkomdas();
                    System.out.print("Masukkan Jumlah Jaket B yang ingin dibeli : ");
                    int jumB = in.nextInt();
                    pembeliB.jaketB(jumB);
                    System.out.print("Ingin Beli Lagi (Y/y)? ");
                    pilihan = in.next();
                    break;
                case 3:
                    Labkomdas pembeliC = new Labkomdas();
                    System.out.print("Masukkan Jumlah Jaket C yang ingin dibeli : ");
                    int jumC = in.nextInt();
                    pembeliC.jaketC(jumC);
                    System.out.print("Ingin Beli Lagi (Y/n)? ");
                    pilihan = in.next();
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (pilihan.equalsIgnoreCase("Y"));
    }
}
