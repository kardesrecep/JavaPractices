package LamdaFP;
// Arraylerde Stream kullanabilmek icin 2 yol vardir

// 1) Stream <Integer> isim=StreamOf(cevrilecek olan)
// 2) Arrays.stream(arr).


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C3_Array_StreamOrnekleri {
    public static void main(String[] args) {
        Integer arr [] ={1,5,-5,6,12,-8,9,3,4};
        int arr1 [] ={1,5,-5,6,12,-8,9,3,4};

        System.out.println("listele(arr) = " + listele(arr));
        System.out.println("top1(arr) = " + top1(arr));
        System.out.println("top2(arr1) = " + top2(arr1));
        ort1(arr1);


    }
    //S1: arrayin elemanlarini bir liste yazdiralim
    public static List<Integer> listele (Integer[] arr){
        return  Arrays.stream(arr).collect(Collectors.toList());
    }

    //S2: Arrayin elemanlarini toplamini bulalim
    public static int top1(Integer [] arr){
        Stream <Integer> arrl=Stream.of(arr);

        return arrl.reduce(0,(x,y)->x+y);
    }
    public static int top2(int[] arr){
        return Arrays.stream(arr).sum();
    }

    // S3: Array in elemanlarinin ortalamasini bulalim yazdir

    public static void ort1(int [] arr){
        Arrays.stream(arr).average().ifPresent(t-> System.out.println(t));
    }




}