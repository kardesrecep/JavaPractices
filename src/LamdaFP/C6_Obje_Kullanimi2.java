package LamdaFP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C6_Obje_Kullanimi2 {
    public static void main(String[] args) {
        Ogretmen ogretmen1  =new Ogretmen("Hafsa","Sultan","Matematik",25,3);
        Ogretmen ogretmen2=new Ogretmen("Hakan","Uslu","Fen",50,25);
        Ogretmen ogretmen3=new Ogretmen("Ali","San","Bilgisayar",35,10);
        Ogretmen ogretmen4=new Ogretmen("Canan","Okur","Resim",40,15);
        Ogretmen ogretmen5=new Ogretmen("Zeynep","Bulut","Kimya",30,7);
        Ogretmen ogretmen6=new Ogretmen("Can","Tan","Edebiyat",46,21);
        Ogretmen ogretmen7=new Ogretmen("Zeynep","Bul","Matematik",35,12);
        Ogretmen ogretmen8=new Ogretmen("Cansu","KUL","Edebiyat",26,4);

        List<Ogretmen> list=new ArrayList<>();
        list.add(ogretmen1);
        list.add(ogretmen2);
        list.add(ogretmen3);
        list.add(ogretmen4);
        list.add(ogretmen5);
        list.add(ogretmen6);
        list.add(ogretmen7);
        list.add(ogretmen8);


        //  System.out.println(list);
        //  System.out.println("otuzdanBuyuk(list) = " + otuzdanBuyuk(list));
        //System.out.println("onyildanFazla(list) = " + onyildanFazla(list));
        //sirala(list);
        // System.out.println("bransMat(list) = " + bransMat(list));
        //System.out.println("bransMat2(list) = " + bransMat2(list));
        //  System.out.println("geoOlmayan(list) = " + geoOlmayan(list));
//yasSirala(list);

    }
    //S1 : yasi 30DAN buyuk olanlari listeleyelim
    public static List<Ogretmen> otuzdanBuyuk(List<Ogretmen> l){
        return l.stream().filter(t->t.getYas()>30).collect(Collectors.toList());
    }


    // S2 : 10 yildan fazla calisan var mi
    public static boolean onyildanFazla(List<Ogretmen>l){
        return l.stream().anyMatch(t->t.getCalismaSuresi()>10);
    }

    // S3 : isimlerini alfabedik siraya gore sirala
    public static void sirala(List<Ogretmen>l){
        l.stream().sorted(Comparator.comparing(t->t.getOgretmenADI())).
                forEach(t-> System.out.println(t.getOgretmenADI()));
    }



    // S4: bransi matematik olanlari listeleyelim
    public static List<Ogretmen> bransMat(List<Ogretmen>l){
        return l.stream().filter(t->t.getBransi().equalsIgnoreCase("Matematik")).collect(Collectors.toList());
    }

    public static List<Ogretmen> bransMat2(List<Ogretmen>l){
        return l.stream().filter(t->t.getBransi().contains("Matematik")).collect(Collectors.toList());
    }

    //S5: bransi geometri  olmayan var mi
    public static boolean geoOlmayan(List<Ogretmen>l){
        return l.stream().noneMatch(t->t.getBransi().equalsIgnoreCase("geometri"));
    }

    //  S6: yaslarinin buyukten kucuge siralayalim ve  adlari yazdiralim
    public static void yasSirala(List<Ogretmen>l){
        l.stream().sorted(Comparator.comparing(Ogretmen::getYas).reversed()).
                forEach(t-> System.out.println(t.getOgretmenADI()+" : " +t.getYas()));

    }

}