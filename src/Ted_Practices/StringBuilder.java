package Ted_Practices;

public class StringBuilder {
    public static void main(String[] args) {
        String name = "temel oluyormu"; // O(n) -- > O(n/2)
        reverse(name);

    }

    public static void reverse(String name) {
        int count = 0;
        String[] str = name.split("") ;
/*        //1.yol ( daha yavas )
        StringBuilder str2 = new StringBuilder();
        for(int i=str.length-1; i >=0 ; i-- ) {
            str2.append(str[i]);
            count++;
        }*/


        // 2.yol ( daha hızlı)

 /*       int l =0;
        int r = str.length-1;
        for(l=0;l<r;l++,r--) {
           // swap işlemi yapıyoruz
            String temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            count++;
        }*/


        // 3.yol : Ahmet bey
        for(int i = 0; i<str.length/2; i++){
            // swap islemi
            String temp=str[i];
            str[i] =  str[str.length-i-1];
            str[str.length-i-1] = temp;
            count++;
        }

        // yeni oluşan ifadeyi ekrana basıyoruz
        // TODO 2. ve 3. yolda comment e alınacak
        for(String ch: str)
            System.out.print(ch);
        //System.out.println(str2);  // TODO 2. ve 3. yolda comment e alınacak
        System.out.println();
        System.out.println("cümledeki harf sayısı : " + name.length());
        System.out.println("Toplam yapılan işlem sayısı : " + count);


    }

}