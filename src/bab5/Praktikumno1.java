package bab5;

public class Praktikumno1 {
    
    public static void Penjumlahan (int a,int b){
        
        int hasil = (a+b);
        System.out.println("Hasil dari Penjumlahan adalah "+hasil);
    }
    public static void Pengurangan (int a,int b){
        int hasil = (a-b);
        System.out.println("Hasil dari Pengurangan adalah "+hasil);
    }
    
    public void Perkalian (int a,int b){
        int hasil = (a*b);
        System.out.println("Hasil dari Perkalian adalah "+hasil);
    }
    public void Pembagian (int a,int b){
        int hasil = (a/b);
        System.out.println("Hasil dari Pembagian adalah "+hasil);
        
    }
    
    public void Sederhana(int a,int b){
       int [] z = new int [100];
       int x=0;
        for (int i=1;i<=10;i++){
            if (a%i==0 && b%i==0){
                z[x]=i;
                x++;
            }
        }
            int c = a/z[x-1];
            int d = b/z[x-1];
            System.out.print("Sebelum di-sederhanakan adalah  :\n\n"+a);
            System.out.print("                               \n-");
            System.out.println("                              \n"+b);
            System.out.println("\n");
            System.out.print("Setelah di-sederhanakan adalah  :\n\n"+c);
            System.out.print("                               \n-");
            System.out.println("                              \n"+d);       
    }
    
}
