package collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapTest {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        String i = new String("key");
        String b = new String("key");
        map.put(i,"Mehemmed");
        map.put(b,"Mehemmed");

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put(i,"Rustam");
        hashMap.put(b,"Rustam");

        System.out.println(map.size());
        System.out.println(hashMap.size());
    }
}
