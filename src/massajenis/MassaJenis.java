/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massajenis;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menghitung mass jenis
 * suatu kubus
 * 
 */
public class MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kbs = new Kubus();
        System.out.println("======Massa Jenis Kubus======");
        kbs.setSisi(5);
        kbs.setMassa(250);
        System.out.println("Sisi  : "+kbs.getSisi());
        System.out.println("Massa : "+kbs.getMassa());
        System.out.println("");
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : "+kbs.hitungMassaJenis(kbs.getMassa(), kbs.hitungVolume(kbs.getSisi())));
        System.out.println("\nDevelop By : Fiqri Akbar Pratama");
    }
    
}
