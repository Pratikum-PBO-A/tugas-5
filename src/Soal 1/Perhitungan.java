
public class Perhitungan {


    private double bilangan1;
    private double bilangan2;
    private static double hasil;
    public static Perhitungan p = new Perhitungan();
    public void setBilangan1(double bilangan1) {
        this.bilangan1 = bilangan1;
    }
    
    public void setBilangan2(double bilangan2) {
        this.bilangan2 = bilangan2;
    }

    public double getBilangan1() {
        return bilangan1;
    }

    public double getBilangan2() {
        return bilangan2;
    }

    public double getHasil() {
        return hasil;
    }
    
    public static double penjumlahan(double b1,double b2) {
        hasil=b1+b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public static double pengurangan(double b1,double b2) {
        hasil=b1-b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public double perkalian(double b1,double b2) {
        hasil=b1*b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public double pembagian(double b1,double b2) {
        hasil=b1/b2;
        Perhitungan.hasil=hasil;
        return hasil;
    }

    public void cetakHasil(double hasil,String tanda) {
        System.out.println(this.bilangan1 + " " + tanda + " " + this.bilangan2 + " = " + hasil);
    }

    public double sederhana(double hasil) {
        hasil = Math.round(hasil * 100.0) / 100.0;
        return hasil;
    }
}
