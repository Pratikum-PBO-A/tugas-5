package praktikum;
public class Aritmatika {
String nil, nil2;
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
    
    public void hitungPembagian (String nil, String nil2){
        double n1 = java.lang.Double.parseDouble(nil);
        double n2 = java.lang.Double.parseDouble(nil2);
        double nilai = n1/n2;
        System.out.println("nilai pembagian adalah : " + nilai);
    }
}
