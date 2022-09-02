package Ted_Practices;

public class Clock1_Solution {
  /*
Kullanıcıdan 2 sayı girmesini isteyeceğiz, girilen bu değerlerden
biri saati diğeri de dakikayı temsil edecek. Bize akrep ile yelkovan
arasındaki küçük açıyı hesaplayıp değeri açısal olarak döndüren metodu yazınız
​
Örnek :
​
input : hour : 12,  minutes : 30
Output: 165
​
 */


  public class Solution {

    public static void main(String[] args) {

      System.out.println(angleClock(12, 30));

    }

    public static double angleClock(int hour, int minutes) {
      double ek = (double) minutes / 12;
      double hourAngle = ((hour % 12) * 30) + (ek * 6);
      double newMinute = (double) minutes / 5;
      double minuteAngle = newMinute * 30;
      double angle = Math.abs(hourAngle - minuteAngle);

      if (angle > 180) return (360 - angle);
      else return angle;

    }

  }
}