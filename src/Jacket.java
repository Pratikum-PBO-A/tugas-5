package Bab5.PraktikumSoal2;
public class Jacket {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private final static Jacket jaket = new Jacket();
    private String[][] keranjang = new String[100][4];

    public int getJaketA() {
        return jaketA;
    }
    public int getJaketB() {
        return jaketB;
    }
    public int getJaketC() {
        return jaketC;
    }
    public void pilihan(String pilihan) {
        
        System.out.print("\nHarga satuan Rp.");
        if (pilihan.equals("a")) {
            System.out.print(jaket.getJaketA());
        } else if (pilihan.equals("b")) {
            System.out.print(jaket.jaketB);
        } else {
            System.out.print(jaket.getJaketC());
        }
        System.out.print("\nJika membeli lebih dari 100 buah");
        System.out.print("\nHarga satuan menjadi ");
        if (pilihan.equals("a")) {
            System.out.print(jaket.getJaketA() - 5000 + " per biji");
        } else if (pilihan.equals("b")) {
            System.out.print(jaket.jaketB - 5000 + " per biji");
        } else {
            System.out.print(jaket.getJaketC() - 15000 + " per biji");
        }
    }

    public int pembelian(String pilihan, int jumlah) {
        int total = 0;
        if (jumlah > 0 && jumlah <= 100) {
            if (pilihan.equals("a")) {
                total = jaket.getJaketA() * jumlah;
            } else if (pilihan.equals("b")) {
                total = jaket.getJaketB() * jumlah;
            } else {
                total = jaket.getJaketC() * jumlah;
            }
        } else if (jumlah > 100) {
            if (pilihan.equals("a")) {
                total = (jaket.getJaketA() - 5000) * jumlah;
            } else if (pilihan.equals("b")) {
                total = (jaket.getJaketB() - 5000) * jumlah;
            } else {
                total = (jaket.getJaketC() - 15000) * jumlah;
            }
        }
        return total;
    }

    public void keranjang(String pilihan, int total, int jumlah, int x, int bayar) {
        keranjang[x][0] = pilihan;
        keranjang[x][1] = Integer.toString(jumlah);
        keranjang[x][2] = Integer.toString(total);
        keranjang[x][3] = Integer.toString(bayar);
    }
    
    public String[][] getKeranjang(){
        return keranjang;
    }

    public static void cetakStruk(String[][] keranjang) {
        int y = 0;
        System.out.println("Jenis\t Jumlah\t   Harga");
        System.out.println("------------------------------");
        for (int x = 0; x < keranjang.length; x++) {
            if (keranjang[x][0] == null) {
                break;
            }
            System.out.print("Jaket " + keranjang[x][0] + "\t ");
            System.out.print(" " + keranjang[x][1] + "\t  ");
            System.out.println(" Rp." + keranjang[x][2]);
            y = x;
        }
        System.out.println("------------------------------");
        System.out.println("Total = Rp." + keranjang[y][3]);
    }

}