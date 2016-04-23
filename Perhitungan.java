public class Perhitungan{
  public static double Penjumlahan(double a, double b){
    double c = a+b;
    return c;
  }
    public static double Pengurangan(double a, double b){
        double c = a-b;
        return c;
    }
    public static double Perkalian(double a, double b){
        double c = a*b;
        return c;
    }
    public static double Pembagian(double a, double b){
        double c = a/b;
        return c;
    }
    public void Sederhana(double pembilang, double penyebut){
        int tmp = 1;
        System.out.println("Nilai pecahan sebelum disederhanakan : " +(int)pembilang+"/"+(int)penyebut);
        for (int i = 2; i <= pembilang; i++) {
            if ((int)pembilang%i==0&&(int)penyebut%i==0) {
                tmp = i;
            }
        }
        System.out.println("Nilai pecahan setelah disederhanakan : "+(int)(pembilang/tmp)+"/"+(int)(penyebut/tmp));
    }
}
