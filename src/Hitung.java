package Modul2_Bab5;

/**
 *
 * @author abdu_
 */
public class Hitung {

    public static void penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan " + a + "+" + b + " = " + hasil);
        System.out.println("=====================================");
    }
    
    public static void pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan " + a + "-" + b + " = " + hasil);
        System.out.println("=====================================");
    }
    
    public void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil Perkalian " + a + "*" + b + " = " + hasil);
        System.out.println("=====================================");
    }
    
    public void pembagian(int a, int b) {
        int hasil = a / b;
        if (a % b == 0) {
            System.out.println("Hasil pembagian " + a + "/" + b + " = " + hasil + " (tidak ada sisa) ");
            System.out.println("=====================================");
        } else {
            System.out.println("Hasil pembagian " + a + "/" + b + " memiliki sisa maka pembagian adalah " + a + "/" + b);
            sederhana(a, b);
        }
    }

    public void sederhana(int a, int b) {
        int bagi = 0;
        for (int i = 1; i <= b; i++) {
            if (b % i == 0 && a % i == 0) {
                bagi = i;
            } else {
                continue;
            }
        }
        System.out.println("Bentuk Sederhana : " + a / bagi + "/" + b / bagi);
        System.out.println("=====================================");
    }
}
