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
public class Vki {

    double kilo, boy, sonuc;

    public Vki() {
        this.kilo = kilo;
        this.boy = boy;
        this.sonuc = sonuc;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
        kilo = girdi.nextDouble();
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz: Örnek:(1,75)");
        boy = girdi.nextDouble();
        sonuc = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz:" + sonuc);
        if (sonuc < 18.5) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:Zayıf");
        } else if (sonuc >= 18.5 && sonuc <= 24.9) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:Normal");
        } else if (sonuc > 24.9 && sonuc <= 29.9) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:Kilolu");
        } else if (sonuc > 29.9 && sonuc <= 34.9) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:1.Derece obez");
        } else if (sonuc > 34.9 && sonuc <= 39.9) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:2.Derece obez");
        } else if (sonuc > 39.9) {
            System.out.println("Vücut kitle indeksinize göre durumunuz:3.Derece obez");
        } else {
            System.out.println("Hata oluştu");
        }

    }

}
