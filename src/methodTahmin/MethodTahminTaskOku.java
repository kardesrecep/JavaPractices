package methodTahmin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MethodTahminTaskOku {
    public static void main(String[] args) {


        String dosyaYolu="src/methodTahmin/MethodTahminTask";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            int k =0;
            while((k=fis.read())!=-1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
