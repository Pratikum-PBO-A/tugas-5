/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaket;

public class Jaket {
    private final int jkta=100000;
    private final int jktb=125000;
    private final int jktc=175000;
    private static int jmla, jmlb, jmlc, tota, totb, totc;
    public Jaket(){
        this.jmla=jmla;
        this.jmlb=jmlb;
        this.jmlc=jmlc;}
    public void jaketA(int ja){
        this.jmla=ja;
        if (jmla<=100)
            tota=95000*jmla;
        else tota=jkta*jmla;
        System.out.println("Maka yang harus dibayarkan adalah : Rp. "+tota+"\n");}
    public void jaketB(int jb){
        this.jmlb=jb;
        if (jmlb<=100)
            totb=120000*jmlb;
        else totb=jktb*jmlb;
        System.out.println("Maka yang harus dibayarkan adalah : Rp. "+totb+"\n");}
    public void jaketC(int jc){
        this.jmlc=jc;
        if (jmlc<=100)
            totc=160000*jmlc;
        else totc=jktc*jmlc;
        System.out.println("Maka yang harus dibayarkan adalah : Rp. "+totc+"\n");}}

    
    

