package bab5;

public class Konveksi {

    private final int A = 100000;
    private final int B = 125000;
    private final int C = 175000;
    private int nilaiA, nilaiB, nilaiC;

    public void setNilaiA(int jumlahA) {
        if (jumlahA > 100) {
            this.nilaiA = (A - 5000)*jumlahA;
        } else {
            this.nilaiA = A*jumlahA;
        }
    }

    public int getNilaiA() {
        return nilaiA;
    }

    public void setNilaiB(int jumlahB) {
        if (jumlahB > 100) {
            this.nilaiB = (B - 5000)*jumlahB;
        } else {
            this.nilaiB = B*jumlahB;
        }
    }

    public int getNilaiB() {
        return nilaiB;
    }

    public void setNilaiC(int jumlahC) {
        if (jumlahC > 100) {
            this.nilaiC = (C - 15000)*jumlahC;
        } else {
            this.nilaiC = C*jumlahC;
        }
    }

    public int getNilaiC() {
        return nilaiC;
    }     
        
}
