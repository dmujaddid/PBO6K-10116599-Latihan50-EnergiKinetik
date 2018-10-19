/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan50.energikinetik;

/**
 *
 * @author NAMA : Robby Eka Purnama KELAS : PBO6K NIM : 10116599 Deskripsi
 * Program :
 *
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Inisialisasi
        EnergiKinetik eki = new EnergiKinetik();

        // Input nilai
        eki.setMassa(145);
        eki.setKecepatan(25);

        System.out.println("=== Menghitung Energi Kinetik & Usaha ===");
        System.out.println();
        System.out.println("Diketahui,");
        System.out.println("Massa bola baseball (gr) : " + eki.getMassa());
        System.out.println("Kecepatan dilempar (m/s) : " + eki.getKecepatan());
        System.out.println();

        // Output penghitungan
        System.out.println("Maka,");
        System.out.println("Energi Kinetik : " + eki.hitungEnergiKinetik(0, 0) + " Joule");
        System.out.println("Usaha          : " + eki.hitungUsaha(0, 0) + " Joule");

    }

}
