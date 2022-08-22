package LamdaFP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class C2_StringList_StreamOrnekleri {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
        //  System.out.println(list); //[Java, ogrenmek, cok, eglencelidi, lambda, gelince, Daha, da, cok, Eglenceli, Oldu]
        // System.out.println("dcIleBasYaz(list) = " + dcIleBasYaz(list));
        // System.out.println("dcIleBasYaz2(list) = " + dcIleBasYaz2(list));
        //yildizYaz(list);
        //  System.out.println("sira(list) = " + sira(list));
        // lSil(list);
        //System.out.println("eOlan(list) = " + eOlan(list));
        //IlktekrarYaz(list);
        // ilkBuyukDigerKucuk(list);
        System.out.println("uzunluk46Haric(list) = " + uzunluk46Haric(list));
        System.out.println("uzunluk46Haric2(list) = " + uzunluk46Haric2(list));
    }
    // S1: ilk harfi d ve ya c olanlari listeleyelim
    public static List<String> dcIleBasYaz(List<String> l){
        return l.stream().filter(t->t.startsWith("d") || t.startsWith("c")).collect(Collectors.toList());
    }
    public static List<String> dcIleBasYaz2(List<String> l){
        return l.stream().filter(t->t.startsWith("d")).filter(t->t.startsWith("c")).collect(Collectors.toList());
    }


    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void yildizYaz(List<String>l){
        l.stream().map(t->"*"+t+"*").forEach(t-> System.out.println(t+" "));
    }

    //S3: alfabedik  gore siralayalim list olarak
    public static List<String> sira(List<String>l){
        return l.stream().sorted().collect(Collectors.toList());
    }

    //S4: tum 'l' leri silelim yazdiralim
    public static void lSil(List<String>l){
        l.stream().map(t->t.replaceAll("l","")).forEach(t-> System.out.println(t+" "));
    }

    //S5 : icinde e olanlardan yeni bir list olusturunuz
    public static List<String> eOlan(List<String>l){
        return l.stream().filter(t->t.contains("e")).collect(Collectors.toList());
    }

    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    public static void IlktekrarYaz(List<String>l){
        l.stream().map(t->t.substring(0,1)+t.substring(0,1)+t).forEach(t-> System.out.println(t));
    }

    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    public static void ilkBuyukDigerKucuk(List<String>l){
        l.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t-> System.out.println(t));
    }

    // S8: uzunlugu 4 ve 6 olanlar haric bir dizi olusturunuz
    public static List<String> uzunluk46Haric(List<String>l){
        return l.stream().filter(t->t.length()!=4 ).filter(t->t.length()!=6).collect(Collectors.toList());
    }
    public static List<String> uzunluk46Haric2(List<String>l){
        return l.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList());
    }

    //



}