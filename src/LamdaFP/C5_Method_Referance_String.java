package LamdaFP;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        // buyukYaz(l);
        //sirala(l);
        eIleBas(l);


    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
    public static void buyukYaz(List<String> l){
        l.stream().map(String::toUpperCase).forEach(Methods::yaz1);

    }

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
    public static void sirala(List<String>l){
        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }


    //S3: E ILE Baslayanlari yazdiralim
    public static void eIleBas(List<String>l){
        l.stream().filter(Methods::EbasliyorMu).forEach(System.out::print);
    }

}