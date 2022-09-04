package Oop;

public class Runner {
    public static void main(String[] args) {
        Civciv civciv1 = new Civciv();
        Animal animal = new Civciv();
        Ordek ordek1 = new Ordek();

        hayvanSesCikar(civciv1);
        hayvanSesCikar(ordek1);
    }

    public static void hayvanSesCikar(Animal bos){
        bos.sesiCikar();
    }

}