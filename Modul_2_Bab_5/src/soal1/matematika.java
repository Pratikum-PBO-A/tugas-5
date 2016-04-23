package soal1;
public class matematika {
    public static void hitungJumlah (int x, int y){
        int nilai = x + y;
        System.out.println("Hasilnya " + x + " + " + y + " = "+ nilai);
    }
    
    public static void hitungKurang (int x, int y){
        int nilai = x - y;
        System.out.println("Hasilnya " + x + " - " + y + " = "+ nilai);
    }
    
    public void hitungKali (int x, int y){
        int nilai = x * y;
        System.out.println("Hasilnya " + x + " x " + y + " = "+ nilai);
    }
    
    public void hitungBagi (int x, int y){
        int nilai = x/y;
        System.out.println("Hasilnya " + x + " / " + y + " = "+ nilai);
    }
    
    static int BilPecahannya (int pemb, int peny){
        int s=2, t=2;
        int a=pemb, b=peny;
        while (a!=b){
            if (a>b){
                while ((pemb%s) !=0){
                    s++;
                }
                a=pemb/s;
                s++;
            } else {
                while ((peny%t)!=0){
                    t++;
                }
                b=peny/t;
                t++;
            }
        }
        return a;
    }
    
    public void sederhana (int pemb1, int peny1){
        System.out.println("Pecahan sebelum disederhanakan = "+pemb1+"/"+peny1);
        int pembagi = BilPecahannya(pemb1, peny1);
        int pemb2 = pemb1/pembagi;
        int peny2 = peny1/pembagi;
        System.out.println("Pecahan setelah disederhanakan = "+pemb2+"/"+peny2+"\n");
    }
    
}
