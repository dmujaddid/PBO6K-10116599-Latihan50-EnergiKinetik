/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan50.energikinetik;

/**
 *
 * @author eka
 */
public class EnergiKinetik {

    double massa;
    int kecepatan;

    public double getMassa() {
        return massa * 0.001; // konversi dari gram ke kilogram
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik(double massa, int kecepatan) {
        //return (0.5 * massa * kecepatan * kecepatan);             EK = 0.5*mv^2
        return (0.5 * getMassa() * (getKecepatan() * getKecepatan()));
    }

    public double hitungUsaha(double massa, int kecepatan) {
        return (0.5 * getMassa()) * (getKecepatan() * getKecepatan() - 0);  // 0 --> diam --> kecepatan pertama
    }

}
