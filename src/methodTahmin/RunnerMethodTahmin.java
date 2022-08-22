package methodTahmin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RunnerMethodTahmin extends MethodTahmin {
    public static void main(String[] args) {
        String dosyaYolu="src/methodTahmin/MethodTahminTask";//src/myAdvancedProjects/MethodTahminTask

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k =0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
       } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("~~~~~~METHOD TAHMIN ETME OYUNUNA HOSGELDIN~~~~~~");
        System.out.println("1- " + (methodlar.size()) + " arasinda bir sayi giriniz\n Lutfen Methodlarin ");
        Scanner scan = new Scanner(System.in);
        int secilenMethodIndex = scan.nextInt();
        methodGetir(methodlar, secilenMethodIndex - 1);


    }
}
