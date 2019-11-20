package laboratuvartestsonuclari;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LaboratuvarTestSonuclari {

    static void kaydet(ArrayList<KullaniciKayıt> list) throws IOException {
        File file = new File("dosya.txt");//Dosya oluşturma
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file, false);//Dosya yazma
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size(); i++) {
            bWriter.write(list.get(i).ad + " ");
            bWriter.write(list.get(i).soyad + " ");
            bWriter.write(list.get(i).id + "\r\n");

        }

        bWriter.close();
    }

    public static void main(String[] args) throws IOException {
        KullaniciKayıt aktif_profil = null;
        ArrayList<KullaniciKayıt> arrList = new ArrayList<KullaniciKayıt>();
        File file = new File("dosya.txt");//Dosya oluşturma
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);//Dosya okuma
        String line = null;

        BufferedReader br = new BufferedReader(fileReader);
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            if (words.length < 3) {
                continue;
            }

            KullaniciKayıt hafıza = new KullaniciKayıt(words[0], words[1], words[2]);

            arrList.add(hafıza);

        }
        br.close();

        Scanner girdi = new Scanner(System.in);
        while (true) {
            System.out.println("Giris yapmak icin '1' \nKaydolmak icin '2' \nKullanıcı silmek için '3' \nBütün kullanicilari silmek için '4'");
            int deger = girdi.nextInt();

            if (deger == 1) {
                Scanner a = new Scanner(System.in);
                System.out.print("Id giriniz	  : ");
                String checkId = a.nextLine();
                for (int i = 0; i < arrList.size(); i++) {
                    if (arrList.get(i).id.equals(checkId)) {
                        aktif_profil = arrList.get(i);
                        break;
                    }
                }
                if (aktif_profil == null) {
                    System.out.println("Hatalı Tc");
                    System.exit(0);
                }
                System.out.print("Test Sonuclarını Görmek Icin '1' VKI Hesaplamak Icin '2' Yazınız.");
                Scanner b = new Scanner(System.in);
                int deger1 = girdi.nextInt();
                if (deger1 == 1) {
                    System.out.println("\r\n" + aktif_profil.ad.toUpperCase() + " " + aktif_profil.soyad.toUpperCase() + " " + "Kisisinin Test Sonuclari Assagidadir." + "\r\n");
                    TestSonuclari x = new TestSonuclari();
                    x.Sonuc_Goster();
                } else if (deger1 == 2) {
                    Vki vki = new Vki();
                }

            } else if (deger == 2) {

                KullaniciKayıt a = new KullaniciKayıt();
                arrList.add(a);
                kaydet(arrList);

            } else if (deger == 3) {
                Scanner a = new Scanner(System.in);
                System.out.print("Id giriniz	  : ");
                String checkId = a.nextLine();

                for (int i = 0; i < arrList.size(); i++) {
                    if (arrList.get(i).id.equals(checkId)) {
                        arrList.remove(i);
                        kaydet(arrList);
                    }

                }
            } else if (deger == 4) {
                arrList.clear();
                kaydet(arrList);

            }
            System.out.println("\n-------------İYİ GÜNLER DİLERİZ----------\n");
        }
    }
}
