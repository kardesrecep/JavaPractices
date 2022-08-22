package day10_practice.constructor.sizden;

import java.util.Scanner;
public class ConstructorIsimDegistirme {//Burak bey den

    String isim;
    String soyisim;
    int sinif;
    String sube;
    int okulNo;

    public ConstructorIsimDegistirme() {
    }

    public ConstructorIsimDegistirme(String isim, String soyisim, int sinif, String sube, int okulNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.sinif = sinif;
        this.sube = sube;
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "*****Ogrenci Bilgileri*****"+
                "\n isim= " + isim +
                "\n soyisim= " + soyisim +
                "\n sinif= " + sinif +
                "\n sube= " + sube +
                "\n okulNo= " + okulNo;
    }

    public static void main(String[] args) {
        String isim = "Mehmet";
        String soyisim = "Yildiz";
        int sinif = 11;
        String sube = "C";
        int okulNo = 342;

        ConstructorIsimDegistirme ogrenci1 = new ConstructorIsimDegistirme(isim, soyisim,sinif, sube, okulNo);
        System.out.println("\nIlk Hali\n"+ogrenci1);

        System.out.println("\nisimDegistir methodundan sonra");
        isimDegistir(ogrenci1);

        ogrenci1.soyisim = soyisimDegistir(soyisim);
        System.out.println("\nsoyisimDegistir methodundan sonra\n"+ogrenci1);

    }

    public static String soyisimDegistir(String soyisim) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yeni soyisim giriniz :");
        soyisim = scanner.nextLine();

        return soyisim;
    }

    public static void isimDegistir(ConstructorIsimDegistirme object) {
        object.isim = "Ayse";
        object.soyisim = "Kaya";
        object.sinif = 9;
        object.sube = "A";
        object.okulNo = 875;

        System.out.println(object);
    }
}