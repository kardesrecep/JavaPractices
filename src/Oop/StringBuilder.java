package Oop;

public class StringBuilder {
    public static void main(String[] args) {
        String name = "temel oluyormu"; // O(n) -- > O(n/2)
        reverse(name);

    }

    public static void reverse(String name) {

       /* 1.yol ( daha yavas )
	    String str2 = "";
        String[] str = name.split("") ;
        for(int i=str.length-1; i >=0 ; i-- ) {
            str2 = str2 + str[i];
        }
        */

        // 2.yol ( daha hızlı)
        String[] str = name.split("") ;
        //String tmp = "";
        int l =0;
        int r = str.length-1;
        int count=0;
        for(l=0;l<r;l++,r--) {
            // swap işlemi yapıyoruz
            String t = str[l];
            str[l] = str[r];
            str[r] = t;


        }
        // yeni oluşan ifadeyi ekrana basıyoruz
        for(String ch: str)
            System.out.print(ch);


    }

}