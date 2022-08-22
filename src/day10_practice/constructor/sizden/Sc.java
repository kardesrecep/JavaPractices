package day10_practice.constructor.sizden;

public class Sc {
    public class BookClass {//Suleyman Cevik bey den

        String adi, yazari;
        int yayinYili;

        // class da body icinde sag click-> Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
        // 2  ve 3 parametreli constructor olusturun
        // main method bu class da olsun
        // main method icinde obj leri create edin iki constructor'u da kullanin
        // yazdir isimli method create edin ve bu method'la olusturdugunuz obje'leri yazdirin


        public BookClass(String adi, String yazari, int yayinYili) {
            this.adi = adi;
            this.yazari = yazari;
            this.yayinYili = yayinYili;
        }

        public BookClass(String adi, String yazari) {
            this.adi = adi;
            this.yazari = yazari;
        }

        public BookClass() {
        }

        public void yazdir(){

            System.out.println("yazdir method'u calisti");

        }

        /*@Override
        public String toString() {
            return "BookClass"+
                    "\nkitabin adi    : " + adi+
                    "\nkitabin yazari : " + yazari +
                    "\nyayinYili      : " +yayinYili;
        }*/
        /*
        public static void main(String[] args) {

            BookClass obje1 = new BookClass("Mor Salkimli Ev","Halide Edip Adivar",1963);
            System.out.println(" Kitap1 \n"+"Kitab adi : "+obje1.adi+"\nYazar : "+obje1.yazari+"\nYili : "+obje1.yayinYili);

            BookClass obje2 = new BookClass("Serguzest","Samipasazade Sezai");
            System.out.println(" Kitap2 \n"+"Kitab adi : "+obje2.adi+"\nYazar : "+obje2.yazari);

            obje1.yazdir();
            obje2.yazdir();

        }*/

    }
}
