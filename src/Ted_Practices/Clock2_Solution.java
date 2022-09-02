package Ted_Practices;

import java.util.Scanner;

public class Clock2_Solution {  /*
        Kullanicidan 2 sayi girmesini isteyecegiz, girilen bu degerlerden biri saati digeri de dakikayi temsil edecek.
        bize akrep ile yelkovan arasindaki kucuk aciyi hesaplayip degeri acisal olarak donduren metodu yaziniz
        Ornek :
        input : hour : 12,  minutes : 30
        Output: 165
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saatin Akrep ve Yelkovan arasindaki farkini bulmak için saat ve dakikayi ayrı ayrı giriniz!");

        System.out.print("Lutfen Saati Giriniz : ");
        double hour = scan.nextDouble();

        System.out.print("Lutfen Dakikayi Giriniz : ");
        double minutes = scan.nextDouble();

        System.out.println("Akrep ile Yelkovan arasindaki aci farki : " + aciAkrepYelkovanFarki(hour, minutes));
    }

    public static double aciAkrepYelkovanFarki(double hour, double minutes) {
        double aci = 0;
        double dakikaAcisi = 0;
        double saatAcisi = 0;
        if (hour > 11) hour -= 12;
        dakikaAcisi = 6 * minutes;
        saatAcisi = hour * 30 + 0.5 * minutes;
        aci = dakikaAcisi - saatAcisi;
        if (aci < 0) aci *= -1;
        if (aci > 180) aci = 360 - aci;
        return aci;
    }
}












        }
