package Kasr;

public class Kasr {

    int surat;
    int maxraj;

    public Kasr(int surat, int maxraj) {
        this.surat = surat;
        this.maxraj = maxraj;
    }

    void showInfo() {
        System.out.println(surat + "/" + maxraj);
    }

    void addTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2) {
        int c = (surat1 * Ekuk(maxraj1, maxraj2) / maxraj1) + (surat2 * Ekuk(maxraj1, maxraj2) / maxraj2);
        int d = Ekuk(maxraj1, maxraj2);
        if (((surat1 * Ekuk(maxraj1, maxraj2) / maxraj1) + (surat2 * Ekuk(maxraj1, maxraj2) / maxraj2)) % Ekuk(maxraj1, maxraj2) != 0) {
            System.out.println(((surat1 * Ekuk(maxraj1, maxraj2) / maxraj1) + (surat2 * Ekuk(maxraj1, maxraj2) / maxraj2)) / Ekub(c, d) + "/"
                    + Ekuk(maxraj1, maxraj2) / Ekub(c, d));
        } else {
            System.out.println(((surat1 * Ekuk(maxraj1, maxraj2) / maxraj1) + (surat2 * Ekuk(maxraj1, maxraj2) / maxraj2)) / Ekuk(maxraj1, maxraj2));
        }
    }

    void multiplyTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2) {
        int c = (surat1 * surat2);
        int d = (maxraj1 * maxraj2);
        if ((surat1 * surat2) % (maxraj1 * maxraj2) != 0) {
            System.out.println((surat1 * surat2) / Ekub(c, d) + "/"
                    + (maxraj1 * maxraj2) / Ekub(c, d));
        } else {
            System.out.println((surat1 * surat2) / (maxraj1 * maxraj2));
        }
    }

    void divisionTwoKasr(int surat1, int maxraj1, int surat2, int maxraj2) {
        int c = (surat1 * maxraj2);
        int d = (surat2 * maxraj1);
        if ((surat1 * maxraj2) % (surat2 * maxraj1) != 0) {
            System.out.println((surat1 * maxraj2) / Ekub(c, d) + "/" + (surat2 * maxraj1) / Ekub(c, d));
        } else {
            System.out.println((surat1 * maxraj2) / (surat2 * maxraj1));
        }
    }

    int Ekuk(int maxraj1, int maxraj2) {
        int a = maxraj1;
        int b = maxraj2;
        while (maxraj1 != maxraj2) {
            if (maxraj1 > maxraj2) {
                maxraj1 -= maxraj2;
            } else {
                maxraj2 -= maxraj1;
            }
        }
        return a * b / maxraj1;
    }

    int Ekub(int c, int d) {
        while (c != d) {
            if (c > d) {
                c -= d;
            } else {
                d -= c;
            }
        }
        return c;
    }
}