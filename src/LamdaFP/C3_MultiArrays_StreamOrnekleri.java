package LamdaFP;
//multi arrayleri cevirirken flapMap kullaniriz yapilis sekli iki turludur
//1) lamda kullanarak
// Arrays.stream(str).flatMap(t->Arrays.stream(t))
//2 method ile
// Arrays.stream(arr).flatMap(Arrays::stream)
// BU SEKLIDE ARTIK TUM STREAM METHODLARI KULLANILABILIR

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C3_MultiArrays_StreamOrnekleri {
    public static void main(String[] args) {
        String arr[][] = {
                {"Elma", "Muz"},
                {"Portakal", "Cilek", "Limon"},
                {"Havuc","Erik"}
        };
        System.out.println("listele((arr)) = " + listele((arr)));
        doubleyaz(arr);
        System.out.println("doubleYazListeE(arr) = " + doubleYazListeE(arr));
        kbitenYildzEkle(arr);

    }
    // S1 : tum elemanlari list yapayim
    public static List<String> listele(String[][] str){
        return Arrays.stream(str).flatMap(t->Arrays.stream(t)).collect(Collectors.toList());
    }


    // S2: E ile baslayan elemanlari double (elmaelma) olarak yazdiralim yazdiralim
    public static void doubleyaz(String [][] str ){
        Arrays.stream(str).flatMap(t->Arrays.stream(t)).map(t->t+t).forEach(t-> System.out.println(t));
    }
    public static List<String > doubleYazListeE(String [][]arr){
        return Arrays.stream(arr).flatMap(t->Arrays.stream(t)).filter(t->t.startsWith("E")).collect(Collectors.toList());
    }

    //k ile bitenlerin sonuna '*' ekleyelim
    public static void kbitenYildzEkle(String[][]arr){
        Arrays.stream(arr).flatMap(t-> Arrays.stream(t)).
                filter(t->t.endsWith("k")).map(t->t+"*").forEach(t-> System.out.println(t));
    }
}