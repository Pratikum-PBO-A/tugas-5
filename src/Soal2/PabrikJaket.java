public class PabrikJaket {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private final static PabrikJaket pj = new PabrikJaket();
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
            System.out.print(pj.getJaketA());
        } else if (pilihan.equals("b")) {
            System.out.print(pj.jaketB);
        } else {
            System.out.print(pj.getJaketC());
        }
        System.out.print("\nApabila membeli lebih dari 100 biji");
        System.out.print("\nHarga satuan menjadi ");
        if (pilihan.equals("a")) {
            System.out.print(pj.getJaketA() - 5000);
        } else if (pilihan.equals("b")) {
            System.out.print(pj.jaketB - 5000);
        } else {
            System.out.print(pj.getJaketC() - 15000);
        }
    }

    public int pembelian(String pilihan, int jumlah) {
        int total = 0;
        if (jumlah > 0 && jumlah <= 100) {
            if (pilihan.equals("a")) {
                total = pj.getJaketA() * jumlah;
            } else if (pilihan.equals("b")) {
                total = pj.getJaketB() * jumlah;
            } else {
                total = pj.getJaketC() * jumlah;
            }
        } else if (jumlah > 100) {
            if (pilihan.equals("a")) {
                total = (pj.getJaketA() - 5000) * jumlah;
            } else if (pilihan.equals("b")) {
                total = (pj.getJaketB() - 5000) * jumlah;
            } else {
                total = (pj.getJaketC() - 15000) * jumlah;
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
        System.out.println("Jenis\tQty  Harga");
        System.out.println("------------------");
        for (int x = 0; x < keranjang.length; x++) {
            if (keranjang[x][0] == null) {
                break;
            }
            System.out.print("Jaket " + keranjang[x][0] + "\t");
            System.out.print(" " + keranjang[x][1]);
            System.out.println(" Rp." + keranjang[x][2]);
            y = x;
        }
        System.out.println("------------------");
        System.out.println("Total = Rp." + keranjang[y][3]);
    }

}
