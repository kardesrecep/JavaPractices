package LamdaPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lamda01 {
    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */
    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tulay", "zekeriya", "hasan", "ismail",
            "osman", "fatih","ersin","mevlit"));
    static List<Integer> numbers=new ArrayList<>(Arrays.asList(25,65,-56,55,98,-89,65,55,21,54,9,35,35,34));

    public static void aHarfliOlanlariSilen(ArrayList<String> isimler){
        //1.yol
     //   System.out.println(isimler.stream().map(m -> m.toLowerCase()).
     //           filter(m -> !m.contains("a")).collect(Collectors.toList()));
        //2.yol

        isimler.removeIf(t->t.contains("a")||t.contains("A"));
        System.out.println(names);

        //2- En buyuk elemani bulun
    }
    public static void enBuyukElemaniBul (List<Integer>numbers){
     Optional <Integer>maxSayi= numbers.stream().reduce(Math::max);
        System.out.println(maxSayi);



    }
    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...
//1.yol
    public static void tumElemanlariYazdir(List<Integer>sayilar){
     Integer sonuc=   numbers.stream().reduce(Math::addExact).get();

    }
    //2.yol
    public static void tumElemanlariYazdir2(List<Integer>sayilar){
        System.out.println("numbers.stream().reduce(0,(a,b)->a+b) = " +
                numbers.stream().reduce(0, (a, b) -> a + b));

        System.out.println("sayilar.stream().reduce(Integer::sum).get() = " +
                sayilar.stream().reduce(Integer::sum).get());
    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftElemanlariCarp(List<Integer>sayilar){
        System.out.println("sayilar.stream().filter(t->t%2==0).reduce(1,(a,b)->a*b) = " +
                sayilar.stream().filter(t -> t % 2 == 0).reduce(1, (t, u) -> t * u));

    }
    public static void ciftElemanlariCarp2(List<Integer>sayilar){
        //2.yol
        System.out.println("sayilar.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact) = " +
                sayilar.stream().filter(t -> t % 2 == 0).reduce(Math::multiplyExact));

    }
    public static void ciftElemanlariCarp3(List<Integer>sayilar){

        System.out.println("sayilar.stream().filter(Methods::ciftElemaniBul).reduce(Math::multiplyExact) = " +
                sayilar.stream().filter(Methods::ciftElemaniBul).reduce(Math::multiplyExact).get());
    }

}
