package Ted_Practices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Time {

    public static void main(String[] args) {
        List<Integer> arrayList1 = new ArrayList<>();
        List<Integer> linkedList1 = new LinkedList<>();
        Random r = new Random();
        long endTime;
        long startTime;
        long estimatedTime;
        double second;
        int a = 0;

        for(int i=0 ; i<100000 ; i++){
            a= r.nextInt(100) ;
            arrayList1.add(a);
            linkedList1.add(a);
        }
        arrayList1.add(200);
        linkedList1.add(200);

        startTime = System.currentTimeMillis();
        for (int e: arrayList1) {
            if(e==200){
                endTime=System.currentTimeMillis();
                estimatedTime = endTime-startTime;
                second = (double) estimatedTime/1000;
                System.out.println("ArrayList de 200 sayısını " + second + " saniyede buldu");
            }
        }

        startTime = System.currentTimeMillis();
        for (int e: linkedList1) {
            if(e==200){
                endTime=System.currentTimeMillis();
                estimatedTime = endTime-startTime;
                second = (double) estimatedTime/1000;
                System.out.println("LinkedList de 200 sayısını " + second + " saniyede buldu");
            }
        }


    }
}
