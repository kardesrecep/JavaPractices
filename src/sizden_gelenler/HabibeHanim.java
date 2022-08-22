package sizden_gelenler;

public class HabibeHanim {
    /*
    package restaurant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ManavProjesi {

     * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
     * No        Ürün         Fiyat
     * ====     =======      =========
     * 00  Domates           20.10 TL
     * 01  Patates           30.20 TL
     * 02  Biber             30.50 TL
     * 03  Soğan             20.30 TL
     * 04  Havuç             30.10 TL
     * 05  Elma               50.20 TL
     * 06  Muz                 100.90 TL
     * 07  Çilek              60.10 TL
     * 08  Kavun              40.30 TL
     * 09  Üzüm              20.70 TL
     * 10  Limon             10.50 TL
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini
     * isteyiniz.
     * 3. Adım: Kaç kg satın almak istediğini ve urun kodunu  aliniz.
     * 4. Adım: Alınacak bu ürünü sepete ekleyiniz
     * 5. Sepeti yazdırınız.
     * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
     * yönlendiriniz.
     * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitirinzi.

    static List<Double> fiyat = new ArrayList<>();
    static List<String> urunler = new ArrayList<>();
    static List<String> sepetUrunler = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyat = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static double toplam = 0;
    static String secim;
    public static void main(String[] args) {
        System.out.println("***Hosgeldiniz***");
        fiyat.add(20.10);
        fiyat.add(30.20);
        fiyat.add(30.50);
        fiyat.add(20.30);
        fiyat.add(30.10);
        fiyat.add(50.20);
        fiyat.add(100.90);
        fiyat.add(60.10);
        fiyat.add(40.30);
        fiyat.add(20.70);
        fiyat.add(10.50);
        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Sogan");
        urunler.add("Havuc");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Cilek");
        urunler.add("Kavun");
        urunler.add("Uzum");
        urunler.add("Limon");
        do {
            urunleriListele();
            System.out.println("İstediğiniz ürün Nosunu giriniz");
            int urunNo = scan.nextInt();
            System.out.println("Kaç kg istersiniz");
            double urunMiktari = scan.nextDouble();
            sepeteEkle(urunNo, urunMiktari);
            sepetiYazdir();
            System.out.println("Alısverise devam edecek misiniz?E/H");
            String bosKod = scan.nextLine();
            secim = scan.nextLine();
        } while (secim.equals("E"));
        odeme(toplam);
    }
    private static void odeme(double toplamFiyat) {
        System.out.println("Ödeme tipini seciniz");
        System.out.println("1.Coin\n2.Kredi Kartı\n3.Nakit\n4.Veresiye");
        int secim2 = scan.nextInt();
        System.out.println("toplamFiyat = " + toplamFiyat + " ödeme alındı");
    }
    private static void sepetiYazdir() {
        for (int i = 0; i < sepetUrunler.size(); i++) {
            System.out.println(sepetUrunler.get(i) + "\t " + sepetKg.get(i) + "\t" + sepetFiyat.get(i));
        }
        System.out.println("toplam = " + toplam);
    }
    private static void sepeteEkle(int urunNo, double urunMiktari) {
        sepetUrunler.add(urunler.get(urunNo));
        sepetKg.add(urunMiktari);
        sepetFiyat.add(urunMiktari * fiyat.get(urunNo));
        toplam += urunMiktari * fiyat.get(urunNo);
        if (toplam > 1000) {
            System.out.println("sepetinizdeki urunler 1000 t y astı");
        }
    }
    private static void urunleriListele() {
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(i + "\t" + urunler.get(i) + "\t" + fiyat.get(i));
        }
    }
}

     */
}
