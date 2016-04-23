package soal2;
public class jaket {
    public final int harga [] = {100,125,175};
    public final int hargab [] = {95,120,160};
    private int banyak,harga1, harga2, harga3;
    private int total;
    
    public void jumlah (int j){
        this.banyak = j;
    }
    public int price1(){
        return this.harga1 = banyak*harga[0];
    }
    public int price2(){
        return this.harga2 = banyak*harga[1];
    }
    public int price3(){
        return this.harga3 = banyak*harga[2];
    }
    public int price1b(){
        return this.harga1 = banyak*hargab[0];
    }
    public int price2b(){
        return this.harga2 = banyak*hargab[1];
    }
    public int price3b(){
        return this.harga3 = banyak*hargab[2];
    }
    public void jumlah(){
        this.total = this.harga1 + this.harga2 + this.harga3;
    }
    public int getJumlah (){
        return this.total;
    }
     public void display(){
        System.out.println("============================");
        System.out.println("   T E R I M A  K A S I H");
        System.out.println("============================");
        System.out.println("Total Harga\t (dalam ribu) : Rp " + getJumlah());
    }
}
