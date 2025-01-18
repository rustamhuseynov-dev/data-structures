package iterator;


import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);


        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer element = iterator.next();
            System.out.println(element);
            list.add(11);  //while daxilinde yeni element elave etdim bu zaman exception bas verir
            System.out.println(element);// Cunki elave etdiyimiz deyer listin copyasidir real deyere tesiri olmur
            // bunun ucunde 11 deyeri elementlerin siyahisiya daxil olmuyacaq.
        }
    }
}
