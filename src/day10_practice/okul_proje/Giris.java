package day10_practice.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
 /*
     * ogretmen bilgilerini kullanicidan aliniz
     * aldiginiz bilgilerrden object ureterek yeni
      ogretmenler olusturun ve bilgilerini yazdirin
     */
    static Scanner scan = new Scanner(System.in);//TODO static tanimla

    static List<OgretmenBilgileri> ogretmenList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("hosgeldiniz okulumuza ");

        System.out.println("isim giriniz");

        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyisim = scan.nextLine();

        System.out.println("yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("bransinizi giriniz");
        String brans = scan.next();


        System.out.println("telefon no giriniz");
        String tel = scan.next();

        //scan.nextLine();//dummy hayalet komut

        OgretmenBilgileri adayOgretmen = new OgretmenBilgileri(isim, soyisim, yas, brans, tel);



        ogretmenList.add(adayOgretmen);

        System.out.println("ogretmenList = " + ogretmenList);


    }


}
