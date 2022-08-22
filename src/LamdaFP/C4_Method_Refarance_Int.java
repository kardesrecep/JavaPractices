package LamdaFP;
// lambda da method kullanimi :
//ilk olarak class asi yazilir
//sonra  :: noktalar konur
//son olarak method secilir
//String class i sayesinde lenght gibi touppercase gibi methodlari kullanabiliriz
//Math clasi sayesinde de sum vb methodlar kullanabiliriz
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C4_Method_Refarance_Int {
    public static void main(String[] args) {
        List<Integer> intL= Arrays.asList(-2,-8,-5,0,2,5,6,7,15,6,8);
        tekYaz(intL);
        System.out.println("ciftCarp(intL) = " + ciftCarp(intL));
        System.out.println("kareto(intL) = " + kareto(intL));
        System.out.println("kupMAX(intL) = " + kupMAX(intL));

    }
    // S1: tekleri aralarinda bir bosluk birakarak yazdiralim
    public static void tekYaz(List<Integer>l){
        l.stream().filter(Methods::tekMi).forEach(Methods::yaz);
    }

    // S2: ciftlein carpimini bulalim
    public static Optional<Integer> ciftCarp(List<Integer>l){
        return l.stream().filter(Methods::ciftMi).reduce(Math::multiplyExact);
    }

    // S3: negatiflerin kare toplamlarini  bulalim
    public static Optional<Integer> kareto(List<Integer>l){
        return l.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(Methods::top);
    }
    public static int kareto1(List<Integer>l){
        return l.stream().filter(Methods::negatifMi).map(Methods::kareBul).reduce(0,(x,y)->x+y);
    }

    //S4: poziflerin kuplerinden max yazdiralim
    public static Optional<Integer> kupMAX(List<Integer> l){
        return l.stream().filter(Methods::pozitifMi).map(Methods::kupBul).reduce(Math::max);
    }


}