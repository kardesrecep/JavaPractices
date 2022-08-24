package LamdaPractices;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
dosya eklemek icin 2 yol var
1) Files.lines(Path.of("path")  buradan stream e eklemek icin
Stream <String> satir=Files.lines(Path.of(".........."));
bu bize tekrardan stream tanimlamadan kullanmayi saglar
2) //Files.lines(Paths.get("..........")).  kullanilir
==========================================================
intellj dosya eklemek icin src => new=>file=>text diyoruz ve istedigimiz metni buraya kopyaliyoruz
bu dosyanin path almak icin dosyanin uzerine gelip sag tikliyoruz(burada dosya C7_TextFile)
sonrasinda copy path seciyoruz bundan sonra iki secenek var
1) absolute path seciyoruz yada
2) path from content root seciyoruz
her ikisinde de path kopyalamis oluyoruz
cevirirken EXCEPTION OLUSMASIN DIYE => throws IOException <= EKLEMELIYIZ
buda lines altinda kirmizi uyari veriyor uzerine tiklayinca kendiliginden oluyor
*/
public class Lamda02_DosyaOkuma {
    // src/LamdaPractices/siirler.txt
    public static void main(String[] args) throws IOException {
        //src/LamdaPractices/siirler.txt"
        System.out.println("\nTASK 01 --> siirler.txt dosyasini okuyunuz -->  ");

        Path muti = Path.of("src/LamdaPractices/siirler.txt");//siirler dosyai muti objsine atandi

        Stream<String> akis = Files.lines(muti);//muti objsi akis objseine ataanrak stream  classinda akisa alindi
        Files.lines(Path.of("src/LamdaPractices/siirler.txt")).
                forEach(Methods::yazdir);

        akis.map(String::toUpperCase).forEach(Methods::yazdir);

        //2.yol
        Files.lines(Path.of("src/LamdaPractices/siirler.txt")).forEach(Methods::yazdir);


        System.out.println("\nTASK 1  --> siirler.txt dosyasindaki ilk satiri buyuk harflerle yazdirin  -->  ");
        Files.lines(muti).map(String::toUpperCase).limit(1).forEach(Methods::yazdir);
        System.out.println(Files.lines(muti).map(String::toLowerCase).findFirst().get());


        System.out.println("\nTASK 2 --> siirler.txt dosyasinda hatir kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
        System.out.println(Files.lines(muti).map(String::toLowerCase).filter(t -> t.contains("hatir")).count());
        //2.yol
        List<String> list = Files.lines(muti).map(String::toLowerCase).filter(t->t.contains("hatir")).collect(Collectors.toList());
        System.out.println(list.size());

        System.out.println("\nTASK 3  --> siirler.txt dosyasindaki ayni kelimeleri cikartarak  yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).map(t -> t.split(" ")).flatMap(Arrays::stream).distinct().
                collect(Collectors.toList()));
        //2.yol
        System.out.println(Files.lines(muti).map(t -> t.split(" ")).flatMap(Arrays::stream).
                collect(Collectors.toSet()));



        System.out.println("\nTASK 4 --> siirler.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
        Files.lines(muti).map(String::toLowerCase).map(t->t.split(" ")).flatMap(Arrays::stream).
                sorted().forEach(Methods::yazdir);
        //2.yol
        Files.lines(muti).map(t->t.toLowerCase().split(" ")).flatMap(Arrays::stream).
                sorted().forEach(Methods::yazdir);


        System.out.println("\nTASK 5 --> siirler.txt dosyasinda **gonlum** kelimesinin kac kere gectigini  yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).map(t -> t.toLowerCase().
                split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("gonlum")).count());


        System.out.println("\nTASK 6 --> siirler.txt dosyasinda a harfi gecen kelimelerin sayisini " +
                "ekrana yazdiran programi yazdiriniz. -->  ");
       // System.out.println(Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
               // flatMap(Arrays::stream).filter(t -> t.contains("a")).count());
        System.out.println(Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
                flatMap(Arrays::stream).filter(t -> t.contains("a")).count());

        System.out.println("\nTASK 7 --> siirler.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
        System.out.println(Files.lines(muti).map(t -> t.toLowerCase().split(" ")).
                        flatMap(Arrays::stream).filter(t -> t.contains("a")).collect(Collectors.toList()));

        System.out.println("\nTASK 8 --> siirler.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
        System.out.println("\nTASK 8 --> siirler.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");

        System.out.println(Files.lines(muti).
                map(t -> t.toLowerCase().
                        split("")).
                flatMap(Arrays::stream).
                distinct().
                count());
        //2.yol
        System.out.println(Files.lines(muti).map(t -> t.replaceAll("\\W", "").
                replaceAll("\\d", "").split("")
        ).flatMap(Arrays::stream).distinct().count());

        System.out.println("\nTASK 9 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
        System.out.println("\nTASK 10 --> siirler.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");
    }
}