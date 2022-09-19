package generics;

import java.util.Arrays;

public class G01overloadingMethods {
    public static void main(String[] args) {
// - Bir Generic (type özgü)  method tanımlanırken metodun return type önüne < T > (angle brackets) konulur.
// - E - Element (used extensively by the Java Collections Framework)
//   K - Key
//   N - Number
//   T - Type
//   V - Value
//   S,U,V etc. - 2nd, 3rd, 4th types kullanılan parametrik veri tipini göstermektedir
// - Method'un  parametre listesinde Generic parametre tipleri kullanılır.
// - Method parametre listeleri bir veya daha fazla olabilir ve virgülle ayrılarak yazılırlar.
// - çoook önemli TRİCKYYY : Parametre tipleri non-primitif olmalıdır.
// - JVM  derleyici, compile aşamasında generic methotu java byte kodlara çevirirken parametre tiplerini
//   kaldırır ve yerine gerçek parametreleri koyar. Bu prosese erasure denilir.

        // - Generic veri tipleri sadece non-primitif olabilir.
// - Binary operatörler (+, -,*, / ,<, >) ise non-primitif veri tiplerinde kullanılamazlar.
// - Dolayısıyla bir generic metotta karşılaştırma için ne kullanılabilir?
// - CEVAP: Comparable interface'i kullanılmalı.

        Integer[] intDizi = {1, 2, 3, 3, 6, 4, 6, 5, 6, 4, 6, 9};
        Double[] doubleDizi = {1.2, 2.6, 3.2, 3.8, 6.3};
        Character[] charDizi = {'a','s','w','r'};
        // task bu dizileri yazdir methodu ile yazdiriniz Object datatype da kullaniniz

//    diziYazdir(intDizi);
//        System.out.println("*****");
//    diziYazdir(doubleDizi);
//        System.out.println("*****");
//    diziYazdir(charDizi);
        System.out.println("*** super object classdan");
        diziYazdirObject(intDizi);
        diziYazdirObject(doubleDizi);
        diziYazdirObject(charDizi);


    }

    private static void diziYazdirObject(Object[] dizi) {//bu m,ethoda sana hersey gelebilir demis oluyorum string int double ...
        Arrays.stream(dizi).forEach(System.out::print);
    }

    //overloaded methods.......
//    private static void diziYazdir(Integer[] dizi) {
//        Arrays.stream(dizi).forEach(System.out::print);
//
//    }
//    private static void diziYazdir(Double[] dizi) {
//        Arrays.stream(dizi).forEach(System.out::print);
//
//    }
//    private static void diziYazdir(Character[] dizi) {
//        Arrays.stream(dizi).forEach(System.out::print);

}