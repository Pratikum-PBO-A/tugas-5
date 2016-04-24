package hitung;
public class Hitung {
        private static int tpem,kpem,xpem;
        private static double bpem;
    public Hitung(){
        this.tpem=tpem;
        this.kpem=kpem;
        this.xpem=xpem;
        this.bpem=bpem;}
    public static void Penjumlahan(int w, int x){
        tpem=(w+x);
        System.out.println("Hasil penjumlahan adalah : "+tpem);}
    public static void Pengurangan(int w, int x){
        kpem=(w-x);
        System.out.println("Hasil pengurangan adalah : "+kpem);}
    public void Perkalian(int w, int x){
        xpem=w*x;
        System.out.println("Hasil perkalian adalah : "+xpem);}
    public void Pembagian(double a, double b){
        bpem=(a/b);
        System.out.println("Hasil pembagian adalah : "+bpem);}    
    public void Sederhana(int x, int y){
        if (x%2==0 && y%2==0){
            x=x/2; y=y/2;}
            else if (x%3==0 && y%3==0){
                x=x/3; y=y/3;}
            else if (x%5==0 && y%5==0){
                x=x/5; y=y/5;}
            else if (x%7==0 && y%7==0){
                x=x/7; y=y/7;}
        System.out.println("Hasil penyederhanaan adalah : "+x+"/"+y);}}   

