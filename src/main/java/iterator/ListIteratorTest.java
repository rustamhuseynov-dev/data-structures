package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kamil");
        list.add("Necesen");
        list.add("Aleykum");
        list.add("Salam");

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            String next = listIterator.next();
            System.out.println(next);
        }

        System.out.println("---------------");

        while (listIterator.hasPrevious()){
            String previous = listIterator.previous();//normal Iteratorda biz geriye dovur ede bilmirik
            System.out.println(previous);//amma listde bu movcuddur
        }
    }
}
