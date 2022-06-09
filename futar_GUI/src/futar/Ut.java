/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futar;

/**
 *
 * @author thomas
 */
public class Ut implements Comparable<Ut> {

    private int nap;
    private int sorszam;
    private int hossz;

    public Ut(int nap, int sorszam, int hossz) {
        this.nap = nap;
        this.sorszam = sorszam;
        this.hossz = hossz;
    }

    @Override
    public int compareTo(Ut masik) {
        int result = this.nap - masik.nap;
        if (result == 0) {
            result = this.sorszam - masik.sorszam;
        }
        return result;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public int getSorszam() {
        return sorszam;
    }

    public void setSorszam(int sorszam) {
        this.sorszam = sorszam;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

}
