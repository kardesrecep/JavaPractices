package day13_interviewQuestions;

public class Q01_ReverseString {

   /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin odev olsun Q01 deki gibi
		recursive method ile yapiniuz
    */
   public static void main(String[] args) {
       //1.Yol: StringBuilder () kullanarak
       String input = "All is well";

       StringBuilder str=new StringBuilder();

       str.append(input);//StringBuilder methodudur ekleme yapar
       System.out.println("str = " + str);

       String tersInput=str.reverse().toString();//reverse ile tersine cevrildi toString ile Stringe cevrildi
       System.out.println("tersInput = " + tersInput);

       System.out.println("2. yol");

       int sonHarf=input.length()-1;

       for (int i = sonHarf ; i >=0 ; i--) {
           System.out.print(input.charAt(i));//her bir karakteri alip yazdirdik yanyana

       }

   }



}
