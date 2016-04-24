package bab5;

public class Kalkulator {

    private static int a, b;

    public Kalkulator() {
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        Kalkulator.a = a;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        Kalkulator.b = b;
    }

    public static void Penjumlahan() {
        int jumlah = a + b;
        System.out.println("Hasil Penjumlahan : " + jumlah);
    }

    public static void Pengurangan() {
        int kurang = a - b;
        System.out.println("Hasil : " + kurang);
    }

    public void Perkalian() {
        int kali = a * b;
        System.out.println("Hasil : " + kali);
    }

    public void Pembagian() {
        double bagi = a / b;
        System.out.println("Hasil : " + bagi);
    }

    public int Sederhana(int pemb, int peny) {
        int s = 2, t = 2;
        int x = pemb, y = peny;
        while (x != y) {
            if (x > y) {
                while ((pemb % s) != 0) {
                    s++;
                }
                x = pemb / s;
                s++;
            } else {
                while ((peny % t) != 0) {
                    t++;
                }
                y = peny / t;
                t++;
            }
        }
        return (x);
    }
}
