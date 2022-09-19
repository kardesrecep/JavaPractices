package generics;

public class MultipleClass {

    /*
    genelde tek bir java dosyasi icerisinde tek bir java class create edilir
    ancak her nekadar tavsiye edilmese de(non-stomic) bir java dosyasina birden fzla java class
    (non-inner)create edilebilri, bu class lardan bir tanesi access modifier public, diger class larin acm si public olamaz
     */
}

class orta {//OCA trick = ayni dosya icinde birden fazla create edilen non-inner class lari JVM compile ederken
        // sadece main class public olarak tanimlar. diger class lar dan herhangi biri de public olursa CTE veriri

}

class forvet {

}