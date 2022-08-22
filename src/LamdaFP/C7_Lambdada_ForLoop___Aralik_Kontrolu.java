package LamdaFP;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class C7_Lambdada_ForLoop___Aralik_Kontrolu {
    public static void main(String[] args) {
        int a=1;
        int b=5;
//ilk30(a);
        //System.out.println();
//ilk30dahil(a);
        //   System.out.println("top(a,b) = " + top(a, b));
//ort(30,40);
        System.out.println("sekizeBolunen(325,468) = " + sekizeBolunen(325, 468));
        sekizeBolunenyaz(325,468);
        System.out.println("sekizeBolunentop(325,468) = " + sekizeBolunentop(325, 468));
        System.out.println("carpim(7,55) = " + carpim(7, 15));
        ilk10(10);
        yedininKati(10);
        System.out.println("yediTop(20) = " + yediTop(20));
    }
    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1,2,.... seklinde siralayalim (for loopsuz)
    public static void ilk30(int a){
        IntStream.range(1,a).sorted().forEach(t-> System.out.print(t+" ,"));
    }


    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1,2,.... seklinde siralayalim (for loopsuz)
    public static void  ilk30dahil(int a){
        IntStream.rangeClosed(1,a).sorted().forEach(t-> System.out.print(t+","));
    }

    //S3 Istenen iki deger arasindaki sayilari toplayalim
    public  static int top(int bas,int bits){
        return IntStream.rangeClosed(bas,bits).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin ortalamasini bulalim
    public static void ort(int a, int b){
        IntStream.rangeClosed(a,b).average().ifPresent(t-> System.out.println(t));
    }
    public static void ort2(int a, int b){
        System.out.println("IntStream.rangeClosed(a,b).average() = " + IntStream.rangeClosed(a, b).average());
    }

    //S5: 325 ile 468 arasinda 8 bolunen kac sayi vardir
    public static long sekizeBolunen(int a,int b){
        return IntStream.rangeClosed(a,b).filter(t->t%8==0).count();
    }
    //count
    //long count()
    //dizideki istenilen elemanlarin sayisini doner terminal islemdir long veriable alir

    //S6: 325 ile 468 arasinda 8 bolunen sayilari yazdiralim

    public static void sekizeBolunenyaz(int a,int b){
        IntStream.rangeClosed(a,b).filter(t->t%8==0).forEach(t-> System.out.print(t+" "));
    }

    // S7:325 ile 468 arasinda 8 bolunen sayilarin toplamini bulalim
    public static int sekizeBolunentop(int a,int b){
        return   IntStream.rangeClosed(a,b).filter(t->t%8==0).sum();
    }


    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim
    public static double carpim(int a, int b){
        return IntStream.rangeClosed(a,b).filter(Methods::tekMi).reduce(1,(x,y)->x*y);
    }


    //S9: poz tek sayilarin ilk 10 elemanin yazdiralim
    public static void ilk10(int a){
        IntStream.iterate(1,t->t+2).limit(10).filter(Methods::tekMi).forEach(Methods::yaz);
    }


    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
    public static void yedininKati(int son){
        IntStream.iterate(21,t->t+7).limit(son).forEach(t-> System.out.println(t+" "));
    }


    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
    public static int yediTop(int son){
        return IntStream.iterate(21,t->t+7).limit(20).sum();
    }

}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belilioruz