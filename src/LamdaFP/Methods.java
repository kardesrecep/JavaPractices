package LamdaFP;
import java.util.stream.IntStream;

public class Methods {
    public static void yazSayi(int n){
        System.out.print(n+" ");
    }
    ///////////////////////////////////////////
    public static void yazYazi(String s){
        System.out.print(s+" ");
    }
    ////////////////////////////////
    public static boolean tekMi(int n){
        return n%2!=0;
    }
    //////////////////////////////////////////
    public static boolean ciftMi(int n){
        return n%2==0;
    }
    //////////////////////////////////////////
    public static boolean negatifMi(int n){
        return n<0;
    }
    //////////////////////////////////////////
    public static boolean pozitifMi(int n){
        return n>0;
    }
    //////////////////////////////////////////
    public static int kareBul(int n){
        return n*n;
    }
    public static int kupBul(int n){
        return n*n*n;
    }
    //////////////////////////////////////////
    public static boolean EbasliyorMu(String S){
        return S.startsWith("E");
    }


    public static void yazIntstream(IntStream S) {
        System.out.println(S+ " ");
    }
    public static int top (int a,int b){
        return a+b;
    }
    public static void yazPrintF (Object yazdir){
        System.out.println(yazdir+" ");

        }

    }

