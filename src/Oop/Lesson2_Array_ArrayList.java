package Oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson2_Array_ArrayList {
    public static void main(String[] args) {

        String[] pazarSepeti = new String[5];

        String[] pazarSepeti2 = {"elma","patates","kivi","karpuz","muz"};

        List<String > listPazarSepeti = new ArrayList<>();
        listPazarSepeti.add("elma");
        listPazarSepeti.add("patates");
        listPazarSepeti.remove("patates");

        List<String> listPazarSepeti2 = Arrays.asList(pazarSepeti2);

        System.out.println(listPazarSepeti2.size());
        listPazarSepeti.add(1,"çikolata");

        listPazarSepeti.set(0,"pasta");

        System.out.println(listPazarSepeti2.get(0));

        if(!listPazarSepeti.contains("ketcap")) listPazarSepeti.add("ketcap");

    }
}

