package generics;

import java.util.ArrayList;
import java.util.List;

public class G03nonGenericsClass {
    public static void main(String[] args) {

        // List<String> liste=new ArrayList<>();// ==>generic list
        List liste=new ArrayList<>();//raw list

        liste.add("tipsiz liste");
        liste.add(1900);

        System.out.println("liste = " + liste);

        String name= (String) liste.get(0);
        System.out.println("name = " + name);

//        String tarih= (String) liste.get(1); classcastexception verir
//        System.out.println("tarih = " + tarih);

        int tarih= (int) liste.get(1);
        System.out.println("tarih = " + tarih);

        //row List yerine Object super class data type
        List<Object> devList=new ArrayList<>();//object super class data type list create edili
        devList.add("osman bey");
        devList.add(1999);
        devList.add(20000.5);

        String devName= (String) devList.get(0);
        Integer dTarih= (Integer) devList.get(1);

        for (Object w: devList) {//ClassCastException
            String data= (String) w;//icerisinde numeric deger olduugu icin casting yapamaz
            System.out.println("data = " + data);

        }

    }

}