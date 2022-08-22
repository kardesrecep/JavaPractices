package LamdaFP;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.Arrays;
import java.util.stream.Stream;

// dosya eklemek icin 2 yol var
//1) Files.lines(Path.of("path")
//buradan stream e eklemek icin
//Stream <String> satir=Files.lines(Path.of("src/day07_file/javanin avantajlari"));
// bu bize tekrardan stream tanimlamadan kullanmayi saglar
//2) //Files.lines(Paths.get("src/day07_file/javanin avantajlari")).
// kullanilir
//=======================================
//intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
// bu dosyanin path almak icin dosyanin uzerine geli sag tikliyoruz(burada dosya java_avantajlari)
//sonrasinda copypath seciyoruz bundan sonra iki secenek var
// 1) absolute path seciyoruz yada
//2)path from content root seciyoruz
// her ikisindede path kopyalamis oluyoruz

// cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
//buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor
public class C8_Dosya_Okuma {
    public static void main(String[] args) throws IOException {
        //not her seferinde dosyayi tanimlamamk icin islemleri yorumaaliyorum
        //eger yoruma almazsam hata verir cunku piplene islemi gerceklesmis olur

        Stream<String> satir=Files.lines(Path.of("src/java_avantajlari"));
        //NOT PATH cift tirnak icine alinmali
        //artik stream donustu methodlari kullanabiliriz


        // S1: Yazdiralim

        //(nottan dolayi yoruma aldim)  satir.forEach(t-> System.out.println(t));

        //S2: tum harflari buyuk harf ile yazdiralim
        // satir.map(String::toUpperCase).forEach(System.out::println);

        // S3: son satiri buyuk harfle yazdiralim
        //   satir.skip(4).map(String::toUpperCase).forEach(System.out::println);


        //S4: 2.ve 3. satirlari yazdiralim
        // satir.skip(1).limit(2).forEach(System.out::println);
//burada limit(2) dememin sebebi atladikan sonra iki satiri yazmasini istedigim icin

        //S5: kac tane "bir" vardir
        // System.out.println("satir.filter(t->t.contains(\"bir\")).count() =" +
        //    " " + satir.filter(t -> t.contains("bir")).count());


        //S6: tum kelimelerin ilk harfini buyuk digerlri kucuk olsun
        //     satir.map(t->t.split(" ")).flatMap(Arrays::stream).
        //           map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t-> System.out.println(t));

        //not  satir.map(t->t.split(" ")).flatMap(Arrays::stream). bu islemim benimkelimelere ulasmami sagliyor

        // S7:  metinde kactane "a"  vardir
        System.out.println("satir.filter(t->t.contains(\"a\")).count() = "
                + satir.map(t->t.split(" ")).flatMap(Arrays::stream).
                filter(t -> t.contains("a")).count());
    }
}