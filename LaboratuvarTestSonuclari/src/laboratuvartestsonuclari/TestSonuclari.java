/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratuvartestsonuclari;

import java.util.Random;

/**
 *
 * @author ardakaynar
 */
public class TestSonuclari {

    int hemogram;
    int lökosit;
    int lym;

    public TestSonuclari(int hemogram, int lökosit, int lym) {

        Random rnd = new Random();
        hemogram = (30 + (int) (Math.random() * 100));

        Random rnd1 = new Random();
        lökosit = (int) (4.5 + (double) (Math.random() * 6.5));

        Random rnd2 = new Random();
        lym = rnd.nextInt(20);

        this.hemogram = hemogram;
        this.lökosit = lökosit;
        this.lym = lym;

    }

    public TestSonuclari() {

        Random rnd = new Random();
        hemogram = (30 + (int) (Math.random() * 100));

        Random rnd1 = new Random();
        lökosit = (int) (4.5 + (double) (Math.random() * 6.5));

        Random rnd2 = new Random();
        lym = rnd.nextInt(20);

        this.hemogram = hemogram;
        this.lökosit = lökosit;
        this.lym = lym;

    }

    void Sonuc_Goster() {
        System.out.println("------------------------------\r\nTEST SONUÇLARI\r\n------------------------------");
        System.out.print("hemogram : " + hemogram);
        if (hemogram < 100 && hemogram > 80) {
            System.out.println("-->Hemogram degeriniz normal.");
        } else if (hemogram < 80) {
            System.out.println("-->Hemogram degeriniz normalin altında.");
        } else if (hemogram > 100) {
            System.out.println("-->Hemogram degeriniz normalin üstünde.");
        }
        System.out.print("lökosit degeri: " + this.lökosit);
        if (this.lökosit < 11 && this.lökosit > 4.5) {
            System.out.println("-->Lökosit degeriniz normal.");
        } else if (this.lökosit < 4.5) {
            System.out.println("-->Lökosit degeriniz normalin altında.");
        } else if (this.lökosit > 11) {
            System.out.println("-->Lökosit degeriniz normalin üstünde.");
        }
        System.out.print("lym değeri: " + this.lym);
        if (this.lym < 11 && this.lym > 4.5) {
            System.out.println("-->Lym degeriniz normal.");
        } else if (this.lym < 4.5) {
            System.out.println("-->Lym degeriniz normalin altında.");
        } else if (this.lym > 11) {
            System.out.println("-->Lym degeriniz normalin üstünde.");
        }
    }

}
