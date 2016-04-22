package definisimasalah;
import java.util.Scanner;
public class jaketmain {
    static Scanner sc = new Scanner(System.in);
    static int tothar = 0, pilih;
    static char pil;
    public static void main(String[] args) {
        men();
    }
    public static  void men() {
        System.out.println("Toko Jaket");
        System.out.print("Transaksi ? 1.ya,2.tidak :");
        pilih = sc.nextInt();
        if (pilih == 1) {
            System.out.println("Daftar Harga Jaket");
            System.out.println("Jaket A. 100000 Diskon 5000 jika beli>100");
            System.out.println("Jaket B. 125000 Diskon 5000 jika beli>100");
            System.out.println("Jaket C. 175000 Diskon 15000 jika beli>100");
            System.out.print("Jaket mana yang ingin dibeli ? ");
            pil = sc.next().charAt(0);
            switch (pil) {
                case 'a':
                    System.out.print("berapa banyak jaket : ");
                    pilih = sc.nextInt();
                    if (pilih > 100) {
                        jaketbasis jkb = new jaketbasis(95000);
                        tothar = tothar + (jkb.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb.getJaketharga());
                        System.out.println("Total Harga sementara " + tothar);
                        men();
                    } else {
                        jaketbasis jkb2 = new jaketbasis(100000);
                        tothar = tothar + (jkb2.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb2.getJaketharga());
                        System.out.println("Total Harga sementara Rp" + tothar);
                        men();
                    }
                    break;
                case 'b':
                    System.out.print("berapa banyak jaket : ");
                    pilih = sc.nextInt();
                    if (pilih > 100) {
                        jaketbasis jkb3 = new jaketbasis(120000);
                        tothar = tothar + (jkb3.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb3.getJaketharga());
                        System.out.println("Total Harga sementara Rp" + tothar);
                        men();
                    } else {
                        jaketbasis jkb4 = new jaketbasis(125000);
                        tothar = tothar + (jkb4.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb4.getJaketharga());
                        System.out.println("Total Harga sementara Rp" + tothar);
                        men();
                    }
                    break;
                case 'c':
                    System.out.print("berapa banyak jaket : ");
                    pilih = sc.nextInt();
                    if (pilih > 100) {
                        jaketbasis jkb5 = new jaketbasis(160000);
                        tothar = tothar + (jkb5.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb5.getJaketharga());
                        System.out.println("Total Harga sementara Rp" + tothar);
                        men();
                    } else {
                        jaketbasis jkb6 = new jaketbasis(175000);
                        tothar = tothar + (jkb6.getJaketharga() * pilih);
                        System.out.println("Harga perbiji "+jkb6.getJaketharga());
                        System.out.println("Total Harga sementara Rp" + tothar);
                        men();
                    }
                    break;
                default:
                    System.out.println("Inputan Tidak Tersedia");
                    men();
                    break;
            }
        } else if (pilih == 2) {
            System.out.println("terimakasih telah berbelanja total harga anda Rp" + tothar);

        }else{
            System.out.println("Inputan Tidak Tersedia");
            men();
        }
    }
}
