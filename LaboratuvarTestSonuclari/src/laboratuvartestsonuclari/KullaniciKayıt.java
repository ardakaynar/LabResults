/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratuvartestsonuclari;

import java.util.Scanner;

/**
 *
 * @author ardakaynar
 */
public class KullaniciKayıt {

    String ad;
    String soyad;
    String id;
    TestSonuclari sonuc;

    public KullaniciKayıt(String ad, String soyad, String id) {

        this.ad = ad;
        this.soyad = soyad;
        this.id = id;

    }

    public KullaniciKayıt() {

        this.sonuc = new TestSonuclari();
        Scanner girdi = new Scanner(System.in);
        System.out.print("Adınız	  : ");
        String ad = girdi.next();

        System.out.print("Soyadınız : ");
        String soyad = girdi.next();

        System.out.print("Tc Kimlik Numaranız : ");
        String id = girdi.next();

        this.ad = ad;
        this.soyad = soyad;
        this.id = id;

    }

}
