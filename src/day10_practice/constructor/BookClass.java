package day10_practice.constructor;

public class BookClass {

    String adi, yazari;
    int yayinYili;

    // class da body icinde sag click->
    // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
    //2  ve 3 pm li const olusturun
    //main method bu class da olsun
    //main method icinde obj leri create edin iki const tu da kullanin
    //yazdir isimli method create edin
    //ve bu methodlar olusturdugunuz obj leri yazdirin

    public BookClass(String adi, String yazari, int yayinYili) {
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) {
        this.adi = adi;
        this.yazari = yazari;
    }

    public void display(){
        System.out.println("Kitap:" +adi + " Yazar :" +yazari + " yayin yili:" +yayinYili);
    }

    public static void main(String[] args) {
        BookClass kitap1 = new BookClass("Harry Potter and The Goblet of Fire","JK Rowling",2000);
        BookClass kitap2 = new BookClass("Crime and Punishment","Dostoyevsky");
        kitap1.display();
        kitap2.display();
    }




}