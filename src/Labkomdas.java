package Modul2_Bab5;

/**
 *
 * @author abdu_
 */
public class Labkomdas {

    final int A = 100000;
    final int B = 125000;
    final int C = 175000;
    int jumlah, harga;
    String jenis;

    public void jaketA(int a) {
        jumlah = a;
        if (jumlah > 100) {
            final int A = 95000;
            harga = jumlah * A;
            System.out.println("Harga Jaket A dengan jumlah " + jumlah + " (lebih dari 100) : \nTotal yang hatus dibayar (" + jumlah + "*" + A + ") = " + harga);
        } else if (jumlah <= 100) {
            harga = jumlah * A;
            System.out.println("Harga Jaket A dengan jumlah " + jumlah + " (kurang dari 100) : \n(" + jumlah + "*" + A + ") = " + harga);
        }
    }

    public void jaketB(int b) {
        jumlah = b;
        if (jumlah > 100) {
            final int B = 120000;
            harga = jumlah * B;
            System.out.println("Harga Jaket B dengan jumlah " + jumlah + " (lebih dari 100) : \n(" + jumlah + "*" + B + ") = " + harga);
        } else if (jumlah <= 100) {
            harga = jumlah * B;
            System.out.println("Harga Jaket B dengan jumlah " + jumlah + " (kurang dari 100) : \n(" + jumlah + "*" + B + ") = " + harga);
        }
    }

    public void jaketC(int c) {
        jumlah = c;
        if (jumlah > 100) {
            final int C = 160000;
            harga = jumlah * C;
            System.out.println("Harga Jaket C dengan jumlah " + jumlah + " (lebih dari 100) : \n(" + jumlah + "*" + C + ") = " + harga);
        } else if (jumlah <= 100) {
            harga = jumlah * C;
            System.out.println("Harga Jaket C dengan jumlah " + jumlah + " (kurang dari 100) : \n(" + jumlah + "*" + C + ") = " + harga);
        }
    }
}
