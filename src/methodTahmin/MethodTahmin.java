package methodTahmin;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;

public class MethodTahmin {


    protected static List<String> methodlar = new ArrayList<>(Arrays.asList("add()", "random()", "get()", "remove()",
            "sort()", "set()", "subList()", "isEmpty()", "valueOf()", "parseOf()", "subString()", "setCharAt()",
            "replaceAll()", "contains()", "equalsIgnoreCase()"));
    /*

     */
    static Scanner scan = new Scanner(System.in);



    protected static void methodGetir(List<String> methodlar, int index) {

        StringBuilder tahminEdilecekMethod = new StringBuilder(methodlar.get(index).replaceAll("\\S", "*"));//MethodTahmin


        //tum harf karakterleri * ile değiştir
        System.out.println(tahminEdilecekMethod);//*****
        System.out.println(methodlar.get(index).length() + " harfli method seçtiniz. Methodu tahmin etmek için " +
                2 * methodlar.get(index).length() + " hakkınız var .");

        char harf = ' ';
        int tahminSayısı = 0;
        int dogruTahminSayısı = 0;
        String str = "";
        int toplam = 0;
        do {
            System.out.print("yanlıs tahmin sayisi: " + (tahminSayısı - dogruTahminSayısı) + "/" + 2 * methodlar.get(index).length() +
                    "\ntahmin ettiginiz harfi giriniz : ");//yanlıs girilen tahmin sayisini print edildi

            harf = scan.next().charAt(0);//method için tahmin edilen harf alındı
            str += harf;//harf str'ye atandı
            //bu body girilen her yanlis deger icin tahmin sayisini 1 artirir

            //burasi hocam
            if (tahminEdilecekMethod.toString().contains("*")) { //tahminEdilecekMethod'da kullanıcıdan alınan harf yoksa tahmin sayısı artılıdı
                tahminSayısı++;//Umut beyin bug cozumu:) * girdiginde yanlis tahmin sayisi artacak



                if (!tahminEdilecekMethod.toString().contains(str)) {//tahmin edilecek (***)method da yoksa yanlis tahmin ettin
                    //tahminSayısı++;//
                }
            }

            for (int i = 0; i < tahminEdilecekMethod.length(); i++) {
                if (methodlar.get(index).charAt(i) == harf) { //tahmin edilen harf listtdeki methodda varsa
                    if (!tahminEdilecekMethod.toString().contains(methodlar.get(index).substring(i, i + 1))) {
                        //tahmin edien harf listteki method da var dogru tahmin ettin ama tahmin edilecek
                        // (***)method da yoksa dogru tahmin bir kez arttir
                        //yani ayni haftten iki tane varsa bu if blogu dogru tahmini iki kez arttirmiyor
                        dogruTahminSayısı++;

                    }
                    tahminEdilecekMethod.setCharAt(i, harf);//dogru tahmin edilen harf tahmineilcekmethod indexe göre atandı
                }
            }
            // * lardan acilmis hali methodlar list indeki ile esit ise bu body calisir. degil ise 73 ncu satira ordan basa
            if (tahminEdilecekMethod.toString().equalsIgnoreCase(methodlar.get(index))) {
                System.out.println(" tebrikler kaazandin ");
                System.out.println("tahmin ettigin method : " + tahminEdilecekMethod);
                break;

            }
            System.out.println(tahminEdilecekMethod);//her seferinde gelisen abc** li kismi bize yazdirir
        } while ((tahminSayısı - dogruTahminSayısı) != 2 * methodlar.get(index).length());//yanlış sayısı verilen hakka ulaşana
        // kadar do body calışır

        if ((tahminSayısı - dogruTahminSayısı) == 2 * methodlar.get(index).length()) {
            System.out.println("yanlis tahmin sayisi : " + (tahminSayısı - dogruTahminSayısı));
            System.out.println(" agam GAME OVER yine bekleriz... tahmin edemedigin method : " + methodlar.get(index));

        }
    }

}