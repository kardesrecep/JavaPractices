package day10_practice.okul_proje;

public class OgretmenBilgileri {
/* OgretmenBilgileri  Class’i olusturun bu Class’da bir Ogretmen icin
    gerekli
      bilgileri girebilecegim Instance Variable’lar olusturun
     * ve main method icinde bu variable’lara deger atayin
     * ve yazdirin
     *Not:Ornegin; 1 class, class icinde 1 tane static ve 1 tane de instance
     variable var.
	 Bu class'dan 10 object olusturulursa 1 tane static variable ve 10 tane
	 instance variable uretilmis demektir.
     */

    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyisim,
                             int yas, String brans,
                             String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}
