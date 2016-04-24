
package jaket;
import java.util.Scanner;
public class Mainjaket {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket jk = new Jaket();
        System.out.print("Masukkan jumlah jaket A yang ingin dibeli : ");
        int ja = in.nextInt();
        jk.jaketA(ja);
        System.out.print("Masukkan jumlah jaket B yang ingin dibeli : ");
        int jb = in.nextInt();
        jk.jaketB(jb);
        System.out.print("Masukkan jumlah jaket C yang ingin dibeli : ");
        int jc = in.nextInt();
        jk.jaketC(jc);}}


