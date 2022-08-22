package LamdaFP;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C1_IntList_StreamOrnekleri {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(-8);
        list.add(-2);
        list.add(-12);
        list.add(0);
        list.add(1);
        list.add(12);
        list.add(5);
        list.add(6);
        list.add(9);
        list.add(15);
        list.add(8);
//////////////////////////////////////////////
        yaz(list);
        neg(list);
        System.out.println("poz elemanlar) = " + pozList(list));
        System.out.println("kare(list) = " + kare(list));
        System.out.println("kareteksiz(list) = " + kareteksiz(list));
        sira1(list);
        sira2(list);
        System.out.println("sonBas5(list) = " + sonBas5(list));
        System.out.println("sonBas5degil(list) = " + sonBas5degil(list));
        System.out.println("top(list) = " + top(list));
        System.out.println("kkarelist(list) = " + kkarelist(list));
        System.out.println("besVarMi(list) = " + besdenBuyukVarMi(list));
        System.out.println("sifirdanKucuk(list) = " + sifirdanKucuk(list));
        System.out.println("yuzeesit(list) = " + yuzeesit(list));
        System.out.println("sifiraesit(list) = " + sifiraesit(list));
        System.out.println("ilkBesTop(list) = " + ilkBesTop(list));
        System.out.println("sonBes(list) = " + sonBes(list));


    }

    // S1:listi aralarinda bosluk birakarak yazdiriniz //

    public static void yaz(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));
    }
//  ForEach:
//         Stream içindeki veriyi tek tek tüketmekiçin oluşturulmuş bir yapıdır.
//       **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
//        artık kullanılamayacağı anlamına gelir.
//=================
    //S2: sadece negatif olanlari yazdir

    public static void neg(List<Integer> l) {
        l.stream().filter(t -> t < 0).forEach(t -> System.out.println(t + " "));
    }
    // Filter
    //    Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    //    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    //    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    //    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır

    //S3: pozitif olanlardan yeni bir liste olustur
    public static List<Integer> pozList(List<Integer> l) {
        return l.stream().filter(t -> t > 0).collect(Collectors.toList());
    }
    /*
    Collect
    Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
    veri yapısına dönüştürmek için kullanılır.
     */


    // S4: list in elemanlarin karelerinden yeni bir list olusturalim
    public static List<Integer> kare(List<Integer> l) {
        return l.stream().map(t -> t * t).collect(Collectors.toList());
    }

     /*
    Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
    ve başka elemanlara dönüştürmemize imkan sağlayan
     */


    //S5 : list in elemanlarin karelerinden tekrarsiz yeni bir list olusturalim
    public static List<Integer> kareteksiz(List<Integer> l) {
        return l.stream().map(t -> t * t).distinct().collect(Collectors.toList());
    }

     /*
    Distinct
Stream içerisinde bulunan ve tekrar eden elemanlar varsa
 bunları distinct metodu ile çıkartabilir ve
elimizde tekrar etmeyen birbirinden farklı
elemanlar barından bir veri setimiz kalır
     */

    //S6: listin elemanlarini kucukten buyuge siralayalim
    public static void sira1(List<Integer> l) {
        l.stream().sorted().forEach(t -> System.out.print(t + " "));
    }
/*
    Sorted
    Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
            2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
    İkinci formatı ise Comparator arayüzünden türediği için
    bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.
            */

    //S7: listin elemanlarini buyukten kucuge siralayalim

    public static void sira2(List<Integer> l) {
        l.stream().sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }

    // S8: list pozitif elemanlari icn kuplerini bulup birler basamagi
    // 5 olanlardan yeni bir list olusturalim
    public static List<Integer> sonBas5(List<Integer> l) {
        return l.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 == 5).collect(Collectors.toList());
    }

    //S9: list pozitif elemanlari icn kuplerini bulup birler basamagi
    // 5 olmayanlardan yeni bir list olusturalim
    public static List<Integer> sonBas5degil(List<Integer> l) {
        return l.stream().filter(t -> t > 0).map(t -> t * t * t).filter(t -> t % 10 != 5).collect(Collectors.toList());
    }


    // S10 :list elemanlarini toplamini bulalim
    public static int top(List<Integer> l) {
        return l.stream().reduce(0, (x, y) -> x + y);
    }
     /*
    reduce : indirgeme demektir.
    kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
    bir sonraki elemanla işlemle tutulur
     */

    // S11 : peek ornegi cozelim
    // negatiplerin karelerinden list olusturalim
    public static List<Integer> kkarelist(List<Integer> l) {
        return l.stream().filter(t -> t < 0).
                peek(t -> System.out.print("negatifler: " + t)).
                map(t -> t * t).peek(t -> System.out.println(" kareleri: " + t)).collect(Collectors.toList());
    }
     /*
    peek () 'in Javadoc sayfası şöyle diyor: " Bu yöntem, temelde, öğeleri bir
     ardışık düzen içinde belirli bir noktadan geçerken görmek istediğiniz
     yerde hata ayıklamayı desteklemek için vardır .
     */

    // S12 : listeden 5 den buyuk  sayi var mi
    public static boolean besdenBuyukVarMi(List<Integer> l) {
        return l.stream().anyMatch(t -> t > 5);
    }

     /*
     AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
    herhangi bir elemanla eşleşme durumunda true dönecektir.
     */


    // S13 : listin tum elemanlari sifirdan kucukmu
    public static boolean sifirdanKucuk(List<Integer> l) {
        return l.stream().allMatch(t -> t < 0);
    }

    /*
    AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
 bu şarta uyması durumunda true dönecektir.
     */


    // S14: listin 100 e esit elemani yok
    public static boolean yuzeesit(List<Integer> l) {
        return l.stream().noneMatch(t -> t == 100);
    }

      /*
NoneMatch: Şarta göre Stream içindeki hiç bir
 elemanın şartı sağlamaması durumunda true dönecektir.
     */

    // S15: listin sifira esit elemani yok
    public static boolean sifiraesit(List<Integer> l) {
        return l.stream().noneMatch(t -> t == 0);
    }


    // S16 : limit
    // listenin ilk 5 elemanini topla
    public static int ilkBesTop(List<Integer> list) {
        return list.stream().limit(5).reduce(0, (x, y) -> x + y);
    }
     /*
    Limit
Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
 sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
 Stream içerisinde dönen çok sayıda veri var
ancak sen bize şu kadarını göster diyoruz.
     */

    //S17: skip
    //dizinin son bes elemaninin  listele
    public static List<Integer> sonBes(List<Integer> l) {
        long n = l.size() - 5;

        return l.stream().skip(n).collect(Collectors.toList());
    }
/*
        Skip () bize eleman atlamayi saglar ara islemdir
         veriable olarak long alir ornegin skip(3)ilk 3 elemani atlar
 */

}