package definisimasalah;
public class basisangka {
    private double a, b;
    public static void tambah(double a, double b) {
        a+=b;
        System.out.println("Hasil penjumlahan = "+a);
    }
    public static void kurang(double a, double b) {
        a-=b;
        System.out.println("Hasil pengurangan = "+a);
    }
    public void kali(double a, double b) {
        a*=b;
        System.out.println("Hasil kalinya = "+a);
    }
    public void bagi(double a, double b) {
        a/=b;
        System.out.println("Hasil pembagian = "+a);
    }
    public void sederhana(int b, int a) {
        System.out.println("inputan anda " + b + "/" + a);
        if (a == b) {
            System.out.println("hasil penyederhanaanya adalah 1 ");
        } else if (b % a == 0) {
            System.out.println("hasil penyederhanaaanya adalah " + b / a);
        } else if (b > a) {
            for (int x = a; x >= 1; x--) {
                if (b % x == 0 && a % x == 0) {
                    b = b / x;
                    a = a / x;
                    System.out.println("hasil penyerderhanaanya adalah " + b + "/" + a);
                    break;
                }
            }
        } else if (a > b) {
            for (int x = b; x >= 1; x--) {
                if (b % x == 0 && a % x == 0) {
                    b = b / x;
                    a = a / x;
                    System.out.println("hasil penyerderhanaanya adalah " + b + "/" + a);
                    break;
                }
            }
        }
    }
}
