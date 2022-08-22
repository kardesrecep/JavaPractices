package LamdaFP;
public class Ogretmen {
    private String ogretmenADI;
    private String ogretmenSoyadi;
    private String bransi;
    private  int yas;
    private int calismaSuresi;

    public Ogretmen(String ogretmenADI, String ogretmenSoyadi, String bransi, int yas, int calismaSuresi) {
        this.ogretmenADI = ogretmenADI;
        this.ogretmenSoyadi = ogretmenSoyadi;
        this.bransi = bransi;
        this.yas = yas;
        this.calismaSuresi = calismaSuresi;
    }

    public String getOgretmenADI() {
        return ogretmenADI;
    }

    public void setOgretmenADI(String ogretmenADI) {
        this.ogretmenADI = ogretmenADI;
    }

    public String getOgretmenSoyAdi() {
        return ogretmenSoyadi;
    }

    public void setOgretmenSoyAdi(String ogretmenSoyAdi) {
        this.ogretmenSoyadi = ogretmenSoyAdi;
    }

    public String getBransi() {
        return bransi;
    }

    public void setBransi(String bransi) {
        this.bransi = bransi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getCalismaSuresi() {
        return calismaSuresi;
    }

    public void setCalismaSuresi(int calismaSuresi) {
        this.calismaSuresi = calismaSuresi;

    }

    @Override
    public String toString() {
        return  ogretmenADI + "\t" + ogretmenSoyadi + "\t" + bransi + "\t" + yas + "\t" + calismaSuresi ;

    }


}