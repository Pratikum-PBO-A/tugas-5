package Modul2_Bab5;

/**
 *
 * @author abdu_
 */
public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }
    
    public static void hitungPembagian(double a, double b){
        double nilai = a/b;
        System.out.println("nilai pembagian adalah : "+ nilai);
    }
    
    public double hitungPembagian(String nil1, String nil2){
          double a=Double.parseDouble(nil1);
          double b=Double.parseDouble(nil2);
          return a/b;
    }
}
